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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import koneksi.Koneksi;
import model.Bandara;
import model.JadwalPenerbangan;
import model.Pesawat;
import model.TabelPenerbangan;
import model.User;
import sun.security.rsa.RSACore;
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
 
    public List<TabelPenerbangan> cariPesawat(View_Panel_User_ListPenerbangan frame, String from,String to, Date date) {
        
        List<TabelPenerbangan> tabel_penerbangan = new ArrayList();
        DefaultListModel addlist = new DefaultListModel();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        System.out.println(from + " DFDFDF ");
        try (Statement statement = Koneksi.getConnection().createStatement()) {
            ResultSet result = statement.executeQuery("SELECT p.kodePesawat, p.namaPesawat, j.kelas, j.harga FROM jadwalpenerbangan AS j INNER JOIN pesawat AS p ON p.id = j.pesawat_id "
                    + "WHERE j.bandaraAsal = '"+from+"'");
            // ResultSet result = statement.executeQuery("SELECT pesawat.jadwalpenerbangan FROM jadwalpenerbangan WHERE bandaraAsal = '"+from+"'");
            
            while (result.next()) {  
                System.out.println(result.getString(1)+ result.getString(2)+ result.getString(3)+ result.getInt(4));
                TabelPenerbangan jadwal = new TabelPenerbangan(result.getString(1), result.getString(2), result.getString(3), result.getInt(4));
                
                addlist.addElement(result.getString(1)+"\t "+result.getString(2)+"\t "+result.getString(3)+"\t "+result.getInt(4));
                tabel_penerbangan.add(jadwal);
            }
            
            result.close();
            frame.getList_pesawat().setModel(addlist);
            
            frame.getList_pesawat().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (!e.getValueIsAdjusting()) {
                        TabelPenerbangan selected = tabel_penerbangan.get(frame.getList_pesawat().getSelectedIndex());
                        frame.getTxtKodePesawat().setText(selected.getKodePesawat());
                        frame.getTxtNamaPesawat().setText(selected.getNamaPesawat());
                        frame.getTxtHarga().setText(Integer.toString(selected.getHarga()));
                        frame.getTxtKelas().setText(selected.getKelas());
                    }
                }
            });
        } catch ( SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabel_penerbangan;
    }
    
   
}
