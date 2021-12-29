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
import dao.DAOTiket;
import dao.DAOUser;

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
import model.TabelPenerbangan;
import model.Tiket;
import model.User;
import tabel.TabelBandaraModel;
import view.View_Login;
import view.View_Signup;
import view.admin.View_Panel_Admin_NEW;
import view.admin.menu.Admin_Atur_Data_Bandara;
import view.admin.menu.Admin_Atur_Data_Pesawat;
import view.user.View_Panel_User;
import view.user.View_Panel_User_About;
import view.user.View_Panel_User_IsiDataPenumpang;
import view.user.View_Panel_User_ListPenerbangan;
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
    
    View_Login frame_login;
    View_Panel_User frame_pUser = new View_Panel_User();
    View_Signup frame_signup = new View_Signup();
    View_Panel_User_ListPenerbangan frame_listPenerbangan = new View_Panel_User_ListPenerbangan();
    View_Panel_User_IsiDataPenumpang frame_isidata = new View_Panel_User_IsiDataPenumpang();
    View_Panel_User_RincianHarga frame_rincianHarga = new View_Panel_User_RincianHarga();
    View_Panel_User_About frame_pAbout = new View_Panel_User_About();
    
    dialogFrame_Penerbangan_notFound dialog_notfound = new dialogFrame_Penerbangan_notFound();
    dialogFrame_Pembayaran_sukses dialog_bayarSukses = new dialogFrame_Pembayaran_sukses();
    
    View_Panel_Admin_NEW frame_admin = new View_Panel_Admin_NEW();
    Admin_Atur_Data_Bandara frame_bandara = new Admin_Atur_Data_Bandara();
    Admin_Atur_Data_Pesawat frame_pesawat = new Admin_Atur_Data_Pesawat();
    
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
                Date utilDate = frame_pUser.getTxt_tanggal().getDate();
                
                if (cmb1.equals("-") || cmb2.equals("-") || utilDate == null) {
                    JOptionPane.showMessageDialog(frame_rincianHarga, "Field harus diisi semua");
                } else {
                    jadwal.setBandaraAsal(cmb1);
                    jadwal.setBandaraTujuan(cmb2);
                    jadwal.setDate(utilDate);
                    List<TabelPenerbangan> tabel_penerbangan = daoBuyTicket.cariPesawat(frame_listPenerbangan, (String)frame_pUser.getTxt_dari().getSelectedItem(), (String)frame_pUser.getTxt_ke().getSelectedItem(), utilDate);
                    DefaultListModel addlist = new DefaultListModel();

                    for (TabelPenerbangan terbang : tabel_penerbangan) {
                        addlist.addElement(terbang.getKodePesawat()+"\t "+terbang.getNamaPesawat()+"\t "+terbang.getKelas()+"\t "+terbang.getHarga());
                    }

                    frame_listPenerbangan.getList_pesawat().setModel(addlist);
                    frame_listPenerbangan.getList_pesawat().addListSelectionListener(new ListSelectionListener() {
                        @Override
                        public void valueChanged(ListSelectionEvent e) {
                            if (!e.getValueIsAdjusting()) {
                                TabelPenerbangan selected = tabel_penerbangan.get(frame_listPenerbangan.getList_pesawat().getSelectedIndex());
                                frame_listPenerbangan.getTxtKodePesawat().setText(selected.getKodePesawat());
                                frame_listPenerbangan.getTxtNamaPesawat().setText(selected.getNamaPesawat());
                                frame_listPenerbangan.getTxtHarga().setText(Integer.toString(selected.getHarga()));
                                frame_listPenerbangan.getTxtKelas().setText(selected.getKelas());

                                jadwal.setHarga(selected.getHarga());
                                jadwal.setId(selected.getId());
                            }
                        }
                    });
                    if (tabel_penerbangan.isEmpty()) {
                        move(frame_pUser, dialog_notfound);
                    } else {

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
                move(frame_pUser, frame_listPenerbangan);
                
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
                System.out.println("KONTOL "+user.getId());
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
                
                System.out.println(Integer.parseInt(frame_rincianHarga.getTxtUangAnda().getText()) - Integer.parseInt(frame_rincianHarga.getTxtSubTotal().getText()));
                if (Integer.parseInt(frame_rincianHarga.getTxtUangAnda().getText()) - Integer.parseInt(frame_rincianHarga.getTxtSubTotal().getText()) > 0) {
                    tiketcount = daoTiket.getnotiket();
                    tiketcount++;
                    Tiket tiket = new Tiket(tiketcount, user, booking);
                    System.out.println(tiket.getId()+" "+ tiket.getKodeTiket());
                    daoTiket.insert(tiket);
                
                    dialog_bayarSukses.setVisible(true);
                    frame_rincianHarga.setEnabled(false);
                    
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
                move(frame_admin, frame_pesawat);
            }
            
            /*// btn atur jadwal penerbagan
            if (e.getComponent() == frame_jadwalPenerbangan.) {
                move(frame_admin, frame_jadwalPenerbangan);
            }
            */
            
            if (e.getComponent() == frame_admin.getBtnLogout()) {
                move(frame_admin, frame_login);
            }
            
        // FRAME BANDARA
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
 
    public void getDate(JDateChooser gdate) {
        gdate.getDate();
    }
    
    public void fillTabelBandara() {
        List<Bandara> list = daoBandara.getAllBandara(); 
        System.out.println(frame_bandara.getjTable1().getColumnCount());
        frame_bandara.getjTable1().setModel(new TabelBandaraModel(list));
        frame_bandara.clearTextField();
    }
    public void fillTabelBandara2(String nama) {
        List<Bandara> list = daoBandara.getBandara(nama); 
        System.out.println(frame_bandara.getjTable1().getColumnCount());
        frame_bandara.getjTable1().setModel(new TabelBandaraModel(list));
        frame_bandara.clearTextField();
    }
}