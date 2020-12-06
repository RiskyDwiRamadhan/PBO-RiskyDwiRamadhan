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
public class Peminjaman {
    private int idPeminjaman;
    private int idAnggota;
    private int idBuku;
    private String namaAnggota;
    private String judul;
    private String tglPinjam;
    private String tglKembali;

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }


    public Peminjaman() {
    }

    public Peminjaman(int idAnggota, int idBuku, String tglPinjam, String tglKembali) {
        this.idAnggota = idAnggota;
        this.idBuku = idBuku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    
    
    
    public Peminjaman getById(int id){
        Peminjaman pinjam = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("select p.idpeminjaman, a.idanggota, a.nama, "
                                          + "b.idbuku, b.judul, p.tanggalpinjam, p.tanggalkembali "
                                          + "from peminjaman p "
                                          + "left join anggota a on p.idanggota = a.idanggota "
                                          + "left join buku b on p.idbuku= b.idbuku "
                                          + "where p.idpeminjaman = '"+id+"'");
        try {
            while (rs.next()) {
                pinjam = new Peminjaman();
                pinjam.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pinjam.setIdAnggota(rs.getInt("idanggota"));
                pinjam.setNamaAnggota(rs.getString("nama"));
                pinjam.setIdBuku(rs.getInt("idbuku"));
                pinjam.setJudul(rs.getString("judul"));
                pinjam.setTglPinjam(rs.getString("tanggalpinjam"));
                pinjam.setTglKembali(rs.getString("tanggalkembali"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pinjam;
    }
    
    public ArrayList<Peminjaman> getAll(){
        ArrayList<Peminjaman> listPinjam = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("select * from peminjaman");
        try {
            while (rs.next()) {
                Peminjaman pem = new Peminjaman();
                pem.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pem.setIdAnggota(rs.getInt("idanggota"));
                pem.setIdBuku(rs.getInt("idbuku"));
                pem.setTglPinjam(rs.getString("tanggalpinjam"));
                pem.setTglKembali(rs.getString("tanggalkembali"));
                
                listPinjam.add(pem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPinjam;
    }      
    
    public ArrayList<Peminjaman> searchAnggota(String keyword){
        ArrayList<Peminjaman> listAnggota = new ArrayList();
        String sql = "select * from anggota where idanggota like'%"+keyword+"%'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                Peminjaman ang = new Peminjaman();
                ang.setIdAnggota(rs.getInt("idanggota"));
                ang.setNamaAnggota(rs.getString("nama"));
                
                listAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAnggota;
    }
    
    public ArrayList<Peminjaman> searchBuku(String keyword){
        ArrayList<Peminjaman> listBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("select b.idbuku, b.judul, b.penerbit, b.penulis, "
                                          + "k.idkategori, k.nama, k.keterangan "
                                          + "from buku b "
                                          + "left join kategori k on b.idkategori = k.idkategori "
                                          + "where b.idbuku like'%"+keyword+"%'");
        try {
            while (rs.next()) {
                Peminjaman buku = new Peminjaman();
                buku.setIdBuku(rs.getInt("idbuku"));
                buku.setJudul(rs.getString("judul"));
                
                listBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listBuku;
    }
    
    public void save(){
        if(getById(idPeminjaman).getIdPeminjaman()== 0){
            String SQL = "insert into peminjaman (idanggota, idbuku, "
                       + "tanggalpinjam, tanggalkembali) "
                       + "values('" + this.idAnggota + "',"
                       + "'" + this.idBuku + "',"
                       + "'" + this.tglPinjam + "',"
                       + "'" + this.tglKembali + "')";
            
            this.idPeminjaman = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "update peminjaman set "
                    + "idanggota= '"+this.idAnggota+"', "
                    + "idbuku= '"+this.idBuku+"', "
                    + "tanggalpinjam= '"+this.tglPinjam+"',"
                    + "tanggalkembali= '"+this.tglKembali+"'"
                    + "where idpeminjaman = '"+this.idPeminjaman+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQl="delete from peminjaman where idpeminjaman = '"+this.idPeminjaman+"'";
        DBHelper.executeQuery(SQl);
        
        
    }
    
}
