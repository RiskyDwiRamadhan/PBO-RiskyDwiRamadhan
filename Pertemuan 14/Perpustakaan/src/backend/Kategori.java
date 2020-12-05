/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backend;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author User
 */
public class Kategori {
    private int idKategori;
    private String nama;
    private String keterangan;
        
    public String toString(){
        return nama;
    }
    
    public int getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Kategori() {
    }

    public Kategori(String nama, String keterangan){        
        this.nama = nama;
        this.keterangan = keterangan;
    }
    
    public Kategori getById(int id){
        Kategori kat = new Kategori();
        ResultSet rs = DBHelper.selectQuery("select * from kategori where idkategori = '"+id+"'");
        try {
            while (rs.next()) {
                kat = new Kategori();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }
    
    public ArrayList<Kategori> getAll(){
        ArrayList<Kategori> listKategori = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("select * from kategori");
        try {
            while (rs.next()) {
                Kategori kat = new Kategori();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                
                listKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKategori;
    }
    
    public ArrayList<Kategori> search(String keyword){
        ArrayList<Kategori> listKategori = new ArrayList();
        String sql = "select * from kategori where nama like'%"+keyword+"%' or keterangan like '%"+keyword+"%'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                Kategori kat = new Kategori();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                
                listKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKategori;
    }
    
    public void save(){
        if(getById(idKategori).getIdKategori() == 0){
            String SQL = "insert into kategori (nama, keterangan) values("
                    + "'" + this.nama + "',"
                    + "'" + this.keterangan + "'"
                    + ")";
            
            this.idKategori = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "update kategori set "
                    + "nama = '"+this.nama+"', "
                    + "keterangan = '"+this.keterangan+"' "
                    + "where idkategori = '"+this.idKategori+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQl="delete from kategori where idkategori = '"+this.idKategori+"'";
        DBHelper.executeQuery(SQl);
        
        
    }
    
    
}
