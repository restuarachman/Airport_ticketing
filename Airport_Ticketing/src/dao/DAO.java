/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.User;
/**
 *
 * @author restu
 */
public interface DAO {
    public void insert(User user);
    public void update(User user);
    public void delete(int id);
}
