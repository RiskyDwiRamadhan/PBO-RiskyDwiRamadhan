/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Customer extends User{
    private String status;

    public Customer() {
    }

    
    @Override
    public void setStatus(String status) {
        this.status = "Customer";
    }

    
    @Override
    public String getStatus() {
        return status;
    }

    public Customer getById(int id){
        Customer user = new Customer();
        ResultSet rs = DBHelper.selectQuery("select * from user where id = '"+id+"'");
        try {
            while (rs.next()) {
                user = new Customer();
                
                user.setId(rs.getInt("id"));
                user.setNama(rs.getString("nama"));
                user.setAlamat(rs.getString("alamat"));
                user.setTelepon(rs.getString("telepon"));
                user.setUser(rs.getString("user"));
                user.setPass(rs.getString("pass"));
                user.setStatus(rs.getString("status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public ArrayList<Customer> getAll(){
        ArrayList<Customer> listKariyawan = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("select * from user where status = 'Customer'");
        try {
            while (rs.next()) {
                Customer user = new Customer();
                
                user.setId(rs.getInt("id"));
                user.setNama(rs.getString("nama"));
                user.setAlamat(rs.getString("alamat"));
                user.setTelepon(rs.getString("telepon"));
                user.setUser(rs.getString("user"));
                user.setPass(rs.getString("pass"));
                user.setStatus(rs.getString("status"));
                
                listKariyawan.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKariyawan;
    }
    
    public ArrayList<Customer> search(String keyword){
        ArrayList<Customer> listKariyawan = new ArrayList();
        String sql = "select * from user where nama like'%"+keyword+"%' or id like '%"+keyword+"%'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                Customer user = new Customer();
                
                user.setId(rs.getInt("id"));
                user.setNama(rs.getString("nama"));
                user.setAlamat(rs.getString("alamat"));
                user.setTelepon(rs.getString("telepon"));
                user.setUser(rs.getString("user"));
                user.setPass(rs.getString("pass"));
                user.setStatus(rs.getString("status"));
                
                listKariyawan.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKariyawan;
    }
    
    public void save(){
        if(getById(this.getId()).getId() == 0){
            String SQL = "insert into user (nama, alamat, telepon, user, pass, status) values("
                    + "'" + this.getNama() + "',"
                    + "'" + this.getAlamat() + "',"
                    + "'" + this.getTelepon() + "',"
                    + "'" + this.getUser() + "',"
                    + "'" + this.getPass() + "',"
                    + "'" + this.getStatus()+ "'"
                    + ")";
            
            this.setId(DBHelper.insertQueryGetId(SQL));
        }else{
            String SQL = "update user set "
                    + "nama = '"+this.getNama()+"', "
                    + "alamat = '"+this.getAlamat()+"', "
                    + "telepon = '"+this.getTelepon()+"', "
                    + "user = '"+this.getUser()+"', "
                    + "pass = '"+this.getPass()+"', "
                    + "status = '"+this.getStatus()+"' "
                    + "where id = '"+this.getId()+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQl="delete from user where id = '"+super.getId()+"'";
        DBHelper.executeQuery(SQl);
    }

}
