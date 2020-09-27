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
public class Pengendara {
    public String noKtp;
    public String nama;
    public String alamat;
    public SepedaMotor spd;
    
    Pengendara() {
        
    }
    
    public void setNoKtp(String noKtp){
        this.noKtp = noKtp;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public void setSepeda(SepedaMotor spd){
        this.spd = spd;
    }
    
    public String getNoKtp(){
        return noKtp;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public SepedaMotor getSepeda(){
        return spd;
    }
    
    public String info(){
        String info = "";
        info += "No Ktp         : "+getNoKtp() +"\n";
        info += "Nama           : "+getNama() +"\n";
        info += "Alamat         : "+getAlamat() +"\n\n";
        info += "           Sepeda Motor   \n"+spd.info();
        return info;
    }
}
