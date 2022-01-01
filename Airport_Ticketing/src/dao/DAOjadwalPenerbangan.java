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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.Koneksi;
import model.Bandara;
import model.JadwalPenerbangan;
import model.Pesawat;

/**
 *
 * @author restu
 */
public class DAOjadwalPenerbangan {
    DAOPesawat daoPesawat = new DAOPesawat();
    DAOBandara daoBandara = new DAOBandara();
    private List<JadwalPenerbangan> list;
    public void insert(JadwalPenerbangan jadwal, JFrame frame) {
        java.sql.Date sqlDate = new java.sql.Date(jadwal.getDate().getTime());
        try { 
            Connection connection = Koneksi.getConnection();
            String sql = "INSERT INTO jadwalpenerbangan VALUES (?,?,?,?,?,?,?)";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, null);
                stmt.setDate(2, sqlDate);
                stmt.setString(3, jadwal.getBandaraAsal().getKodeBandara());
                stmt.setString(4, jadwal.getBandaraTujuan().getKodeBandara());
                stmt.setInt(5, jadwal.getPesawat().getId());
                stmt.setString(6, jadwal.getKelas());
                stmt.setInt(7, jadwal.getHarga());
                
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Tidak Valid");
        }
    }

    public void update(JadwalPenerbangan jadwal) {
        java.sql.Date sqlDate = new java.sql.Date(jadwal.getDate().getTime());
        
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "UPDATE jadwalpenerbangan SET date=?, bandaraAsal=?, bandaraTujuan=?, pesawat_id=?, kelas=?, harga=? WHERE id=?";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                
                stmt.setDate(1, sqlDate);
                stmt.setString(2, jadwal.getBandaraAsal().getKodeBandara());
                stmt.setString(3, jadwal.getBandaraTujuan().getKodeBandara());
              
                stmt.setInt(4, jadwal.getPesawat().getId());
                stmt.setString(5, jadwal.getKelas());
                stmt.setInt(6, jadwal.getHarga());
                stmt.setInt(7, jadwal.getId());
                
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPesawat.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
    public void delete(JadwalPenerbangan jadwal, JFrame frame) {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "DELETE FROM jadwalpenerbangan WHERE id=?";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setInt(1, jadwal.getId());
                
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Tidak Valid");
        }
    }

    public List<JadwalPenerbangan> getJadwalPenerbangan(String nama) {
        list = new ArrayList<>();
        try {
            ResultSet result;
            try (Statement stmt = Koneksi.getConnection().createStatement()) {
                result = stmt.executeQuery("SELECT * FROM jadwalpenerbangan WHERE kelas LIKE '%"+nama+"%'");
                while (result.next()) {
                    JadwalPenerbangan jadwal  = new JadwalPenerbangan();
                    
                    jadwal.setId(result.getInt(1));
                    jadwal.setDate(result.getDate(2));
                   
                    Bandara bandaraAsal = daoBandara.getBandaraByKode(result.getString(3));
                    Bandara bandaraTujuan = daoBandara.getBandaraByKode(result.getString(4));
                    jadwal.setBandaraAsal(bandaraAsal);
                    jadwal.setBandaraTujuan(bandaraTujuan);
                    
                    Pesawat pesawat = daoPesawat.getPesawat(result.getInt(5));
                    jadwal.setPesawat(pesawat);
                    jadwal.setKelas(result.getString(6));
                    jadwal.setHarga(result.getInt(7));
                    
                    list.add(jadwal);
                }
            }
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public List<JadwalPenerbangan> getJadwalPenerbangan(String asal, String tujuan, Date date) {
        list = new ArrayList<>();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        try {
            ResultSet result;
            try (Statement stmt = Koneksi.getConnection().createStatement()) {
                result = stmt.executeQuery("SELECT * FROM jadwalpenerbangan WHERE bandaraAsal='"+asal+"' AND bandaraTujuan='"+tujuan+"' AND date='"+sqlDate+"'");
                while (result.next()) {
                    JadwalPenerbangan jadwal  = new JadwalPenerbangan();
                    
                    jadwal.setId(result.getInt(1));
                    jadwal.setDate(result.getDate(2));
                   
                    Bandara bandaraAsal = daoBandara.getBandaraByKode(result.getString(3));
                    Bandara bandaraTujuan = daoBandara.getBandaraByKode(result.getString(4));
                    jadwal.setBandaraAsal(bandaraAsal);
                    jadwal.setBandaraTujuan(bandaraTujuan);
                    
                    Pesawat pesawat = daoPesawat.getPesawat(result.getInt(5));
                    jadwal.setPesawat(pesawat);
                    jadwal.setKelas(result.getString(6));
                    jadwal.setHarga(result.getInt(7));
                    
                    list.add(jadwal);
                }
            }
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
    public List<JadwalPenerbangan> getAllJadwalPenerbangan() {
        list = new ArrayList<>();
        try {
            ResultSet result;
            try (Statement stmt = Koneksi.getConnection().createStatement()) {
                result = stmt.executeQuery("SELECT * FROM jadwalpenerbangan");
                while (result.next()) {
                    JadwalPenerbangan jadwal  = new JadwalPenerbangan();
                    
                    jadwal.setId(result.getInt(1));
                    jadwal.setDate(result.getDate(2));
                    jadwal.setBandaraAsal(daoBandara.getBandaraByKode(result.getString(3)));
                    jadwal.setBandaraTujuan(daoBandara.getBandaraByKode(result.getString(4)));
                    jadwal.setPesawat(daoPesawat.getPesawat(result.getInt(5)));
                    jadwal.setKelas(result.getString(6));
                    jadwal.setHarga(result.getInt(7));
                    
                    list.add(jadwal);
                }
            }
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public JadwalPenerbangan getJadwalPenerbangan(int id) {
        JadwalPenerbangan jadwal  = new JadwalPenerbangan();
        try {
            ResultSet result;
            try (Statement stmt = Koneksi.getConnection().createStatement()) {
                result = stmt.executeQuery("SELECT * FROM jadwalpenerbangan WHERE id = '"+id+"'");
                while (result.next()) {
                    jadwal.setId(result.getInt(1));
                    jadwal.setDate(result.getDate(2));
                    jadwal.setBandaraAsal(daoBandara.getBandaraByKode(result.getString(3)));
                    jadwal.setBandaraTujuan(daoBandara.getBandaraByKode(result.getString(4)));
                    jadwal.setPesawat(daoPesawat.getPesawat(result.getInt(5)));
                    jadwal.setKelas(result.getString(6));
                    jadwal.setHarga(result.getInt(7));
                }
            }
            result.close();
            return jadwal;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
