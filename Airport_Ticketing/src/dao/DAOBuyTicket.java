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
import java.util.Date;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;

import koneksi.Koneksi;
import model.Bandara;
import model.User;

/**
 *
 * @author restu
 */
public class DAOBuyTicket {

    public void insert(Bandara bandara) {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "INSERT INTO bandara VALUES(?,?,?)";
            try (PreparedStatement stmt = connection.prepareStatement(sql)){
                stmt.setString(1, null);
                stmt.setString(2, bandara.getKodeBandara());
                stmt.setString(3, bandara.getNamaBandara());
                
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public void update(User user) {
        
    }


    public void delete() {
        
    }


    public void fillCombobox(JComboBox cmb) {
        try {
            ResultSet result;
            cmb.addItem("-");
            try (Statement statement = Koneksi.getConnection().createStatement()) {
                result = statement.executeQuery("SELECT * FROM bandara");
                while (result.next()) {     
                    cmb.addItem(result.getString("kodeBandara"));
                }
            }
            result.close();
          
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    
    public List<String> cariPesawat(String from,String to, Date date) {
        List<String> pesawat = new ArrayList();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        System.out.println(from + " DFDFDF ");
        try (Statement statement = Koneksi.getConnection().createStatement()) {
            ResultSet result = statement.executeQuery("SELECT * FROM jadwalpenerbangan WHERE bandaraAsal = '"+from+"'");
            System.out.println(result);
            while (result.next()) {    
                pesawat.add(result.getString(5));
            }
            
            result.close();
        } catch ( SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pesawat;
    }
    
    public void fillJlistPesawat(JList list_pesawat, List<String> pesawat) {
        final DefaultListModel model = new DefaultListModel();
        pesawat.forEach((str) -> {
            model.addElement(str);
        });

        list_pesawat.setModel(model);
    }
}
