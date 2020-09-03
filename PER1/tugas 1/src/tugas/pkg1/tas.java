/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas.pkg1;

/**
 *
 * @author User
 */
public class tas {    
    private String jenisTas,warna;    
    private int harga;
    
    public void setJenisTas(String newValue){
        jenisTas = newValue;
    }    
    
    public void setWarna(String newValue){
        warna = newValue;
    }       
    
    public void setHarga(int newValue){
        harga = newValue;
    }       
    
    public void cetakStatus(){
        System.out.println("Jenis Tas: "+jenisTas);
        System.out.println("Warna: " +warna);
        System.out.println("Harga: Rp." +harga);
    }
}
