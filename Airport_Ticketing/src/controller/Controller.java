/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.toedter.calendar.JDateChooser;
import dao.DAOBandara;
import dao.DAOBooking;
import dao.DAOBuyTicket;
import dao.DAOPesawat;
import dao.DAOTiket;
import dao.DAOUser;
import dao.DAOjadwalPenerbangan;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.Bandara;
import model.JadwalPenerbangan;
import model.Booking;
import model.Pesawat;
import model.TabelPenerbangan;
import model.Tiket;
import model.User;
import tabel.TabelBandaraModel;
import tabel.TabelJadwalPenebanganModel;
import tabel.TabelPesawatModel;
import tabel.TabelPilihPesawat;
import view.View_Login;
import view.View_Signup;
import view.admin.View_Panel_Admin_NEW;
import view.admin.menu.Admin_Atur_Data_Bandara;
import view.admin.menu.Admin_Atur_Data_Pesawat;
import view.admin.menu.Admin_Atur_Jadwal_Penerbangan;
import view.user.View_Panel_User;
import view.user.View_Panel_User_About;
import view.user.View_Panel_User_IsiDataPenumpang;
import view.user.View_Panel_User_ListPenerbangan;
import view.user.View_Panel_User_ListPenerbangan_NEW;
import view.user.View_Panel_User_RincianHarga;
import view.user.dialog.dialogFrame_Pembayaran_sukses;
import view.user.dialog.dialogFrame_Penerbangan_notFound;

/**
 *
 * @author restu
 */
public class Controller {
    DAOUser da = new DAOUser();
    DAOBuyTicket daoBuyTicket = new DAOBuyTicket();
    DAOBooking daoBooking = new DAOBooking();
    DAOTiket daoTiket = new DAOTiket();
    DAOBandara daoBandara = new DAOBandara();
    DAOPesawat daoPesawat = new DAOPesawat();
    DAOjadwalPenerbangan daoJadwalPenerbangan = new DAOjadwalPenerbangan();
    
    View_Login frame_login;
    View_Panel_User frame_pUser = new View_Panel_User();
    View_Signup frame_signup = new View_Signup();
    View_Panel_User_ListPenerbangan_NEW frame_listPenerbangan = new View_Panel_User_ListPenerbangan_NEW();
    View_Panel_User_IsiDataPenumpang frame_isidata = new View_Panel_User_IsiDataPenumpang();
    View_Panel_User_RincianHarga frame_rincianHarga = new View_Panel_User_RincianHarga();
    View_Panel_User_About frame_pAbout = new View_Panel_User_About();
    
    dialogFrame_Penerbangan_notFound dialog_notfound = new dialogFrame_Penerbangan_notFound();
    dialogFrame_Pembayaran_sukses dialog_bayarSukses = new dialogFrame_Pembayaran_sukses();
    
    View_Panel_Admin_NEW frame_admin = new View_Panel_Admin_NEW();
    Admin_Atur_Data_Bandara frame_bandara = new Admin_Atur_Data_Bandara();
    Admin_Atur_Data_Pesawat frame_pesawat = new Admin_Atur_Data_Pesawat();
    Admin_Atur_Jadwal_Penerbangan frame_jadwalPenerbangan = new Admin_Atur_Jadwal_Penerbangan();
    
    private User user = new User();
    private JadwalPenerbangan jadwal = new JadwalPenerbangan();
    private Booking booking = new Booking();
    
    private int tiketcount = daoTiket.getnotiket();
    private int bookingcount = daoBooking.jumlahbooking();
    public Controller(View_Login v_login) {
        this.frame_login = v_login;
        this.frame_login.setVisible(true);
        v_login.setTitle("TUBES NIH BOUS");
        
        listener Listener = new listener();
        frame_login.addListener(Listener); 
        frame_signup.addListener(Listener);
        frame_pUser.addListener(Listener);
        frame_listPenerbangan.addListener(Listener);
        frame_isidata.addListener(Listener);
        frame_rincianHarga.addListener(Listener);
        frame_pAbout.addListener(Listener);
        
        dialog_notfound.addListener(Listener);
        dialog_bayarSukses.addListener(Listener);
        
        frame_admin.addListener(Listener);
        frame_bandara.addListener(Listener);
        frame_pesawat.addListener(Listener);
        frame_jadwalPenerbangan.addListener(Listener);
    }
    
    class listener implements MouseListener {
        
        @Override
        public void mouseClicked(MouseEvent e) {
        // FRAME LOGIN
            // btn login
            if (e.getComponent() == frame_login.getBtnLogin()) {
                user.setUsername(frame_login.getTxtUsername().getText());
                user.setPassword(frame_login.getTxtPassword().getText());
                login(user);
                System.out.println("LOGIN SEBAGAI "+user.getId()+" "+user.getUsername());
            } 
            // btn signup
            if (e.getComponent() == frame_login.getForSignup()){
                move(frame_login, frame_signup);
            } 
           
           
        // FRAME SIGNUP
            // btn back
            if (e.getComponent() == frame_signup.getBtnBack()) {
                move(frame_signup, frame_login);
            }
            
            // btn signup
            if (e.getComponent() == frame_signup.getBtnSignup()) {
                user.setUsername(frame_signup.getTxtUsername().getText());
                user.setPassword(frame_signup.getTxtPassword().getText());
                String password2 = frame_signup.getTxtPassword1().getText();
                signup(user, password2);
                
            }
            
        // FRAME PANEL USER
            // btn cari penerbangan
            if (e.getComponent() == frame_pUser.getBtnCariPenerbangan()) {
                String cmb1 = (String)frame_pUser.getTxt_dari().getSelectedItem();
                String cmb2 = (String)(String)frame_pUser.getTxt_ke().getSelectedItem();
                Date date = frame_pUser.getTxt_tanggal().getDate();
                
                if (cmb1.equals("-") || cmb2.equals("-") || date == null) {
                    JOptionPane.showMessageDialog(frame_rincianHarga, "Field harus diisi semua");
                } else {
                    System.out.println(cmb1+ cmb2+ date.getTime()+date);
                    List<JadwalPenerbangan> list = daoJadwalPenerbangan.getJadwalPenerbangan(cmb1, cmb2, date);
               
                    if (list.isEmpty()) {
                        move(frame_pUser, dialog_notfound);
                    } else {
                        frame_listPenerbangan.getjTable1().setModel(new TabelPilihPesawat(list));
                        frame_jadwalPenerbangan.clearTextField();
                        move(frame_pUser, frame_listPenerbangan);   
                    }
                }
            }
            // btn my tiket
            if (e.getComponent() == frame_pUser.getBtnMyTicket()) {
                da.getMyTiket(user, frame_pUser);
            }
            // btn about
            if (e.getComponent() == frame_pUser.getBtnAbout()) {
                //frame_pUser.setEnabled(false);
                frame_pAbout.setVisible(true);
                frame_pAbout.setAlwaysOnTop(true);
            }
            
            // btn logout
            if (e.getComponent() == frame_pUser.getBtnHome3()) {
                int dialogBtn = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(frame_pUser, "Anda yakin ingin keluar?", "PERINGATAN", dialogBtn);
                if (dialogResult == 0) {
                    frame_pUser.getDynamicPanel().removeAll();
                    frame_pUser.getDynamicPanel().repaint();
                    frame_pUser.getDynamicPanel().revalidate();

                    // add panel
                    frame_pUser.getDynamicPanel().add(frame_pUser.getDashboardPanel());
                    frame_pUser.getDynamicPanel().repaint();
                    frame_pUser.getDynamicPanel().revalidate();
                    move(frame_pUser, frame_login);
                    
                    frame_login.getTxtPassword().setText(null);
                }else{
                    System.out.println("batal logout");

                }
            }
            
        // FRAME LIST PENERBANGAN
            if (e.getComponent() == frame_listPenerbangan.getBtnPilihPenerbangan()) {
                move(frame_listPenerbangan, frame_isidata);
                
            }
            
            if (e.getComponent() == frame_listPenerbangan.getBtnBack2()) {
                move(frame_listPenerbangan, frame_pUser);
            }
        
        // DIALOG NOTFOUND
            // btn ganti pencarian
            if (e.getComponent() == dialog_notfound.getBtnGantiPencarian()) {
                move(dialog_notfound, frame_pUser);
            }
            
        // FRAME ISI DATA
            if (e.getComponent() == frame_isidata.getBtnSimpanData()) {
                bookingcount = daoBooking.jumlahbooking();
                
                bookingcount++;
                user.setId(da.findUser(user));
                booking = new Booking(bookingcount, jadwal, user, Integer.parseInt((String)frame_pUser.getTxt_penumpang().getSelectedItem()), frame_isidata.getTxt_namaPenumpang().getText(), frame_isidata.getTxt_noHP().getText(), frame_isidata.getTxt_Alamat().getText(), 
                      Integer.parseInt(frame_listPenerbangan.getTxtHarga().getText()));
                daoBooking.insert(booking);
                
                frame_rincianHarga.getTxtHargaTiket().setText(frame_listPenerbangan.getTxtHarga().getText());
                frame_rincianHarga.getTxtSubTotal().setText(Integer.toString(booking.getHarga()));
                frame_rincianHarga.getTxtTotalPenumpang().setText(Integer.toString(booking.getJumlahPenumpang()));
                
                move(frame_isidata, frame_rincianHarga);
            }
            
            if (e.getComponent() == frame_isidata.getBtnBack2()) {
                move(frame_isidata, frame_listPenerbangan);
            }
            
        // FRAME RINCIAN HARGA
            // btn back
            if (e.getComponent() == frame_rincianHarga.getBtnBack2()) {
                move(frame_rincianHarga, frame_isidata);
            } 
                
            // btn bayar
            if (e.getComponent() == frame_rincianHarga.getBtnBayar()) {
                
                if (false) {
                    
                } else {
                    JOptionPane.showMessageDialog(frame_rincianHarga, "Uang anda tidak cukup");
                }
            }
        // DIALOG SUKSES
            if(e.getComponent() == dialog_bayarSukses.getBtnContinue()) {
                
                
                dialog_bayarSukses.setVisible(false);
                frame_rincianHarga.setEnabled(true);
                if(da.havetiket(user)) {
                    frame_pUser.getBtnMyTicket().setEnabled(true);
                }
                move(frame_rincianHarga, frame_pUser);
                
                frame_pUser.getDynamicPanel().removeAll();
                frame_pUser.getDynamicPanel().repaint();
                frame_pUser.getDynamicPanel().revalidate();

                // add panel
                frame_pUser.getDynamicPanel().add(frame_pUser.getDashboardPanel());
                frame_pUser.getDynamicPanel().repaint();
                frame_pUser.getDynamicPanel().revalidate();
            }
            
        // FRAME ABOUT USER
            if (e.getComponent() == frame_pAbout.getBtnClose()) {
                frame_pAbout.setVisible(false);
                frame_pUser.setEnabled(true);     
            } 
         // ========================== ADMIN ===========================
         // FRAME ADMIN
            // btn atur bandara
            if (e.getComponent() == frame_admin.getMenu_Atur_Data_Bandara()) {
                fillTabelBandara();
                move(frame_admin, frame_bandara);
            }
            
            // btn atur pesawat
            if (e.getComponent() == frame_admin.getMenu_Atur_Data_Pesawat()) {
                fillTabelPesawat();
                move(frame_admin, frame_pesawat);
            }
            
            // btn atur jadwal penerbagan
            if (e.getComponent() == frame_admin.getMenu_Atur_Data_Penerbangan()) {
                fillTabelJadwalPenerbangan();
                move(frame_admin, frame_jadwalPenerbangan);
            }
            
            
            if (e.getComponent() == frame_admin.getBtnLogout()) {
                move(frame_admin, frame_login);
            }
            
        // FRAME ATUR BANDARA
            // btn back
            if (e.getComponent() == frame_bandara.getBtnBack()) {
                move(frame_bandara, frame_admin);
            }
            // btn batal
            if (e.getComponent() == frame_bandara.getBtnBatal()) {
                frame_bandara.clearTextField();
            }
            // btn cari
            if (e.getComponent() == frame_bandara.getBtnCari()) {
                fillTabelBandara2(frame_bandara.getTxt_cari_nama_bandara().getText());
            }
            // btn hapus
            if (e.getComponent() == frame_bandara.getBtnHapus()) {
                Bandara bandara = new Bandara(frame_bandara.getTxt_kode_bandara().getText(), frame_bandara.getTxt_nama_bandara().getText());
                daoBandara.delete(bandara, frame_bandara);
                fillTabelBandara();
            }
            // btn refresh
            if (e.getComponent() == frame_bandara.getBtnRefresh()) {
                fillTabelBandara();
            }
            // btn simpan
            if (e.getComponent() == frame_bandara.getBtnSimpan()) {
                Bandara bandara = new Bandara(frame_bandara.getTxt_kode_bandara().getText(), frame_bandara.getTxt_nama_bandara().getText());
                daoBandara.insert(bandara, frame_bandara);
                fillTabelBandara();
            }
            // btn ubah
            if (e.getComponent() == frame_bandara.getBtn_Ubah()) {
                Bandara bandara = new Bandara(frame_bandara.getTxt_kode_bandara().getText(), frame_bandara.getTxt_nama_bandara().getText());
                daoBandara.update(bandara, frame_bandara.getKodeBandara().getText());
                fillTabelBandara();
            }
        // FRAME ATUR PESAWAT
            // btn back
            if (e.getComponent() == frame_pesawat.getBtnBack()) {
                move(frame_pesawat, frame_admin);
            }
            // btn batal
            if (e.getComponent() == frame_pesawat.getBtnBatal()) {
                frame_pesawat.clearTextField();
            }
            // btn cari
            if (e.getComponent() == frame_pesawat.getBtnCari()) {
                fillTabelPesawat2(frame_pesawat.getTxt_cari_nama_pesawat().getText());
            }
            // btn hapus
            if (e.getComponent() == frame_pesawat.getBtnHapus()) {
                Pesawat pesawat = new Pesawat(Integer.parseInt(frame_pesawat.getTxt_id_pesawat().getText()), frame_pesawat.getTxt_kode_pesawat().getText(), frame_pesawat.getTxt_nama_pesawat().getText());
                daoPesawat.delete(pesawat, frame_pesawat);
                fillTabelPesawat();
            }
            // btn refresh
            if (e.getComponent() == frame_pesawat.getBtnRefresh()) {
                fillTabelPesawat();
            }
            // btn simpan
            if (e.getComponent() == frame_pesawat.getBtnSimpan()) {
                Pesawat pesawat = new Pesawat(frame_pesawat.getTxt_kode_pesawat().getText(), frame_pesawat.getTxt_nama_pesawat().getText());
                daoPesawat.insert(pesawat, frame_pesawat);
                fillTabelPesawat();
            }
            // btn ubah
            if (e.getComponent() == frame_pesawat.getBtnUbah()) {
                Pesawat pesawat = new Pesawat(Integer.parseInt(frame_pesawat.getTxt_id_pesawat().getText()), frame_pesawat.getTxt_kode_pesawat().getText(), frame_pesawat.getTxt_nama_pesawat().getText());
                daoPesawat.update(pesawat);
                fillTabelPesawat();
            }
        // FRAME ATUR JADWAL PENERBANGAM
            // btn back
            if (e.getComponent() == frame_jadwalPenerbangan.getBtnBack()) {
                move(frame_jadwalPenerbangan, frame_admin);
            }
            // btn batal
            if (e.getComponent() == frame_jadwalPenerbangan.getBtnBatal()) {
                frame_jadwalPenerbangan.clearTextField();
            }
            // btn cari
            if (e.getComponent() == frame_jadwalPenerbangan.getBtnCari()) {
                fillTabelJadwalPenerbangan2(frame_jadwalPenerbangan.getTxt_cari_nama_pesawat().getText());
            }
            // btn hapus
            if (e.getComponent() == frame_jadwalPenerbangan.getBtnHapus()) {
                JadwalPenerbangan jadwal = getPesawatFromFrameJadwalPenerbangan();
                daoJadwalPenerbangan.delete(jadwal, frame_jadwalPenerbangan);
                fillTabelJadwalPenerbangan();
            }
            // btn refresh
            if (e.getComponent() == frame_jadwalPenerbangan.getBtnRefresh()) {
                fillTabelJadwalPenerbangan();
            }
            // btn simpan
            if (e.getComponent() == frame_jadwalPenerbangan.getBtnSimpan()) {
                JadwalPenerbangan jadwal = getPesawatFromFrameJadwalPenerbangan();
                daoJadwalPenerbangan.insert(jadwal, frame_jadwalPenerbangan);
                fillTabelJadwalPenerbangan();
            }
            // btn ubah
            if (e.getComponent() == frame_jadwalPenerbangan.getBtnUbah()) {
                JadwalPenerbangan jadwal = getPesawatFromFrameJadwalPenerbangan();
                daoJadwalPenerbangan.update(jadwal);
                fillTabelJadwalPenerbangan();
            }
        }
      
        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
           
        }
    }
    
    public void login(User user) {
        user.setRole(da.getRole(user));
        switch (user.getRole()) {
            case 0:
                // ADMIN
                move(frame_login, frame_admin);
                break;
            case 1:
                // CUSTOMER
                user.setId(da.findUser(user));
                JOptionPane.showMessageDialog(frame_login, "Login sebagai "+user.getUsername());
                frame_pUser.getUsername().setText(user.getUsername());
                if(da.havetiket(user)) {
                    frame_pUser.getBtnMyTicket().setEnabled(true);
                } else {
                    frame_pUser.getBtnMyTicket().setEnabled(false);
                }   
                move(frame_login, frame_pUser);
                daoBuyTicket.fillCombobox(frame_pUser.getTxt_ke());
                daoBuyTicket.fillCombobox(frame_pUser.getTxt_dari());
                break;
                
            case 2:
                // KASIR
                break;
            default:
                JOptionPane.showMessageDialog(frame_login, "Username atau Password salah");
                break;
        }
    }
    
    public void signup(User user, String password2) {
        if (da.findUser(user) != -1) {
            JOptionPane.showMessageDialog(frame_signup, "Username sudah digunakan");
            frame_signup.getTxtPassword().setText(null);
            frame_signup.getTxtPassword1().setText(null);
        } else {
            if (!user.getUsername().equals("") && !user.getPassword().equals("") && !password2.equals("")) {
                if (user.getUsername().length() <= 6) {
                    JOptionPane.showMessageDialog(frame_signup, "Username harus lebih dari 6 karakter");
                } else {
                    if(user.getPassword().equals(password2)) {
                        da.insert(user);
                        JOptionPane.showMessageDialog(frame_signup, "Berhasil daftar");
                        frame_signup.getTxtUsername().setText(null);
                        move(frame_signup, frame_login);
                    } else {
                        JOptionPane.showMessageDialog(frame_signup, "Password tidak sama");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(frame_signup, "Field harus diisi semua");
            }
        }
    }
    
    public void move(JFrame from, JFrame to) {
        to.setVisible(true);
        from.setVisible(false);
    }
 
    public void fillTabelBandara() {
        List<Bandara> list = daoBandara.getAllBandara(); 
        frame_bandara.getjTable1().setModel(new TabelBandaraModel(list));
        frame_bandara.clearTextField();
    }
    public void fillTabelBandara2(String nama) {
        List<Bandara> list = daoBandara.getBandara(nama); 
        frame_bandara.getjTable1().setModel(new TabelBandaraModel(list));
        frame_bandara.clearTextField();
    }
    
    public void fillTabelPesawat() {
        List<Pesawat> list = daoPesawat.getAllPesawat(); 
        frame_pesawat.getjTable1().setModel(new TabelPesawatModel(list));
        frame_pesawat.clearTextField();
    }
    
    public void fillTabelPesawat2(String nama) {
        List<Pesawat> list = daoPesawat.getPesawat(nama); 
        frame_pesawat.getjTable1().setModel(new TabelPesawatModel(list));
        frame_pesawat.clearTextField();
    }
    
    public void fillTabelJadwalPenerbangan() {
        List<JadwalPenerbangan> list = daoJadwalPenerbangan.getAllJadwalPenerbangan();
        List<Bandara> bandara = daoBandara.getAllBandara();
        List<Pesawat> pesawat = daoPesawat.getAllPesawat();
        frame_jadwalPenerbangan.fillComboBox(bandara, pesawat);
        frame_jadwalPenerbangan.fillTableJadwalPesawat(new TabelJadwalPenebanganModel(list));
        frame_jadwalPenerbangan.clearTextField();
    }
    
    public void fillTabelJadwalPenerbangan2(String nama) {
        List<JadwalPenerbangan> list = daoJadwalPenerbangan.getJadwalPenerbangan(nama);
        frame_jadwalPenerbangan.fillTableJadwalPesawat(new TabelJadwalPenebanganModel(list));
        frame_jadwalPenerbangan.clearTextField();
    }
    
    public JadwalPenerbangan getPesawatFromFrameJadwalPenerbangan() {
        String s = (String)frame_jadwalPenerbangan.getTxt_bandara_asal().getSelectedItem();
        System.out.println(s);
        Bandara bandaraAsal = daoBandara.getBandaraByKode(s.split(" - ")[0]);
        System.out.println(s.split(" - ")[0]);
        
        s = (String)frame_jadwalPenerbangan.getTxt_bandara_tujuan().getSelectedItem();
        Bandara bandaraTujuan = daoBandara.getBandaraByKode(s.split(" - ")[0]);
        
        
        s = (String)frame_jadwalPenerbangan.getTxt_pesawat().getSelectedItem();
        System.out.println(s+" "+s.split(" - ")[0]);
        
        Pesawat pesawat = daoPesawat.getPesawatByKode(s.split(" - ")[0]);
        System.out.println(pesawat.getKodePesawat());
        
        String kelas = (String)frame_jadwalPenerbangan.getTxt_kelas_penerbangan().getSelectedItem();
        
        int harga = Integer.parseInt(frame_jadwalPenerbangan.getTxt_harga().getText());
        
        Date date = frame_jadwalPenerbangan.getTxt_tanggal_penerbangan().getDate();
        int id = -1;
        try {
            id = Integer.parseInt(frame_jadwalPenerbangan.getTxt_id().getText());
        } catch (Exception e) {
        }
        
        return new JadwalPenerbangan(id, date, bandaraAsal, bandaraTujuan, pesawat, kelas, harga);
        
    }
}