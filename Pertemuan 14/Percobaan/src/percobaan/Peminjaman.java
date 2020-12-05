/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package percobaan;

/**
 *
 * @author User
 */
public class Peminjaman {
    private int idPeminjaman;
    private Anggota anggota;
    private Buku buku;    
    private int tanggalPinjam;
    private int tanggalKembali;

    public Peminjaman() {
    }

    public Peminjaman(Anggota anggota, Buku buku, int tanggalPinjam, int tanggalKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }
    
    public Peminjaman getById(int id){
//        return idKategori;
    }
    
    public Peminjaman[] getAll(){
        
    }
    
    public Peminjaman[] search(String keyword){
        
    }
    
    public void save(){
        
    }
    public void delete(){
        
    }
    
    
}
