package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Koneksi;
import model.User;
import view.user.View_Panel_User;
public class DAOUser {
    private List<User> list;

    public void insert(User user) {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "INSERT INTO user (id, username, password, role) VALUES (?,?,?,?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, null);
                statement.setString(2, user.getUsername());
                statement.setString(3, user.getPassword());
                statement.setInt(4, user.getRole());
                
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void update(User user) {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "UPDATE user SET id=?, username=?, password=? WHERE id=?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, user.getId());
                statement.setString(2, user.getUsername());
                statement.setString(3, user.getPassword());
                
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void delete(String username) {
         try {
            Connection connection = Koneksi.getConnection();
            String sql = "DELETE FROM user WHERE id=?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);
                
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public int getRole(User user) {      
        try {
            ResultSet result;
            try (Statement statement = Koneksi.getConnection().createStatement()) {
                result = statement.executeQuery("SELECT * FROM user WHERE username = '" + user.getUsername() + "' AND password = '"+user.getPassword()+"'");
                while (result.next()) {  
                    return result.getInt("role");
                }
            }
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public int findUser(User user) {
        try {
            ResultSet result;
            try (Statement statement = Koneksi.getConnection().createStatement()) {
                result = statement.executeQuery("SELECT * FROM user WHERE username = '" + user.getUsername() + "'");
                while (result.next()) {     
                    if (result.getString(2).equals(user.getUsername())) {
                        return result.getInt(1);
                    }
                }
            }
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public boolean havetiket(User user) {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "SELECT * FROM tiket AS t INNER JOIN booking AS b ON t.booking_id = b.id INNER JOIN user AS u ON u.id = b.user_id WHERE u.id = '"+user.getId()+"'";
            
            try (PreparedStatement stmt = connection.prepareStatement(sql)){
                ResultSet rs = stmt.executeQuery(sql);
                
                while(rs.next()) {
                    
                    return true;
                }
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBooking.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public int getMyTiket(User user, View_Panel_User frame) {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "SELECT b.nama_penumpang, b.jumlah_penumpang, j.date, j.bandaraAsal, j.bandaraTujuan, j.kelas FROM tiket AS t "
                    + "INNER JOIN booking AS b ON b.id = t.booking_id "
                    + "INNER JOIN jadwalpenerbangan AS j ON j.id = b.jadwalpenerbangan_id WHERE b.user_id = '"+user.getId()+"'";
            try (PreparedStatement stmt = connection.prepareStatement(sql)){
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    frame.getTxt_namaPemesan().setText(rs.getString(1));
                    frame.getTxt_jumlahKursi().setText(rs.getString(2));
                    frame.getTxt_keberangkatan().setText(rs.getString(3));
                    frame.getTxt_asal().setText(rs.getString(4));
                    frame.getTxt_tujuan().setText(rs.getString(5));
                    frame.getTxt_kelasPenerbangan().setText(rs.getString(6));
                    
                    frame.getTxt_namaPemesan2().setText(rs.getString(1));
                    frame.getTxt_jumlahKursi2().setText(rs.getString(2));
                    frame.getTxt_keberangkatan2().setText(rs.getString(3));
                    frame.getTxt_asal2().setText(rs.getString(4));
                    frame.getTxt_tujuan2().setText(rs.getString(5));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public User getUser(int id) {
        try {
            User user  = new User();
            ResultSet result;
            try (Statement stmt = Koneksi.getConnection().createStatement()) {
                result = stmt.executeQuery("SELECT * FROM user WHERE id ='"+id+"'");
                while (result.next()) {
                    user.setId(result.getInt(1));
                    user.setUsername(result.getString(2));
                    user.setPassword(result.getString(3));
                    user.setRole(result.getInt(4));
                }
            }
            result.close();
            return user;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
