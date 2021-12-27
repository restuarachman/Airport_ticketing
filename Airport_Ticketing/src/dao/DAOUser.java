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
public class DAOUser {
    private List<User> list;

    public void insert(User user) {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "INSERT INTO user (id, username, password) VALUES (?,?,?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, null);
                statement.setString(2, user.getUsername());
                statement.setString(3, user.getPassword());
                
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


    public boolean validate(String username, String password, User user) {      
        try {
            ResultSet result;
            try (Statement statement = Koneksi.getConnection().createStatement()) {
                result = statement.executeQuery("SELECT * FROM user WHERE username = '" + username + "' AND password = '"+password+"'");
                while (result.next()) {     
                    if (result.getString(2).equals(username)  && result.getString(3).equals(password)) {
                        user.setId(result.getInt(1));
                        user.setUsername(result.getString(2));
                        user.setPassword(result.getString(3));
                        return true;
                    }
                }
            }
            result.close();
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
  

    public boolean findUser(String username) {
        try {
            ResultSet result;
            try (Statement statement = Koneksi.getConnection().createStatement()) {
                result = statement.executeQuery("SELECT * FROM user WHERE username = '" + username + "'");
                while (result.next()) {     
                    if (result.getString(2).equals(username)) {
                        
                        return true;
                    }
                }
            }
            result.close();
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
