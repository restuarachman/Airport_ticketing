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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Koneksi;
import model.Booking;
import model.Tiket;

/**
 *
 * @author restu
 */
public class DAOTiket {
    private DAOBooking daoBooking = new DAOBooking();
    public void insert(Tiket tiket) {
        
        try {
           
            Connection connection = Koneksi.getConnection();
            String sql = "INSERT INTO tiket VALUES(?,?,?)";
            System.out.println(tiket.getId()+" "+tiket.getKodeTiket()+" "+tiket.getBooking().getId());
            try (PreparedStatement stmt = connection.prepareStatement(sql)){
                stmt.setInt(1, tiket.getId());
                stmt.setString(2, tiket.getKodeTiket());
                stmt.setInt(3, tiket.getBooking().getId());
                
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getnotiket() {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "SELECT id FROM tiket ORDER BY id DESC";
            
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
    
    public boolean paid(Booking booking) {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "SELECT * FROM tiket WHERE booking_id='"+booking.getId()+"'";
            try (PreparedStatement stmt = connection.prepareStatement(sql)){
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public List<Tiket> getAllTiket() {
        List<Tiket> list = new ArrayList();
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "SELECT * FROM tiket";
            try (PreparedStatement stmt = connection.prepareStatement(sql)){
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    Tiket tiket = new Tiket();
                    
                    tiket.setId(rs.getInt(1));
                    tiket.setKodeTiket(rs.getString(2));
                    tiket.setBooking(daoBooking.getBooking(rs.getInt(3)));
                    
                    list.add(tiket);
                }
                rs.close();
                return list;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
