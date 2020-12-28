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
public class Transaksi{
    private int idTra;
    private Leptop l = new Leptop();
    private Karyawan k = new Karyawan();
    private Customer c = new Customer();            
    private String tgl;
    private int qty;
    private int total;
    private String merek;
    private String os;

    public Transaksi() {
    }

    public Transaksi(int idTra, String tgl, int qty, int total, String merek, String os) {
        this.idTra = idTra;
        this.tgl = tgl;
        this.qty = qty;
        this.total = total;
        this.merek = merek;
        this.os = os;
    }

      

    public int getIdTra() {
        return idTra;
    }

    public void setIdTra(int idTra) {
        this.idTra = idTra;
    }

    public Leptop getL() {
        return l;
    }

    public void setL(Leptop l) {
        this.l = l;
    }

    public Karyawan getK() {
        return k;
    }

    public void setK(Karyawan k) {
        this.k = k;
    }

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getOS() {
        return os;
    }

    public void setOS(String os) {
        this.os = os;
    }

    
    public Transaksi getById(int id){
        Transaksi tra = new Transaksi();
        ResultSet rs = DBHelper.selectQuery("select t.idtra, t.idkar, uk.nama, t.idus, uc.nama, "
                                          + "t.idlep, l.merek, l.harga, t.tgltra, t.qty, t.totalharga "
                                          + "from transaksi t "
                                          + "inner join leptop l on t.idlep = l.idleptop "
                                          + "inner join user uk on t.idkar = uk.id "
                                          + "inner join user uc on t.idus = uc.id "
                                          + "where idtra = '"+id+"'");
        try {
            while (rs.next()) {
                tra = new Transaksi();
                tra.setIdTra(rs.getInt("idtra"));
                
                tra.getK().setId(rs.getInt("idkar"));
                tra.getK().setNama(rs.getString("uk.nama"));
                
                tra.getC().setId(rs.getInt("idus"));
                tra.getC().setNama(rs.getString("uc.nama"));
                
                tra.getL().setIdLep(rs.getInt("idlep"));
                tra.getL().setHarga(rs.getInt("harga"));
                
                tra.setTgl(rs.getString("tgltra"));
                tra.setQty(rs.getInt("qty"));
                tra.setTotal(rs.getInt("totalharga"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tra;
    }
    
    public Transaksi getByIdlep(int id){
        Transaksi lep = new Transaksi();
        ResultSet rs = DBHelper.selectQuery("select l.idleptop, l.idspesifikasi, "
                                                 + "s.prosesor, s.ram, s.penyimpanan, "
                                                 + "l.merek, l.os, l.warna, l.ketebalan, "
                                                 + "l.harga, l.stok, l.bobot "
                                                 + "from leptop l "
                                                 + "INNER join spesifikasi s on "
                                                 + "l.idspesifikasi = s.idspesifikasi ");
        
        try {
            while (rs.next()) {
                lep = new Transaksi();
                
                lep.l.getSpek().setIdSpesifikasi(rs.getInt("idspesifikasi"));
                lep.l.setIdLep(rs.getInt("idleptop"));
                lep.setMerek(rs.getString("merek"));
                lep.setOS(rs.getString("os"));
                lep.l.setWarna(rs.getString("warna"));
                lep.l.setHarga(rs.getInt("harga"));
                lep.l.setStok(rs.getInt("stok"));
                
                lep.l.getSpek().setProsesor(rs.getString("prosesor"));
                lep.l.getSpek().setRam(rs.getString("ram"));
                lep.l.getSpek().setPenyimpanan(rs.getString("penyimpanan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lep;
    }
    
    public ArrayList<Transaksi> getAll(){
        ArrayList<Transaksi> listTransaksi = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT t.idtra, t.idkar, t.idus, u.nama as namak, "
                                          + "u1.nama as namac,t.idlep, l.merek, l.harga, t.tgltra, "
                                          + "t.qty, t.totalharga "
                                          + "FROM transaksi t "
                                          + "INNER join user u on t.idkar = u.id "
                                          + "INNER join user u1 on t.idus = u1.id "
                                          + "INNER JOIN leptop l on t.idlep = l.idleptop");
        try {
            while (rs.next()) {
                Transaksi tra = new Transaksi();
                tra.setIdTra(rs.getInt("idtra"));
                
                tra.getK().setId(rs.getInt("idkar"));
                tra.getK().setNama(rs.getString("namak"));
                
                tra.getC().setId(rs.getInt("idus"));
                tra.getC().setNama(rs.getString("namac"));
//                
                tra.getL().setIdLep(rs.getInt("idlep"));
                tra.setMerek(rs.getString("merek"));
                tra.getL().setHarga(rs.getInt("harga"));
                
                tra.setTgl(rs.getString("tgltra"));
                tra.setQty(rs.getInt("qty"));
                tra.setTotal(rs.getInt("totalharga"));
                
                listTransaksi.add(tra);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTransaksi;        
    }    
    public ArrayList<Transaksi> getAlllep(){
        ArrayList<Transaksi> listLeptopUltraGaming = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("select l.idleptop, l.idspesifikasi, "
                                                 + "s.prosesor, s.ram, s.penyimpanan, "
                                                 + "l.merek, l.os, l.warna, l.ketebalan, "
                                                 + "l.harga, l.stok, l.bobot "
                                                 + "from leptop l "
                                                 + "INNER join spesifikasi s on "
                                                 + "l.idspesifikasi = s.idspesifikasi");      
        
        try {
            while (rs.next()) {
                Transaksi lep = new Transaksi();
                
                lep.getL().getSpek().setIdSpesifikasi(rs.getInt("idspesifikasi"));
                lep.getL().setIdLep(rs.getInt("idleptop"));
                lep.setMerek(rs.getString("merek"));
                lep.setOS(rs.getString("os"));
                lep.getL().setWarna(rs.getString("warna"));
                lep.getL().setHarga(rs.getInt("harga"));
                lep.getL().setStok(rs.getInt("stok"));
                
                lep.getL().getSpek().setProsesor(rs.getString("prosesor"));
                lep.getL().getSpek().setRam(rs.getString("ram"));
                lep.getL().getSpek().setPenyimpanan(rs.getString("penyimpanan"));
                
                listLeptopUltraGaming.add(lep);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listLeptopUltraGaming;
    }
    
    public ArrayList<Transaksi> search(String keyword){
        ArrayList<Transaksi> listTransaksi = new ArrayList();
        String sql = "select t.idtra, t.idkar, uk.nama, t.idus, uc.nama, "
                   + "t.idlep, l.merek, l.harga, t.tgltra, t.qty, t.totalharga "
                   + "from transaksi t "
                   + "inner join leptop l on t.idlep = l.idleptop "
                   + "inner join user uk on t.idkar = uk.id "
                   + "inner join user uc on t.idus = uc.id "
                   + "where idtra like '%"+keyword+"%'";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                Transaksi tra = new Transaksi();
                tra.setIdTra(rs.getInt("idtra"));
                
                tra.getK().setId(rs.getInt("idkar"));
                tra.getK().setNama(rs.getString("uk.nama"));
                
                tra.getC().setId(rs.getInt("idus"));
                tra.getC().setNama(rs.getString("uc.nama"));
                
                tra.getL().setIdLep(rs.getInt("idlep"));
                tra.getL().setHarga(rs.getInt("harga"));
                
                tra.setTgl(rs.getString("tgltra"));
                tra.setQty(rs.getInt("qty"));
                tra.setTotal(rs.getInt("totalharga"));
//                
                listTransaksi.add(tra);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTransaksi;
    }
    
    public void save(){
        if(getById(idTra).getIdTra()== 0){
            String SQL = "insert into transaksi (idkar, idus, idlep, tgltra, qty, totalharga) values("
                    + "'" + k.getId() + "',"
                    + "'" + c.getId() + "',"
                    + "'" + l.getIdLep() + "',"
                    + "'" + this.tgl+ "',"
                    + "'" + this.qty+ "',"
                    + "'" + this.total+ "'"
                    + ")";
            
            this.idTra = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "update transaksi set "
                    + "idkar = '"+k.getId()+"', "
                    + "idus = '"+c.getId()+"', "
                    + "idlep = '"+l.getIdLep()+"', "
                    + "tgltra = '"+this.tgl+"', "
                    + "qty = '"+this.qty+"', "
                    + "totalharga = '"+this.total+"' "
                    + "where idtra = '"+this.idTra+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQl="delete from transaksi where idtra = '"+this.idTra+"'";
        DBHelper.executeQuery(SQl);
    }       
}
