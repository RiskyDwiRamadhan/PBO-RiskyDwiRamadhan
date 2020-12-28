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
public class Karyawan extends User{
    private String status;

    public Karyawan() {
    }
    
    
    @Override
    public void setStatus(String status) {
        this.status = "Karyawan";
    }

    
    @Override
    public String getStatus() {
        return status;
    }
    
    public Karyawan getById(int id){
        Karyawan user = new Karyawan();
        ResultSet rs = DBHelper.selectQuery("select * from user where id = '"+id+"'");
        try {
            while (rs.next()) {
                user = new Karyawan();
                
                user.setId(rs.getInt("id"));
                user.setNama(rs.getString("nama"));
                user.setAlamat(rs.getString("alamat"));
                user.setTelepon(rs.getString("telepon"));
                user.setUser(rs.getString("user"));
                user.setPass(rs.getString("pass"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public ArrayList<Karyawan> getAll(){
        ArrayList<Karyawan> listKariyawan = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("select * from user where status = 'Karyawan'");
        try {
            while (rs.next()) {
                Karyawan user = new Karyawan();
                
                user.setId(rs.getInt("id"));
                user.setNama(rs.getString("nama"));
                user.setAlamat(rs.getString("alamat"));
                user.setTelepon(rs.getString("telepon"));
                user.setUser(rs.getString("user"));
                user.setPass(rs.getString("pass"));
                
                listKariyawan.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKariyawan;
    }
    
    public ArrayList<Karyawan> search(String keyword){
        ArrayList<Karyawan> listKariyawan = new ArrayList();
        String sql = "select * from user where nama like'%"+keyword+"%' or "
                                                  + "id like '%"+keyword+"%'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                Karyawan user = new Karyawan();
                
                user.setId(rs.getInt("id"));
                user.setNama(rs.getString("nama"));
                user.setAlamat(rs.getString("alamat"));
                user.setTelepon(rs.getString("telepon"));
                user.setUser(rs.getString("user"));
                user.setPass(rs.getString("pass"));
                
                listKariyawan.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKariyawan;
    }
    
    public void save(){
        if(getById(super.getId()).getId() == 0){
            String SQL = "insert into user(nama, alamat, telepon, user, pass, status)values("
                    + "'" + super.getNama() + "',"
                    + "'" + super.getAlamat() + "',"
                    + "'" + super.getTelepon() + "',"
                    + "'" + super.getUser() + "',"
                    + "'" + super.getPass() + "',"
                    + "'" + this.getStatus() + "')";
            
            super.setId(DBHelper.insertQueryGetId(SQL));
        }else{
            String SQL = "update user set "
                    + "nama = '"+super.getNama()+"', "
                    + "alamat = '"+super.getAlamat()+"', "
                    + "telepon = '"+super.getTelepon()+"', "
                    + "user = '"+super.getUser()+"', "
                    + "pass = '"+super.getPass()+"', "
                    + "status = '"+this.getStatus()+"' "
                    + "where id = '"+super.getId()+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQl="delete from user where id = '"+super.getId()+"'";
        DBHelper.executeQuery(SQl);
    }

}
