/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.*;
import model.*;
import tabel.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.View_Login;
import view.View_Signup;
import view.admin.View_Panel_Admin_NEW;
import view.admin.menu.Admin_Atur_Data_Bandara;
import view.admin.menu.Admin_Atur_Data_Pesawat;
import view.admin.menu.Admin_Atur_Jadwal_Penerbangan;
import view.kasir.View_Panel_Kasir;
import view.kasir.menu.Kasir_Pembayaran_Cari_ID_Booking;
import view.kasir.menu.Kasir_Pembayaran_Rincian_Pembayaran;
import view.kasir.menu.Invoice;
import view.kasir.menu.Kasir_Transaksi_Pembayaran;
import view.kasir.menu.Kasir_Transaksi_Selesai_LihatTiket;
import view.user.View_Panel_User_Menu_Transaksi;
import view.user.View_Panel_User;
import view.user.View_Panel_User_About;
import view.user.View_Panel_User_IsiDataPenumpang;
import view.user.View_Panel_User_LihatTiket;
import view.user.View_Panel_User_ListPenerbangan;
import view.user.View_Panel_User_RincianHarga;
import view.user.View_Panel_User_pilih_Kursi;
import view.user.dialog.dialogFrame_Pembayaran_sukses;
import view.user.dialog.dialogFrame_Penerbangan_notFound;

/**
 *
 * @author restu
 */
public class Controller {
    DAOUser da = new DAOUser();
    DAOCustomer daoCustomer = new DAOCustomer();
    DAOBooking daoBooking = new DAOBooking();
    DAOTiket daoTiket = new DAOTiket();
    DAOBandara daoBandara = new DAOBandara();
    DAOPesawat daoPesawat = new DAOPesawat();
    DAOjadwalPenerbangan daoJadwalPenerbangan = new DAOjadwalPenerbangan();
    
    View_Login frame_login;
    View_Panel_User frame_pUser = new View_Panel_User();
    View_Signup frame_signup = new View_Signup();
    View_Panel_User_ListPenerbangan frame_listPenerbangan = new View_Panel_User_ListPenerbangan();
    View_Panel_User_IsiDataPenumpang frame_isidata = new View_Panel_User_IsiDataPenumpang();
    View_Panel_User_RincianHarga frame_rincianHarga = new View_Panel_User_RincianHarga();
    View_Panel_User_About frame_pAbout = new View_Panel_User_About();
    View_Panel_User_Menu_Transaksi frame_transaksi = new View_Panel_User_Menu_Transaksi();
    View_Panel_User_LihatTiket frame_UserlihatTiket = new View_Panel_User_LihatTiket();
    
    dialogFrame_Penerbangan_notFound dialog_notfound = new dialogFrame_Penerbangan_notFound();
    dialogFrame_Pembayaran_sukses dialog_bayarSukses = new dialogFrame_Pembayaran_sukses();
    
    View_Panel_Admin_NEW frame_admin = new View_Panel_Admin_NEW();
    Admin_Atur_Data_Bandara frame_bandara = new Admin_Atur_Data_Bandara();
    Admin_Atur_Data_Pesawat frame_pesawat = new Admin_Atur_Data_Pesawat();
    Admin_Atur_Jadwal_Penerbangan frame_jadwalPenerbangan = new Admin_Atur_Jadwal_Penerbangan();
    
    View_Panel_Kasir frame_kasir = new View_Panel_Kasir();
    Kasir_Pembayaran_Cari_ID_Booking frame_pembayaran = new Kasir_Pembayaran_Cari_ID_Booking();
    Kasir_Pembayaran_Rincian_Pembayaran frame_rincianPembayaran = new Kasir_Pembayaran_Rincian_Pembayaran();
    Kasir_Transaksi_Pembayaran frame_transaksiPembayaran = new Kasir_Transaksi_Pembayaran();
    Kasir_Transaksi_Selesai_LihatTiket frame_KasirLihatTiket = new Kasir_Transaksi_Selesai_LihatTiket();
    Invoice invoice = new Invoice();
    
    private User user = new User();
    private JadwalPenerbangan jadwal = new JadwalPenerbangan();
    private Booking booking = new Booking();
    private Customer customer = new Customer();

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
        frame_transaksi.addListener(Listener);
        frame_UserlihatTiket.addListener(Listener);
        
        dialog_notfound.addListener(Listener);
        dialog_bayarSukses.addListener(Listener);
        
        frame_admin.addListener(Listener);
        frame_bandara.addListener(Listener);
        frame_pesawat.addListener(Listener);
        frame_jadwalPenerbangan.addListener(Listener);
        
        frame_kasir.addListener(Listener);
        frame_pembayaran.addListener(Listener);
        frame_rincianPembayaran.addListener(Listener);
        frame_transaksiPembayaran.addListener(Listener);
        frame_KasirLihatTiket.addListener(Listener);
        invoice.addListener(Listener);
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
                user.setRole(1);
                String password2 = frame_signup.getTxtPassword1().getText();
                signup(user, password2);
            }
            
        // FRAME PANEL USER
            // btn cari penerbangan
            if (e.getComponent() == frame_pUser.getBtnCariPenerbangan()) {
                
                if (frame_pUser.validateInput()) {
                    String cmb1 = (String)frame_pUser.getTxt_dari().getSelectedItem();
                    String cmb2 = (String)frame_pUser.getTxt_ke().getSelectedItem();
                    Date date = frame_pUser.getTxt_tanggal();
                    
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
            // btn transaksi
            if (e.getComponent() == frame_pUser.getBtnTransaksi()) {
                List<Booking> tableBooking = daoBooking.getBooking(user);
                if (tableBooking == null) {
                    JOptionPane.showMessageDialog(frame_pUser, "Anda belum melakukan booking pesawat");
                } else {
                    frame_transaksi.fillTabelBooking(new TabelBookingModel(tableBooking));
                    move(frame_pUser, frame_transaksi);
                }
               
            }
            // btn about
            if (e.getComponent() == frame_pUser.getBtnAbout()) {
                frame_pAbout.setVisible(true);
                frame_pAbout.setAlwaysOnTop(true);
            }
            
            // btn logout
            if (e.getComponent() == frame_pUser.getBtnHome3()) {
                logout(frame_pUser);
            }
            
        // FRAME LIST PENERBANGAN
            // btn pilih penerbangan
            if (e.getComponent() == frame_listPenerbangan.getBtnPilihPenerbangan()) {
                if ("".equals(frame_listPenerbangan.getTxtKodePesawat().getText())) {
                    JOptionPane.showMessageDialog(frame_listPenerbangan, "Pilih Pesawat Terlebih Dahulu");
                } else {
                    int id = Integer.parseInt(frame_listPenerbangan.getTxtId().getText());
                    Date date = frame_pUser.getTxt_tanggal();
                    Bandara bandaraAsal = daoBandara.getBandaraByKode((String)frame_pUser.getTxt_dari().getSelectedItem());
                    Bandara bandaraTujuan = daoBandara.getBandaraByKode((String)frame_pUser.getTxt_ke().getSelectedItem());
                    Pesawat pesawat = daoPesawat.getPesawat(Integer.parseInt(frame_listPenerbangan.getTxtId().getText()));
                    String kelas =  frame_listPenerbangan.getTxtKelas().getText();
                    Rupiah harga = new Rupiah(frame_listPenerbangan.getTxtHarga().getText());
                    System.out.println(id);
                    jadwal = new JadwalPenerbangan(id, date, bandaraAsal, bandaraTujuan, pesawat, kelas, harga.getRupiahInt());
                    
                    List<Customer> listCustomer = daoCustomer.getCustomerFromUser(user);
                    // Kalu akun ini ada customer maka text field diisi otomatis
                    if (!listCustomer.isEmpty()) {
                        customer = listCustomer.get(listCustomer.size()-1);
                        frame_isidata.getTxt_Alamat().setText(customer.getAlamat());
                        frame_isidata.getTxt_namaPenumpang().setText(customer.getNama());
                        frame_isidata.getTxt_noHP().setText(customer.getNomor_hp());
                    }
                    move(frame_listPenerbangan, frame_isidata);
                }
            }
            
            // btn back
            if (e.getComponent() == frame_listPenerbangan.getBtnBack2()) {
                move(frame_listPenerbangan, frame_pUser);
                frame_listPenerbangan.getTxtHarga().setText(null);
                frame_listPenerbangan.getTxtId().setText(null);
                frame_listPenerbangan.getTxtKelas().setText(null);
                frame_listPenerbangan.getTxtKodePesawat().setText(null);
                frame_listPenerbangan.getTxtNamaPesawat().setText(null);
            }
        
        // DIALOG NOTFOUND
            // btn ganti pencarian
            if (e.getComponent() == dialog_notfound.getBtnGantiPencarian()) {
                move(dialog_notfound, frame_pUser);
            }
            
        // FRAME ISI DATA
            if (e.getComponent() == frame_isidata.getBtnLanjutkan()) {
                customer = new Customer(user, frame_isidata.getTxt_namaPenumpang().getText(), frame_isidata.getTxt_Alamat().getText(), frame_isidata.getTxt_noHP().getText());
               
                int total_penumpang = Integer.parseInt((String)frame_pUser.getTxt_penumpang().getSelectedItem());
                Rupiah harga_tiket = new Rupiah((String)frame_listPenerbangan.getTxtHarga().getText());
                Rupiah subtotal = new Rupiah(harga_tiket.getRupiahInt()*total_penumpang);
                frame_rincianHarga.setText(total_penumpang, harga_tiket.getRupiahString(), subtotal.getRupiahString());
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
            if (e.getComponent() == frame_rincianHarga.getBtnPergiKasir()) {
                
                if (!daoCustomer.isFound(customer)) {
                    daoCustomer.insert(customer);
                }
                customer = daoCustomer.getCustomer(customer);
                int total_penumpang = Integer.parseInt((String)frame_pUser.getTxt_penumpang().getSelectedItem());
                Rupiah harga_tiket = new Rupiah((String)frame_listPenerbangan.getTxtHarga().getText());
                Rupiah subtotal = new Rupiah(harga_tiket.getRupiahInt()*total_penumpang);
             
                booking = new Booking(jadwal, customer, total_penumpang, subtotal.getRupiahInt());
                daoBooking.insert(booking);
                
                move(frame_rincianHarga, frame_pUser);
                
                frame_pUser.goToDashboard();
                
                frame_pUser.clearAllTxtUser();
                frame_listPenerbangan.clearAllText();
            }
            
        // FRAME ABOUT USER
            if (e.getComponent() == frame_pAbout.getBtnClose()) {
                frame_pAbout.setVisible(false);
                frame_pUser.setEnabled(true);     
            } 
            
        // FRAME TRANSAKSI
            if (e.getComponent() == frame_transaksi.getBtnBack2()) {
                move(frame_transaksi, frame_pUser);
            }
            
            if (e.getComponent() == frame_transaksi.getBtnLihatTiket()) {
                Booking booking2 = new Booking();
                booking2.setId(Integer.parseInt(frame_transaksi.getTxt_id_booking().getText()));
                
                if (daoTiket.paid(booking2)) {
                    booking = daoBooking.getBooking(booking2.getId());
                    frame_UserlihatTiket.getTxt_asal().setText(booking.getJadwal().getBandaraAsal().getKodeBandara()+" - "+booking.getJadwal().getBandaraAsal().getNamaBandara());
                    frame_UserlihatTiket.getTxt_asal2().setText(booking.getJadwal().getBandaraAsal().getKodeBandara()+" - "+booking.getJadwal().getBandaraAsal().getNamaBandara());
                    
                    frame_UserlihatTiket.getTxt_jumlahKursi().setText(Integer.toString(booking.getJumlahPenumpang()));
                    frame_UserlihatTiket.getTxt_jumlahKursi2().setText(Integer.toString(booking.getJumlahPenumpang()));
                    DateFormat df = new SimpleDateFormat("dd MMMMM yyyy");
                    
                    frame_UserlihatTiket.getTxt_keberangkatan().setText(df.format(booking.getJadwal().getDate()));
                    frame_UserlihatTiket.getTxt_keberangkatan2().setText(df.format(booking.getJadwal().getDate()));
                    
                    frame_UserlihatTiket.getTxt_kelasPenerbangan().setText(booking.getJadwal().getKelas());
                    
                    frame_UserlihatTiket.getTxt_namaPemesan().setText(booking.getCustomer().getNama());
                    frame_UserlihatTiket.getTxt_namaPemesan2().setText(booking.getCustomer().getNama());
                    
                    frame_UserlihatTiket.getTxt_tujuan().setText(booking.getJadwal().getBandaraTujuan().getKodeBandara()+" - "+booking.getJadwal().getBandaraTujuan().getNamaBandara());
                    frame_UserlihatTiket.getTxt_tujuan2().setText(booking.getJadwal().getBandaraTujuan().getKodeBandara()+" - "+booking.getJadwal().getBandaraTujuan().getNamaBandara());
                   
                    move(frame_transaksi, frame_UserlihatTiket);
                } else {
                    JOptionPane.showMessageDialog(frame_transaksi, "Tiket belum dibayar. Silahkan bayar di kasir!");
                }
            }
            
        // FRAME LIHAT TIKET
            // btn back
            if (e.getComponent() == frame_UserlihatTiket.getBtnBack()) {
                move(frame_UserlihatTiket, frame_transaksi);
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
                logout(frame_admin);
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
                if (frame_bandara.validateInput()) {
                    Bandara bandara = new Bandara(frame_bandara.getTxt_kode_bandara().getText(), frame_bandara.getTxt_nama_bandara().getText());
                    daoBandara.delete(bandara, frame_bandara);
                    fillTabelBandara();
                }
            }
            // btn refresh
            if (e.getComponent() == frame_bandara.getBtnRefresh()) {
                fillTabelBandara();
            }
            // btn simpan
            if (e.getComponent() == frame_bandara.getBtnSimpan()) {
                if (frame_bandara.validateInput()) {
                    Bandara bandara = new Bandara(frame_bandara.getTxt_kode_bandara().getText(), frame_bandara.getTxt_nama_bandara().getText());
                    daoBandara.insert(bandara, frame_bandara);
                    fillTabelBandara();
                }
                
            }
            // btn ubah
            if (e.getComponent() == frame_bandara.getBtn_Ubah()) {
                if (frame_bandara.validateInput()) {
                    Bandara bandara = new Bandara(frame_bandara.getTxt_kode_bandara().getText(), frame_bandara.getTxt_nama_bandara().getText());
                    daoBandara.update(bandara, frame_bandara.getKodeBandara().getText());
                    fillTabelBandara();
                }
                
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
                if (frame_pesawat.getTxt_id_pesawat().getText() == null) {
                    JOptionPane.showMessageDialog(frame_pesawat, "Pilih pesawat terlebih dahulu");
                }else if (frame_pesawat.validateInput()) {
                    Pesawat pesawat = new Pesawat(Integer.parseInt(frame_pesawat.getTxt_id_pesawat().getText()), frame_pesawat.getTxt_kode_pesawat().getText(), frame_pesawat.getTxt_nama_pesawat().getText());
                    daoPesawat.delete(pesawat, frame_pesawat);
                    fillTabelPesawat();
                }
            }
            // btn refresh
            if (e.getComponent() == frame_pesawat.getBtnRefresh()) {
                fillTabelPesawat();
            }
            // btn simpan
            if (e.getComponent() == frame_pesawat.getBtnSimpan()) {
                if (frame_pesawat.validateInput()) {
                    Pesawat pesawat = new Pesawat(frame_pesawat.getTxt_kode_pesawat().getText(), frame_pesawat.getTxt_nama_pesawat().getText());
                    daoPesawat.insert(pesawat, frame_pesawat);
                    fillTabelPesawat();
                }
            }
            // btn ubah
            if (e.getComponent() == frame_pesawat.getBtnUbah()) {
                if (frame_pesawat.getTxt_id_pesawat().getText()== null) {
                    JOptionPane.showMessageDialog(frame_pesawat, "Pilih pesawat terlebih dahulu");
                }else if (frame_pesawat.validateInput()) {
                    Pesawat pesawat = new Pesawat(Integer.parseInt(frame_pesawat.getTxt_id_pesawat().getText()), frame_pesawat.getTxt_kode_pesawat().getText(), frame_pesawat.getTxt_nama_pesawat().getText());
                    daoPesawat.update(pesawat);
                    fillTabelPesawat();
                }
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
                if(frame_jadwalPenerbangan.getTxt_id().getText() == null) {
                    JOptionPane.showMessageDialog(frame_jadwalPenerbangan, "Pilih jadwal terlebih dahulu");
                } else if(frame_jadwalPenerbangan.validateInput()) {
                    JadwalPenerbangan jadwal = getPesawatFromFrameJadwalPenerbangan();
                    daoJadwalPenerbangan.delete(jadwal, frame_jadwalPenerbangan);
                    fillTabelJadwalPenerbangan();
                }
                
            }
            // btn refresh
            if (e.getComponent() == frame_jadwalPenerbangan.getBtnRefresh()) {
                fillTabelJadwalPenerbangan();
            }
            // btn simpan
            if (e.getComponent() == frame_jadwalPenerbangan.getBtnSimpan()) {
                if (frame_jadwalPenerbangan.validateInput()) {
                    JadwalPenerbangan jadwal = getPesawatFromFrameJadwalPenerbangan();
                    daoJadwalPenerbangan.insert(jadwal, frame_jadwalPenerbangan);
                    fillTabelJadwalPenerbangan();
                }
            }
            // btn ubah
            if (e.getComponent() == frame_jadwalPenerbangan.getBtnUbah()) {
                if(frame_jadwalPenerbangan.getTxt_id().getText() == null) {
                    JOptionPane.showMessageDialog(frame_jadwalPenerbangan, "Pilih jadwal terlebih dahulu");
                } else if(frame_jadwalPenerbangan.validateInput()) {
                    JadwalPenerbangan jadwal = getPesawatFromFrameJadwalPenerbangan();
                    daoJadwalPenerbangan.update(jadwal);
                    fillTabelJadwalPenerbangan();
                }
            }
            
        // ========================== KASIR ===========================
        // FRAME KASIR
            if (e.getComponent() == frame_kasir.getMenu_Pembayaran()) {
                frame_pembayaran.fillTabelBooking(new TabelBookingModel(daoBooking.getBookingNotPaid(daoTiket.getAllTiket())));
                move(frame_kasir, frame_pembayaran);
            }
            
            if (e.getComponent() == frame_kasir.getMenu_Transaksi_Selesai()) {
                frame_transaksiPembayaran.fillTabelBooking(new TabelBookingModel(daoBooking.getBookingByTiket(daoTiket.getAllTiket())));
                move(frame_kasir, frame_transaksiPembayaran);
            }
            
            if (e.getComponent() == frame_kasir.getBtnLogout()) {
                logout(frame_kasir);
            }
            
        // FRAME PEMBAYARAN
            // btn cari booking id
            if (e.getComponent() == frame_pembayaran.getBtnCari()) {
                
                List<Booking> list = daoBooking.getBookingNotPaid(daoTiket.getAllTiket());
                
                boolean ketemu = false;
                for (Booking book : list) {
                    if (book.getId() == Integer.parseInt(frame_pembayaran.getTxt_cari_id_booking().getText())) {
                        
                        frame_pembayaran.getTxt_id_booking().setText(Integer.toString(book.getId()));
                        frame_pembayaran.getTxt_jumlah_penumpang().setText(Integer.toString(book.getJumlahPenumpang()));
                        frame_pembayaran.getTxt_nama_penumpang().setText(book.getCustomer().getNama());
                        frame_pembayaran.getTxt_nomor_hp().setText(book.getCustomer().getNomor_hp());
                        ketemu = true;
                    }
                }
                
                if (!ketemu) {
                    booking = new Booking();
                    JOptionPane.showMessageDialog(frame_pembayaran, "Pesanan Tidak Ditemukan");
                    frame_pembayaran.clearTextField();
                }
            }
            
            // btn lanjutkan bayar
            if (e.getComponent() == frame_pembayaran.getBtnLanjutkanPembayaran()) {
                if (frame_pembayaran.validateInput()) {
                    booking = daoBooking.getBooking(Integer.parseInt(frame_pembayaran.getTxt_id_booking().getText()));
                    move(frame_pembayaran, frame_rincianPembayaran);
                    String harga = new Rupiah(booking.getJadwal().getHarga()).getRupiahString();
                    String subtotal = new Rupiah(booking.getHarga()).getRupiahString();
                    
                    frame_rincianPembayaran.getTxtHargaTiket().setText(harga);
                    frame_rincianPembayaran.getTxtSubTotal().setText(subtotal);
                    frame_rincianPembayaran.getTxtTotalPenumpang().setText(Integer.toString(booking.getJumlahPenumpang()));
                    frame_rincianPembayaran.getTxtUangAnda().setText(null);
                } 
              
            }
            
            // btn back
            if (e.getComponent() == frame_pembayaran.getBtnBack2()) {
                frame_pembayaran.clearTextField();
                move(frame_pembayaran, frame_kasir);
            }
        
        // FRAME RINCIAN PEMBAYARAN
            // btn bayar
            if (e.getComponent() == frame_rincianPembayaran.getBtnBayar()) {
                int uanganda = new Rupiah(frame_rincianPembayaran.getTxtUangAnda().getText()).getRupiahInt();
                int subtotal = new Rupiah(frame_rincianPembayaran.getTxtSubTotal().getText()).getRupiahInt();
                int kembalian = uanganda - subtotal;
                if(kembalian >= 0) {
                    dialog_bayarSukses.setVisible(true);
                    Tiket tiket = new Tiket(booking);
                    daoTiket.insert(tiket);
                } else {
                    JOptionPane.showMessageDialog(frame_rincianPembayaran, "Pembayaran Gagal");
                }
                
            }
            
            // btn back
            if (e.getComponent() == frame_rincianPembayaran.getBtnBack2()) {
                move(frame_rincianPembayaran, frame_pembayaran);
                frame_pembayaran.clearTextField();
            }
            
        // DIALOG PEMBAYARAN BTN print
            if (e.getComponent() == dialog_bayarSukses.getBtnPrint()) {
                invoice.setVisible(true);
                invoice.printStruk(booking, new Rupiah(frame_rincianPembayaran.getTxtUangAnda().getText()).getRupiahInt());
                
            }
            
            if (e.getComponent() == invoice.getBtnTutup()) {
                invoice.dispose();
                move(frame_rincianPembayaran, frame_kasir);
            }
        // FRAME LIST PEMBAYARAN SELESAI
            if (e.getComponent() == frame_transaksiPembayaran.getBtnBack2()) {
                move(frame_transaksiPembayaran, frame_kasir);
            }
            
            if (e.getComponent() == frame_transaksiPembayaran.getBtnLihatTiket()) {
                Booking booking2 = new Booking();
                if ("".equals(frame_transaksiPembayaran.getTxt_id_booking().getText())) {
                    JOptionPane.showMessageDialog(frame_transaksiPembayaran, "Pilih booking terlebih dahulu");
                } else {
                    booking2.setId(Integer.parseInt(frame_transaksiPembayaran.getTxt_id_booking().getText()));
                
                    booking = daoBooking.getBooking(booking2.getId());
                    
                    frame_KasirLihatTiket.getTxt_asal().setText(booking.getJadwal().getBandaraAsal().getKodeBandara()+" - "+booking.getJadwal().getBandaraAsal().getNamaBandara());
                    frame_KasirLihatTiket.getTxt_asal2().setText(booking.getJadwal().getBandaraAsal().getKodeBandara()+" - "+booking.getJadwal().getBandaraAsal().getNamaBandara());

                    frame_KasirLihatTiket.getTxt_jumlahKursi().setText(Integer.toString(booking.getJumlahPenumpang()));
                    frame_KasirLihatTiket.getTxt_jumlahKursi2().setText(Integer.toString(booking.getJumlahPenumpang()));
                    DateFormat df = new SimpleDateFormat("dd MMMMM yyyy");

                    frame_KasirLihatTiket.getTxt_keberangkatan().setText(df.format(booking.getJadwal().getDate()));
                    frame_KasirLihatTiket.getTxt_keberangkatan2().setText(df.format(booking.getJadwal().getDate()));

                    frame_KasirLihatTiket.getTxt_kelasPenerbangan().setText(booking.getJadwal().getKelas());

                    frame_KasirLihatTiket.getTxt_namaPemesan().setText(booking.getCustomer().getNama());
                    frame_KasirLihatTiket.getTxt_namaPemesan2().setText(booking.getCustomer().getNama());

                    frame_KasirLihatTiket.getTxt_tujuan().setText(booking.getJadwal().getBandaraTujuan().getKodeBandara()+" - "+booking.getJadwal().getBandaraTujuan().getNamaBandara());
                    frame_KasirLihatTiket.getTxt_tujuan2().setText(booking.getJadwal().getBandaraTujuan().getKodeBandara()+" - "+booking.getJadwal().getBandaraTujuan().getNamaBandara());

                    move(frame_transaksiPembayaran, frame_KasirLihatTiket);
                }
            }
            
            // FRAME KASIR LIHAT TIKET
            if (e.getComponent() == frame_KasirLihatTiket.getBtnBack()) {
                move(frame_KasirLihatTiket, frame_transaksiPembayaran);
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
        frame_login.getTxtPassword().setText(null);
        switch (user.getRole()) {
            case 0:
                // ADMIN
                move(frame_login, frame_admin);
                break;
            case 1:
                // Customer
                customer.login(user, frame_pUser);
                move(frame_login, frame_pUser);
                break;
                
            case 2:
                // KASIR
                move(frame_login, frame_kasir);
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
        from.dispose();
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
        Bandara bandaraAsal = daoBandara.getBandaraByKode(s.split(" - ")[0]);      
        
        s = (String)frame_jadwalPenerbangan.getTxt_bandara_tujuan().getSelectedItem();
        Bandara bandaraTujuan = daoBandara.getBandaraByKode(s.split(" - ")[0]);
        
        s = (String)frame_jadwalPenerbangan.getTxt_pesawat().getSelectedItem();  
        Pesawat pesawat = daoPesawat.getPesawatByKode(s.split(" - ")[0]);
        
        String kelas = (String)frame_jadwalPenerbangan.getTxt_kelas_penerbangan().getSelectedItem();
        
        int harga = new Rupiah(frame_jadwalPenerbangan.getTxt_harga().getText()).getRupiahInt();
        
        Date date = frame_jadwalPenerbangan.getTxt_tanggal_penerbangan().getDate();
        int id = -1;
        try {
            id = Integer.parseInt(frame_jadwalPenerbangan.getTxt_id().getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return new JadwalPenerbangan(id, date, bandaraAsal, bandaraTujuan, pesawat, kelas, harga); 
    }
    
    
    public void clearAllTextAdmin() {
        
    }
    public void clearAllTextKasir() {
        
    }
    public void logout(JFrame frame) {
        int dialogBtn = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(frame_pUser, "Anda yakin ingin keluar?", "PERINGATAN", dialogBtn);
        
        if (dialogResult == 0) {
            if (frame.getClass() == frame_pUser.getClass()) {
                frame_pUser.goToDashboard();
            }
            move(frame, frame_login);
        } else{
            System.out.println("batal logout");
        }
    }

}