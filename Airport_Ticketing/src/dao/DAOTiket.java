/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Koneksi;
import model.Tiket;

/**
 *
 * @author restu
 */
public class DAOTiket {
    public void insert(Tiket tiket) {
        System.out.println("NGENTOD");
        try {
            System.out.println("NGENTOD2");
            Connection connection = Koneksi.getConnection();
            String sql = "INSERT INTO tiket VALUES(?,?)";

            try (PreparedStatement stmt = connection.prepareStatement(sql)){
                stmt.setInt(1, tiket.getId());
                stmt.setString(2, tiket.getKodeTiket());
                
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
}
