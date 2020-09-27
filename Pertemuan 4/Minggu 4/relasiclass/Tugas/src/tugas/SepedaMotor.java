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
public class SepedaMotor {
    public String merk;
    public String platNo;
    public String warna;
    public RodaGigi gigi;
    public BahanBakar bbm;
    
    SepedaMotor(){
        
    }
    
    public void setPlatNo(String platNo){
        this.platNo = platNo;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public void setGigi(RodaGigi gigi){
        this.gigi = gigi;
    }
    
    public void setBBM(BahanBakar bbm){
        this.bbm = bbm;
    }
    
    public String getPlatno(){
        return platNo;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public RodaGigi getGigi(){
        return gigi;
    }
    
    public BahanBakar getBBM(){
        return bbm;
    }
    
    public String info(){
        String info = "";
        info += "Plat No            : "+ getPlatno() +"\n";
        info += "Merk               : "+ getMerk() +"\n";
        info += "Warna              : "+ getWarna() +"\n";
        info += "Banyak Gigi Roda   : "+ this.gigi.info() +"\n";
        info += "Bahan Bakar        : "+ this.bbm.info() +"\n";
        return info;
    }
}
