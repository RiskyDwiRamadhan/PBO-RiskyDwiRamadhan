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
public class Buku {
    private int idBuku;
    private Kategori kategori;
    private String judul;
    private String penerbit;
    private String penulis;

    public Buku() {
    }

    public Buku(Kategori kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }
        
    public Buku getById(int id){
//        return idKategori;
    }
    
    public Buku[] getAll(){
        
    }
    
    public Buku[] search(String keyword){
        
    }
    
    public void save(){
        
    }
    public void delete(){
        
    }
}
