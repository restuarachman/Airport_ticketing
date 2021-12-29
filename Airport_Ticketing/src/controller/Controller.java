/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.toedter.calendar.JDateChooser;
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
import model.JadwalPenerbangan;
import model.Booking;
import model.TabelPenerbangan;
import model.Tiket;
import model.User;
import view.View_Login;
import view.View_Signup;
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
    
    View_Login frame_login;
    View_Panel_User frame_pUser = new View_Panel_User();
    View_Signup frame_signup = new View_Signup();
    View_Panel_User_ListPenerbangan frame_listPenerbangan = new View_Panel_User_ListPenerbangan();
    View_Panel_User_IsiDataPenumpang frame_isidata = new View_Panel_User_IsiDataPenumpang();
    View_Panel_User_RincianHarga frame_rincianHarga = new View_Panel_User_RincianHarga();
    View_Panel_User_About frame_pAbout = new View_Panel_User_About();
    
    dialogFrame_Penerbangan_notFound dialog_notfound = new dialogFrame_Penerbangan_notFound();
    dialogFrame_Pembayaran_sukses dialog_bayarSukses = new dialogFrame_Pembayaran_sukses();
    
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
                Date utilDate = frame_pUser.getTxt_tanggal().getDate();
                
                jadwal.setBandaraAsal((String)frame_pUser.getTxt_dari().getSelectedItem());
                jadwal.setBandaraTujuan((String)frame_pUser.getTxt_ke().getSelectedItem());
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
                
                //daoBooking.insert(user, jadwal, Integer.parseInt((String)frame_pUser.getTxt_penumpang().getSelectedItem()));
                move(frame_listPenerbangan, frame_isidata);
            }
        
        // DIALOG NOTFOUND
            // btn ganti pencarian
            if (e.getComponent() == dialog_notfound.getBtnGantiPencarian()) {
                move(dialog_notfound, frame_pUser);
            }
            
        // FRAME ISI DATA
            if (e.getComponent() == frame_isidata.getBtnSimpanData()) {
                bookingcount++;
                booking = new Booking(bookingcount, jadwal, user, Integer.parseInt((String)frame_pUser.getTxt_penumpang().getSelectedItem()), frame_isidata.getTxt_namaPenumpang().getText(), frame_isidata.getTxt_noHP().getText(), frame_isidata.getTxt_Alamat().getText(), 
                      Integer.parseInt(frame_listPenerbangan.getTxtHarga().getText()));
                daoBooking.insert(booking);
                
                frame_rincianHarga.getTxtHargaTiket().setText(frame_listPenerbangan.getTxtHarga().getText());
                frame_rincianHarga.getTxtSubTotal().setText(Integer.toString(booking.getHarga()));
                frame_rincianHarga.getTxtTotalPenumpang().setText(Integer.toString(booking.getJumlahPenumpang()));
                
                move(frame_isidata, frame_rincianHarga);
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
        boolean valid = da.validate(user);
        if (valid) {                  
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
        } else {
            JOptionPane.showMessageDialog(frame_login, "Username atau Password salah");
        }
    }
    
    public void signup(User user, String password2) {
        if (da.findUser(user)) {
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
}