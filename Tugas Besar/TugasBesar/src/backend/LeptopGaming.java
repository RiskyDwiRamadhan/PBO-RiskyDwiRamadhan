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
public class LeptopGaming extends Leptop implements Proses{
    private int idlepg;
    private String merek;
    private String OS;
    private int bobot;

    public LeptopGaming() {
    }

    public LeptopGaming(int idlepg, String merek, String OS, int bobot) {
        this.idlepg = idlepg;
        this.merek = merek;
        this.OS = OS;
        this.bobot = bobot;
    }

    
    @Override
    public void setMerek(String merek) {
        this.merek = merek;
    }

    @Override
    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public String getMerek() {
        return merek;
    }

    @Override
    public String getOS() {
        return OS;
    }

    public int getBobot() {
        return bobot;
    }

    public void setBobot(int bobot) {
        this.bobot = bobot;
    }

    public int getIdlepg() {
        return idlepg;
    }

    public void setIdlepg(int idlepg) {
        this.idlepg = idlepg;
    }
        
    public LeptopGaming getById(int id){
        LeptopGaming lep = new LeptopGaming();
        ResultSet rs = DBHelper.selectQuery("select l.idleptop, l.idspesifikasi, "
                                                 + "s.prosesor, s.ram, s.penyimpanan, "
                                                 + "l.merek, l.os, l.warna, l.bobot, "
                                                 + "l.harga, l.stok "
                                                 + "from leptop l "
                                                 + "INNER join spesifikasi s on "
                                                 + "l.idspesifikasi = s.idspesifikasi "
                                                 + "where l.idleptop = '"+id+"'");
        try {
            while (rs.next()) {
                lep = new LeptopGaming();
                
                lep.getSpek().setIdSpesifikasi(rs.getInt("idspesifikasi"));
                lep.setIdlepg(rs.getInt("idleptop"));
                lep.setMerek(rs.getString("merek"));
                lep.setOS(rs.getString("os"));
                lep.setWarna(rs.getString("warna"));
                lep.setBobot(rs.getInt("bobot"));
                lep.setHarga(rs.getInt("harga"));
                lep.setStok(rs.getInt("stok"));
                
                lep.getSpek().setProsesor(rs.getString("prosesor"));
                lep.getSpek().setRam(rs.getString("ram"));
                lep.getSpek().setPenyimpanan(rs.getString("penyimpanan"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lep;
    }
    public ArrayList<LeptopGaming> getAll(){
        ArrayList<LeptopGaming> listLeptopGaming = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("select l.idleptop, l.idspesifikasi, "
                                                 + "s.prosesor, s.ram, s.penyimpanan, "
                                                 + "l.merek, l.os, l.warna, l.bobot, "
                                                 + "l.ketebalan, l.harga, l.stok "
                                                 + "from leptop l "
                                                 + "INNER join spesifikasi s on "
                                                 + "l.idspesifikasi = s.idspesifikasi "
                                                 + "where l.ketebalan like '%0%'");      
        try {
            while (rs.next()) {
                LeptopGaming lep = new LeptopGaming();
                
                lep.getSpek().setIdSpesifikasi(rs.getInt("idspesifikasi"));
                lep.setIdlepg(rs.getInt("idleptop"));
                lep.setMerek(rs.getString("merek"));
                lep.setOS(rs.getString("os"));
                lep.setWarna(rs.getString("warna"));
                lep.setBobot(rs.getInt("bobot"));
                lep.setHarga(rs.getInt("harga"));
                lep.setStok(rs.getInt("stok"));
                
                lep.getSpek().setProsesor(rs.getString("prosesor"));
                lep.getSpek().setRam(rs.getString("ram"));
                lep.getSpek().setPenyimpanan(rs.getString("penyimpanan"));
                
                listLeptopGaming.add(lep);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listLeptopGaming;
    }
    
    public ArrayList<LeptopGaming> search(String keyword){
        ArrayList<LeptopGaming> listLeptopGaming = new ArrayList();
        String sql = "select l.idleptop, l.idspesifikasi, "
                                                 + "s.prosesor, s.ram, s.penyimpanan, "
                                                 + "l.merek, l.os, l.warna, l.bobot, "
                                                 + "l.harga, l.stok, l.ketebalan "
                                                 + "from leptop l "
                                                 + "INNER join spesifikasi s on "
                                                 + "l.idspesifikasi = s.idspesifikasi"
                                                 + "where idleptop like'%"+keyword+"%' "
                                                 + "or merek like '%"+keyword+"%' "
                                                 + "or os like '%"+keyword+"%' "
                                                 + "or harga like '%"+keyword+"%'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                LeptopGaming lep = new LeptopGaming();
                
                lep.getSpek().setIdSpesifikasi(rs.getInt("idspesifikasi"));
                lep.setIdlepg(rs.getInt("idleptop"));
                lep.setMerek(rs.getString("merek"));
                lep.setOS(rs.getString("os"));
                lep.setWarna(rs.getString("warna"));
                lep.setBobot(rs.getInt("bobot"));
                lep.setHarga(rs.getInt("harga"));
                lep.setStok(rs.getInt("stok"));
                
                lep.getSpek().setProsesor(rs.getString("prosesor"));
                lep.getSpek().setRam(rs.getString("ram"));
                lep.getSpek().setPenyimpanan(rs.getString("penyimpanan"));
                
                
                listLeptopGaming.add(lep);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listLeptopGaming;
    }
    
    public void save(){
        if(getById(idlepg).getIdlepg()== 0){
            String SQL = "insert into leptop (idspesifikasi, merek, os, warna, bobot, ketebalan, harga, stok) values("
                    + "'" + this.getSpek().getIdSpesifikasi() + "',"
                    + "'" + this.merek + "',"
                    + "'" + this.OS + "',"
                    + "'" + this.getWarna() + "',"
                    + "'" + this.bobot + "',0,"
                    + "'" + this.getHarga() + "',"
                    + "'" + this.getStok() + "'"
                    + ")";
            
            this.idlepg = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "update leptop set "
                    + "idspesifikasi = '"+this.getSpek().getIdSpesifikasi()+"', "
                    + "merek = '"+this.merek+"', "
                    + "os = '"+this.OS+"', "
                    + "warna = '"+this.getWarna()+"', "
                    + "bobot = '"+this.bobot+"', "
                    + "ketebalan = 0, "
                    + "harga = '"+this.getHarga()+"', "
                    + "stok = '"+this.getStok()+"' "
                    + "where idleptop = '"+idlepg+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQl="delete from leptop where idleptop = '"+this.idlepg+"'";
        DBHelper.executeQuery(SQl);
    }
    
}
