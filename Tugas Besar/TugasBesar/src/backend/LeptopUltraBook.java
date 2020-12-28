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
public class LeptopUltraBook extends Leptop implements Proses {
    private int idlepu;
    private String merek;
    private String OS;
    private int ketebalan;

    public LeptopUltraBook() {
    }

    public LeptopUltraBook(String merek, String OS, int ketebalan) {
        this.merek = merek;
        this.OS = OS;
        this.ketebalan = ketebalan;
    }


    public int getKetebalan() {
        return ketebalan;
    }

    public void setKetebalan(int ketebalan) {
        this.ketebalan = ketebalan;
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

    public int getIdlepu() {
        return idlepu;
    }

    public void setIdlepu(int idlepu) {
        this.idlepu = idlepu;
    }
    
    public LeptopUltraBook getById(int id){
        LeptopUltraBook lep = new LeptopUltraBook();
        ResultSet rs = DBHelper.selectQuery("select l.idleptop, l.idspesifikasi, "
                                                 + "s.prosesor, s.ram, s.penyimpanan, "
                                                 + "l.merek, l.os, l.warna, l.ketebalan, "
                                                 + "l.harga, l.stok, l.bobot "
                                                 + "from leptop l "
                                                 + "INNER join spesifikasi s on "
                                                 + "l.idspesifikasi = s.idspesifikasi "
                                                 + " where l.idleptop = '"+id+"'");
        
        try {
            while (rs.next()) {
                lep = new LeptopUltraBook();
                
                lep.getSpek().setIdSpesifikasi(rs.getInt("idspesifikasi"));
                lep.setIdlepu(rs.getInt("idleptop"));
                lep.setMerek(rs.getString("merek"));
                lep.setOS(rs.getString("os"));
                lep.setWarna(rs.getString("warna"));
                lep.setKetebalan(rs.getInt("ketebalan"));
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
    
    public ArrayList<LeptopUltraBook> getAll(){
        ArrayList<LeptopUltraBook> listLeptopUltraGaming = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("select l.idleptop, l.idspesifikasi, "
                                                 + "s.prosesor, s.ram, s.penyimpanan, "
                                                 + "l.merek, l.os, l.warna, l.ketebalan, "
                                                 + "l.harga, l.stok, l.bobot "
                                                 + "from leptop l "
                                                 + "INNER join spesifikasi s on "
                                                 + "l.idspesifikasi = s.idspesifikasi "
                                                 + "where l.bobot like '%0%'");      
        
        try {
            while (rs.next()) {
                LeptopUltraBook lep = new LeptopUltraBook();
                
                lep.getSpek().setIdSpesifikasi(rs.getInt("idspesifikasi"));
                lep.setIdlepu(rs.getInt("idleptop"));
                lep.setMerek(rs.getString("merek"));
                lep.setOS(rs.getString("os"));
                lep.setWarna(rs.getString("warna"));
                lep.setKetebalan(rs.getInt("ketebalan"));
                lep.setHarga(rs.getInt("harga"));
                lep.setStok(rs.getInt("stok"));
                
                lep.getSpek().setProsesor(rs.getString("prosesor"));
                lep.getSpek().setRam(rs.getString("ram"));
                lep.getSpek().setPenyimpanan(rs.getString("penyimpanan"));
                
                listLeptopUltraGaming.add(lep);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listLeptopUltraGaming;
    }
    
    public ArrayList<LeptopUltraBook> search(String keyword){
        ArrayList<LeptopUltraBook> listLeptopUltraGaming = new ArrayList();
        String sql = "select l.idleptop, l.idspesifikasi, "
                                                 + "s.prosesor, s.ram, s.penyimpanan, "
                                                 + "l.merek, l.os, l.warna, l.ketebalan, "
                                                 + "l.harga, l.stok "
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
                LeptopUltraBook lep = new LeptopUltraBook();
                
                lep.getSpek().setIdSpesifikasi(rs.getInt("idspesifikasi"));
                lep.setIdlepu(rs.getInt("idleptop"));
                lep.setMerek(rs.getString("merek"));
                lep.setOS(rs.getString("os"));
                lep.setWarna(rs.getString("warna"));
                lep.setKetebalan(rs.getInt("ketebalan"));
                lep.setHarga(rs.getInt("harga"));
                lep.setStok(rs.getInt("stok"));
                
                lep.getSpek().setProsesor(rs.getString("prosesor"));
                lep.getSpek().setRam(rs.getString("ram"));
                lep.getSpek().setPenyimpanan(rs.getString("penyimpanan"));
                
                
                listLeptopUltraGaming.add(lep);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listLeptopUltraGaming;
    }
    
    public void save(){
        if(getById(idlepu).getIdlepu()== 0){
            String SQL = "insert into leptop (idspesifikasi, merek, os, warna, ketebalan, bobot, harga, stok) values("
                    + "'" + this.getSpek().getIdSpesifikasi() + "',"
                    + "'" + this.merek + "',"
                    + "'" + this.OS + "',"
                    + "'" + this.getWarna() + "',"
                    + "'" + this.ketebalan + "',0,"
                    + "'" + this.getHarga() + "',"
                    + "'" + this.getStok() + "'"
                    + ")";
            
            this.idlepu = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "update leptop set "
                    + "idspesifikasi = '"+this.getSpek().getIdSpesifikasi()+"', "
                    + "merek = '"+this.merek+"', "
                    + "os = '"+this.OS+"', "
                    + "warna = '"+this.getWarna()+"', "
                    + "ketebalan = '"+this.ketebalan+"', "
                    + "harga = '"+this.getHarga()+"', "
                    + "stok = '"+this.getStok()+"' "
                    + "where idleptop = '"+idlepu+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQl="delete from leptop where idleptop = '"+idlepu+"'";
        DBHelper.executeQuery(SQl);
    }
    
}
