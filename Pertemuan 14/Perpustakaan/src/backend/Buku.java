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
public class Buku {
    private int idBuku;
    private Kategori buku = new Kategori();
    private String judul;
    private String penerbit;
    private String penulis;

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public Kategori getKategori() {
        return buku;
    }

    public void setKategori(Kategori buku) {
        this.buku = buku;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public Buku() {
    }

    public Buku(Kategori buku, String judul, String penerbit, String penulis){        
        this.buku = buku;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }
    
    public Buku getById(int id){
        Buku buku = new Buku();
        ResultSet rs = DBHelper.selectQuery("select b.idbuku, b.judul, b.penerbit, b.penulis, "
                                          + "k.idkategori, k.nama, k.keterangan "
                                          + "from buku b "
                                          + "left join kategori k on b.idkategori = k.idkategori "
                                          + "where idbuku = '"+id+"'");
        try {
            while (rs.next()) {
                buku = new Buku();
                buku.setIdBuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }
    
    public ArrayList<Buku> getAll(){
        ArrayList<Buku> listBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("select b.idbuku, b.judul, b.penerbit, b.penulis, "
                                          + "k.idkategori, k.nama, k.keterangan "
                                          + "from buku b "
                                          + "left join kategori k on b.idkategori = k.idkategori ");
        try {
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setIdBuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                listBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listBuku;
    }
    
    public ArrayList<Buku> search(String keyword){
        ArrayList<Buku> listBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("select b.idbuku, b.judul, b.penerbit, b.penulis, "
                                          + "k.idkategori, k.nama, k.keterangan "
                                          + "from buku b "
                                          + "left join kategori k on b.idkategori = k.idkategori "
                                          + "where b.judul like '%"+keyword+"%'"
                                          + "or b.penerbit like '%"+keyword+"%'"
                                          + "or b.penulis like '%"+keyword+"%'");
        try {
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setIdBuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                listBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listBuku;
    }
    
    public void save(){
        if(getById(idBuku).getIdBuku() == 0){
            String SQL = "insert into buku (judul, idkategori, penerbit, penulis) "
                       + "values('" + this.judul + "',"
                       + "'" + this.getKategori().getIdKategori() + "',"
                       + "'" + this.penerbit + "',"
                       + "'" + this.penulis + "')";
            
            this.idBuku = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "update buku set "
                    + "judul= '"+this.judul+"', "
                    + "idkategori= '"+this.getKategori().getIdKategori()+"', "
                    + "penerbit= '"+this.penerbit+"',"
                    + "penulis= '"+this.penulis+"'"
                    + "where idbuku = '"+this.idBuku+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQl="delete from buku where idbuku = '"+this.idBuku+"'";
        DBHelper.executeQuery(SQl);
        
        
    }
    
}
