/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas;

/**
 *
 * @author User
 */
public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;
    
    public Pegawai(){
        
    }
 
    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
        
    public String getNama(){
        return this.nama;
    }
    
    public int getGaji(){        
        return 1800000;
    }
}
