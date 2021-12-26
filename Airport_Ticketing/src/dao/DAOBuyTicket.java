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
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import koneksi.Koneksi;
import model.Bandara;
import model.Pesawat;
import model.User;
import view.user.View_Panel_User_ListPenerbangan;

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
            
            while (result.next()) {  
                
                pesawat.add(result.getString(5));
            }
            
            result.close();
        } catch ( SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pesawat;
    }
    
    private ArrayList<Pesawat> arrPesawat = new ArrayList<>();
    public ArrayList<Pesawat> fillTabelPesawat(View_Panel_User_ListPenerbangan frame, List<String> list_pesawat) {
        String in = list_pesawat.get(0);
        for (int i = 1; i< list_pesawat.size(); i++) {
            in+=", "+list_pesawat.get(i);
        }
       
        DefaultListModel addlist = new DefaultListModel();

        try {
            ResultSet result;
            
            try (Statement stmt = Koneksi.getConnection().createStatement()) {
                result = stmt.executeQuery("SELECT * FROM pesawat WHERE id IN ("+in+")");
                while(result.next()) {

                    
                    arrPesawat.add(new Pesawat(result.getString(2), result.getString(3)));
                    addlist.addElement(result.getString(2)+"    "+result.getString(3));
                }
            }

            result.close();
            frame.getList_pesawat().setModel(addlist);
            
            frame.getList_pesawat().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (!e.getValueIsAdjusting()) {
                        Pesawat selected = arrPesawat.get(frame.getList_pesawat().getSelectedIndex());
                        frame.getTxtKodePesawat().setText(selected.getKodePesawat());
                        frame.getTxtNamaPesawat().setText(selected.getNamaPesawat());
                     
                    }
                }
            });
            return arrPesawat;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
