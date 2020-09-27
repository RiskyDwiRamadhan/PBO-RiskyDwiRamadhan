/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package percobaan.pkg2;

/**
 *
 * @author User
 */
public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    public Pelanggan() {
    }

    public void setNama(String nama){
        this.nama = nama;
    }        
    
    public void setMobil(Mobil mobil){
        this.mobil = mobil;
    }           
    
    public void setSopir(Sopir sopir){
        this.sopir = sopir;
    }           
    
    public void setHari(int hari){
        this.hari = hari;
    }           
    
    public String getNama(){
        return nama;        
    } 
    
    public Mobil getMobil(){
        return mobil;        
    } 
    
    public Sopir getSopir(){
        return sopir;        
    } 
    
    public int getHari(){
        return hari;        
    } 
    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }  
}
