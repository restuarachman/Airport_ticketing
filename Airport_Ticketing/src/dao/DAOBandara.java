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
import model.Bandara;
import koneksi.Koneksi;
import view.admin.menu.Admin_Atur_Data_Bandara;

/**
 *
 * @author restu
 */
public class DAOBandara {
    private List<Bandara> list;
    public void insert(Bandara bandara, Admin_Atur_Data_Bandara frame) {
        try { 
            Connection connection = Koneksi.getConnection();
            String sql = "INSERT INTO bandara VALUES (?,?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, bandara.getKodeBandara());
                statement.setString(2, bandara.getNamaBandara());
                
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Tidak Valid");
        }
        
    }

    public void update(Bandara bandara, String old) {
        try {
            Connection connection = Koneksi.getConnection();
            
            String sql = "UPDATE bandara SET kodeBandara=?, namaBandara=? WHERE kodeBandara=?";
            
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, bandara.getKodeBandara());
                statement.setString(2, bandara.getNamaBandara());
                statement.setString(3, old);
                
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBandara.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
    public void delete(Bandara bandara, Admin_Atur_Data_Bandara frame) {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "DELETE FROM bandara WHERE kodeBandara=? AND namaBandara=?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, bandara.getKodeBandara());
                statement.setString(2, bandara.getNamaBandara());
                
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Tidak Valid");
        }
    }

    public List<Bandara> getBandara(String nama) {
        list = new ArrayList<>();
        try {
            ResultSet result;
            try (Statement statement = Koneksi.getConnection().createStatement()) {
                result = statement.executeQuery("SELECT * FROM bandara WHERE namaBandara LIKE '%" + nama + "%'");
                while (result.next()) {
                    Bandara bandara  = new Bandara();
                    // id, Source, SrcDesc, OSlot, Sink, SinkDesc
                    bandara.setKodeBandara(result.getString(1));
                    bandara.setNamaBandara(result.getString(2));
                    
                    list.add(bandara);
                }
            }
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
    public List<Bandara> getAllBandara() {
        list = new ArrayList<>();
        try {
            ResultSet result;
            try (Statement statement = Koneksi.getConnection().createStatement()) {
                result = statement.executeQuery("SELECT * FROM bandara");
                while (result.next()) {
                    Bandara bandara  = new Bandara();
                    // id, Source, SrcDesc, OSlot, Sink, SinkDesc
                    bandara.setKodeBandara(result.getString(1));
                    bandara.setNamaBandara(result.getString(2));
                    
                    list.add(bandara);
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
