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
import koneksi.Koneksi;
import model.Customer;
import model.User;

/**
 *
 * @author restu
 */
public class DAOCustomer {
    private DAOUser daoUser = new DAOUser();
    private List<Customer> list;
    
    public void insert(Customer customer) {
        try { 
            Connection connection = Koneksi.getConnection();
            String sql = "INSERT INTO customer VALUES (?,?,?,?,?)";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, null);
                stmt.setInt(2, customer.getUserId());
                stmt.setString(3, customer.getNama());
                stmt.setString(4, customer.getAlamat());
                stmt.setString(5, customer.getNomor_hp());
                
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void update(Customer customer) {
        
    }
   
    public void delete(Customer customer) {
        
    }

    public List<Customer> getCustomer(String nama) {
        return null;
    }
    
    public Customer getCustomer(Customer customer) {
        try {
            ResultSet rs;
            try (Statement stmt = Koneksi.getConnection().createStatement()) {
                rs = stmt.executeQuery("SELECT * FROM customer WHERE user_id='"+customer.getUserId()+"' AND nama='"+customer.getNama()+"' AND alamat='"+customer.getAlamat()+"' AND nomor_hp='"+customer.getNomor_hp()+"'");
                while (rs.next()) {
                    customer = new Customer(daoUser.getUser(rs.getInt(2)));
                    customer.setId(rs.getInt(1));
                    customer.setNama(rs.getString(3));
                    customer.setAlamat(rs.getString(4));
                    customer.setNomor_hp(rs.getString(5));
                }
            }
            rs.close();
            return customer;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Customer getCustomer(int id) {
        Customer customer = new Customer();
        try {
            ResultSet rs;
            try (Statement stmt = Koneksi.getConnection().createStatement()) {
                rs = stmt.executeQuery("SELECT * FROM customer WHERE id='"+id+"'");
                while (rs.next()) {
                    customer = new Customer(daoUser.getUser(rs.getInt(2)));
                    customer.setId(rs.getInt(1));
                    customer.setNama(rs.getString(3));
                    customer.setAlamat(rs.getString(4));
                    customer.setNomor_hp(rs.getString(5));
                }
            }
            rs.close();
            return customer;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int getnocustomer() {
        try {
            Connection connection = Koneksi.getConnection();
            String sql = "SELECT id FROM customer ORDER BY id DESC";
            
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
    public List<Customer> getAllCustomer() {
        return null;
    }
    
    public List<Customer> getCustomerFromUser(User user) {
        ArrayList list = new ArrayList();
        
        try {
            ResultSet rs;
            try (Statement stmt = Koneksi.getConnection().createStatement()) {
                rs = stmt.executeQuery("SELECT * FROM customer WHERE user_id='"+user.getId()+"'");
                while (rs.next()) {
                    Customer customer = new Customer();
                    customer = new Customer(daoUser.getUser(rs.getInt(2)));
                    customer.setId(rs.getInt(1));
                    customer.setNama(rs.getString(3));
                    customer.setAlamat(rs.getString(4));
                    customer.setNomor_hp(rs.getString(5));
                    
                    list.add(customer);
                }
            }
            rs.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean isFound(Customer customer) {
        try {
            ResultSet rs;
            try (Statement stmt = Koneksi.getConnection().createStatement()) {
                rs = stmt.executeQuery("SELECT * FROM customer WHERE user_id='"+customer.getUserId()+"' AND nama='"+customer.getNama()+"' AND alamat='"+customer.getAlamat()+"' AND nomor_hp='"+customer.getNomor_hp()+"'");
                while (rs.next()) {
                    return true;
                }
            }
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
