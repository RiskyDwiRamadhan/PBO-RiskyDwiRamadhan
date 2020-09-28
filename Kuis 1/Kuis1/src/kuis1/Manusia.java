/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kuis1;

/**
 *
 * @author User
 */
public class Manusia {
    private int umur;
    private String nama;
    private boolean dewasa;

    Manusia() {
    }

    Manusia(int umur, String nama, boolean dewasa) {
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setDewasa(boolean dewasa){
        this.dewasa = dewasa;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public String getNama(){
        return nama;
    }
    
    public boolean getDewasa(){
        return dewasa;
    }
    
    public String info(){
        String info = "";
        info += "Nama   : " +getNama() +"\n";
        info += "Umur   : " +getUmur() ;
        return info;
    }
}
