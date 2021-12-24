package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Koneksi;
import model.User;
public class DAOUser implements DAO {

    @Override
    public void insert(User user) {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "INSERT INTO airport_ticketing (id, username, password) VALUES (?,?,?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, null);
                statement.setString(2, user.getUsername());
                statement.setString(3, user.getPassword());
                
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(User user) {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "UPDATE airport_ticketing SET id=?, username=?, password=? WHERE id=?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, user.getId());
                statement.setString(2, user.getUsername());
                statement.setString(3, user.getPassword());
                
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
         try {
            Connection connection = Koneksi.getConnection();
            String sql = "DELETE FROM segment WHERE id=?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
