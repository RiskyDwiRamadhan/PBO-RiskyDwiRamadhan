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
public class Spesifikasi {
    private int idSpesifikasi;
    private String prosesor;
    private String ram;
    private String penyimpanan;

    public Spesifikasi(){
    }

    
    public Spesifikasi(String prosesor, String ram, String penyimpanan){
        this.prosesor = prosesor;
        this.ram = ram;
        this.penyimpanan = penyimpanan;
    }

    public int getIdSpesifikasi() {
        return idSpesifikasi;
    }

    public void setIdSpesifikasi(int idSpesifikasi) {
        this.idSpesifikasi = idSpesifikasi;
    }

    public String getProsesor() {
        return prosesor;
    }

    public void setProsesor(String prosesor) {
        this.prosesor = prosesor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPenyimpanan() {
        return penyimpanan;
    }

    public void setPenyimpanan(String penyimpanan) {
        this.penyimpanan = penyimpanan;
    }
        
    public Spesifikasi getById(int id){
        Spesifikasi s = new Spesifikasi();
        ResultSet rs = DBHelper.selectQuery("select * from spesifikasi where idspesifikasi = '"+id+"'");
        try {
            while (rs.next()) {
                s = new Spesifikasi();
                s.setIdSpesifikasi(rs.getInt("idspesifikasi"));
                s.setProsesor(rs.getString("prosesor"));
                s.setRam(rs.getString("ram"));
                s.setPenyimpanan(rs.getString("penyimpanan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
    
    public ArrayList<Spesifikasi> getAll(){
        ArrayList<Spesifikasi> listKategori = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("select * from Spesifikasi");
        try {
            while (rs.next()) {
                Spesifikasi kat = new Spesifikasi();
                kat.setIdSpesifikasi(rs.getInt("idSpesifikasi"));
                kat.setProsesor(rs.getString("prosesor"));
                kat.setRam(rs.getString("ram"));
                kat.setPenyimpanan(rs.getString("penyimpanan"));
                
                listKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKategori;
    }
    
    public ArrayList<Spesifikasi> search(String keyword){
        ArrayList<Spesifikasi> listSpesifikasi = new ArrayList();
        String sql = "select * from spesifikasi where idspesifikasi like '%"+keyword+"%'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                Spesifikasi s = new Spesifikasi();
                s.setIdSpesifikasi(rs.getInt("idspesifikasi"));
                s.setProsesor(rs.getString("prosesor"));
                s.setRam(rs.getString("ram"));
                s.setPenyimpanan(rs.getString("penyimpanan"));
                
                listSpesifikasi.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSpesifikasi;
    }
    
    public void save(){
        if(getById(idSpesifikasi).getIdSpesifikasi() == 0){
            String SQL = "insert into spesifikasi (prosesor, ram, penyimpanan) values("
                    + "'" + this.prosesor + "',"
                    + "'" + this.ram + "',"
                    + "'" + this.penyimpanan + "'"
                    + ")";
            
            this.idSpesifikasi = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "update spesifikasi set "
                    + "prosesor = '"+this.prosesor+"', "
                    + "ram = '"+this.ram+"', "
                    + "penyimpanan = '"+this.penyimpanan+"' "
                    + "where idspesifikasi = '"+this.idSpesifikasi+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQl="delete from spesifikasi where idspesifikasi = '"+this.idSpesifikasi+"'";
        DBHelper.executeQuery(SQl);
        
        
    }
    
}
