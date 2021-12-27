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
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Koneksi;
import model.Booking;

/**
 *
 * @author restu
 */
public class DAOBooking {
    public void insert(Booking booking) {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "INSERT INTO booking VALUES(?,?,?,?,?,?,?,?)";
            try (PreparedStatement stmt = connection.prepareStatement(sql)){
                stmt.setString(1, null);
                stmt.setInt(2, booking.getJadwal().getId());
                stmt.setInt(3, booking.getUser().getId());
                stmt.setInt(4, booking.getJumlahPenumpang());
                stmt.setString(5, booking.getNama_penumpang());
                stmt.setString(6, booking.getNomor_hp());
                stmt.setString(7, booking.getAlamat());
                stmt.setInt(8, booking.getHarga());
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
       
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
