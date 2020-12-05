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
public class Anggota {
    private int idAnggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Anggota() {
    }

    public Anggota(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
    public Anggota getById(int id){
//        return idKategori;
    }
    
    public Anggota[] getAll(){
        
    }
    
    public Anggota[] search(String keyword){
        
    }
    
    public void save(){
        
    }
    public void delete(){
        
    }
}
