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
public class Anggota {
    private int idAnggota;
    private String nama;
    private String alamat;
    private String telepon;

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Anggota() {
    }

    public Anggota(String nama, String alamat, String telepon){        
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
    public Anggota getById(int id){
        Anggota ang = new Anggota();
        ResultSet rs = DBHelper.selectQuery("select * from anggota where idanggota = '"+id+"'");
        try {
            while (rs.next()) {
                ang = new Anggota();
                ang.setIdAnggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ang;
    }
    
    public ArrayList<Anggota> getAll(){
        ArrayList<Anggota> listAnggota = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("select * from anggota");
        try {
            while (rs.next()) {
                Anggota ang = new Anggota();
                ang.setIdAnggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));
                
                listAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAnggota;
    }
    
    public ArrayList<Anggota> search(String keyword){
        ArrayList<Anggota> listAnggota = new ArrayList();
        String sql = "select * from anggota where nama like'%"+keyword+"%' or alamat like '%"+keyword+"%'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                Anggota ang = new Anggota();
                ang.setIdAnggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));
                
                listAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAnggota;
    }
    
    public void save(){
        if(getById(idAnggota).getIdAnggota() == 0){
            String SQL = "insert into anggota (nama, alamat, telepon) values('" + this.nama + "','" + this.alamat + "','" + this.telepon + "')";
            
            this.idAnggota = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "update anggota set "
                    + "nama= '"+this.nama+"', "
                    + "alamat= '"+this.alamat+"',"
                    + "telepon= '"+this.telepon+"'"
                    + "where idanggota = '"+this.idAnggota+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQl="delete from anggota where idanggota = '"+this.idAnggota+"'";
        DBHelper.executeQuery(SQl);
    }
}
