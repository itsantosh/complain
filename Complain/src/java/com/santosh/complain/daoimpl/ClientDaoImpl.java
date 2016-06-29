/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.complain.daoimpl;

import com.santosh.complain.entity.Client;
import com.santosh.complain.entity.dao.ClientDao;
import com.santosh.complain.entity.dbutil.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santosh
 */
public class ClientDaoImpl implements ClientDao {

    private DBConnection db = new DBConnection();

    @Override
    public int insert(Client client) throws ClassNotFoundException, SQLException {

        String sql = "INSERT INTO tbl_client(first_name,last_name,email) values(?,?,?)";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, client.getFirstNane());
        stmt.setString(2, client.getLastName());
        stmt.setString(3, client.getEmail());

        int result = db.executeUpdate(stmt);
        db.close();
        return result;

    }

    @Override
    public int update(Client client) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Client getById(int id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Client> getAll() throws ClassNotFoundException, SQLException {
        List<Client> clientList = new ArrayList<>();
        String sql = "SELECT *FROM tbl_client";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        ResultSet rs = db.executeQuery(stmt);
        while (rs.next()) {
            Client client = new Client();
            client.setId(rs.getInt("id"));
            client.setFirstName("first_name");
            client.setLastName("last_name");
            client.setEmail("email");
            clientList.add(client);

        }
        db.close();

        return clientList;
    }

}
