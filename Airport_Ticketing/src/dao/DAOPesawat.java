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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import koneksi.Koneksi;
import model.Pesawat;
import view.admin.menu.Admin_Atur_Data_Pesawat;

/**
 *
 * @author restu
 */
public class DAOPesawat {
    private List<Pesawat> list;
    public void insert(Pesawat pesawat, Admin_Atur_Data_Pesawat frame) {
        try { 
            Connection connection = Koneksi.getConnection();
            String sql = "INSERT INTO pesawat VALUES (?,?,?)";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, null);
                stmt.setString(2, pesawat.getKodePesawat());
                stmt.setString(3, pesawat.getNamaPesawat());
                
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Tidak Valid");
        }
        
    }

    public void update(Pesawat pesawat) {
        try {
            Connection connection = Koneksi.getConnection();
            
            String sql = "UPDATE pesawat SET kodePesawat=?, namaPesawat=? WHERE id=?";
            
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, pesawat.getKodePesawat());
                stmt.setString(2, pesawat.getNamaPesawat());
                stmt.setInt(3, pesawat.getId());
                
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPesawat.class.getName()).log(Level.SEVERE, null, ex);
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

    public List<Pesawat> getPesawat(String nama) {
        list = new ArrayList<>();
        try {
            ResultSet result;
            try (Statement stmt = Koneksi.getConnection().createStatement()) {
                result = stmt.executeQuery("SELECT * FROM pesawat WHERE namaPesawat LIKE '%" + nama + "%'");
                while (result.next()) {
                    Pesawat pesawat  = new Pesawat();
                    
                    pesawat.setId(result.getInt(1));
                    pesawat.setKodePesawat(result.getString(2));
                    pesawat.setNamaPesawat(result.getString(3));
                    
                    list.add(pesawat);
                }
            }
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Pesawat getPesawat(int id) {
        Pesawat pesawat  = new Pesawat();
        try {
            ResultSet result;
            try (Statement stmt = Koneksi.getConnection().createStatement()) {
                result = stmt.executeQuery("SELECT * FROM pesawat WHERE id="+id+"");
                while (result.next()) {
                    pesawat.setId(result.getInt(1));
                    pesawat.setKodePesawat(result.getString(2));
                    pesawat.setNamaPesawat(result.getString(3));
                }
            }
            result.close();
            return pesawat;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Pesawat getPesawatByKode(String kode) {
        Pesawat pesawat  = new Pesawat();
        try {
            ResultSet result;
            try (Statement stmt = Koneksi.getConnection().createStatement()) {
                result = stmt.executeQuery("SELECT * FROM pesawat WHERE kodePesawat='"+kode+"'");
                while (result.next()) {
                    pesawat.setId(result.getInt(1));
                    pesawat.setKodePesawat(result.getString(2));
                    pesawat.setNamaPesawat(result.getString(3));
                }
            }
            result.close();
            return pesawat;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
    public List<Pesawat> getAllPesawat() {
        list = new ArrayList<>();
        try {
            ResultSet result;
            try (Statement stmt = Koneksi.getConnection().createStatement()) {
                result = stmt.executeQuery("SELECT * FROM pesawat");
                while (result.next()) {
                    Pesawat pesawat  = new Pesawat();
                    
                    pesawat.setId(result.getInt(1));
                    pesawat.setKodePesawat(result.getString(2));
                    pesawat.setNamaPesawat(result.getString(3));
                    
                    list.add(pesawat);
                }
            }
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
