/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import koneksi.Koneksi;
import model.Booking;
import model.Pesawat;
import view.admin.menu.Admin_Atur_Data_Pesawat;

/**
 *
 * @author restu
 */
public class DAOBooking {
    private DAOjadwalPenerbangan daoJadwalPenerbangan = new DAOjadwalPenerbangan();
    private DAOCustomer daoCustomer = new DAOCustomer();
    public void insert(Booking booking) {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "INSERT INTO booking VALUES(?,?,?,?,?)";
            try (PreparedStatement stmt = connection.prepareStatement(sql)){
                stmt.setString(1, null);
                stmt.setInt(2, booking.getJadwal().getId());
                stmt.setInt(3, booking.getCustomer().getId());
                stmt.setInt(4, booking.getJumlahPenumpang());
                stmt.setInt(5, booking.getHarga());
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public void delete(Pesawat pesaawat, Admin_Atur_Data_Pesawat frame) {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "DELETE FROM pesawat WHERE id=?";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setInt(1, pesaawat.getId());
                
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Tidak Valid");
        }
    }

    public Booking getBooking(int id) {
        Booking booking  = new Booking();
        try {
            ResultSet result;
            try (Statement stmt = Koneksi.getConnection().createStatement()) {
                result = stmt.executeQuery("SELECT * FROM booking WHERE id='"+id+"'");
                while (result.next()) {   
                    booking.setId(result.getInt(1));
                    booking.setJadwal(daoJadwalPenerbangan.getJadwalPenerbangan(result.getInt(2)));
                    booking.setCustomer(daoCustomer.getCustomer(result.getInt(3)));
                    booking.setJumlahPenumpang(result.getInt(4));
                    booking.setHarga(result.getInt(5));
                }
            }
            result.close();
            return booking;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int jumlahbooking() {
         try {
            Connection connection = Koneksi.getConnection();
            String sql = "SELECT id FROM booking ORDER BY id DESC";
            
            try (PreparedStatement stmt = connection.prepareStatement(sql)){
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    return rs.getInt(1);
                }
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
