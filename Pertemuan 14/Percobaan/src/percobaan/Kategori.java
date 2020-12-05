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
public class Kategori {
    private int idKategori;
    private String nama;
    private String keterangan;

    public Kategori() {
    }

    public Kategori(String nama, String keterangan) {        
        this.nama = nama;
        this.keterangan = keterangan;
    }
    
    public Kategori getById(int id){
//        return idKategori;
    }
    
    public Kategori[] getAll(){
        
    }
    
    public Kategori[] search(String keyword){
        
    }
    
    public void save(){
        
    }
    public void delete(){
        
    }
}
