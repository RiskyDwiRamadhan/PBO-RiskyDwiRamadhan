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
public class Wanita extends Manusia{
    private Pria suami;
    private Manusia anak;

    public Wanita() {
    }

    public Wanita(int umur, String nama, boolean dewasa, Pria suami, Manusia anak) {
        super(umur, nama, dewasa);
        this.suami = suami;
        this.anak = anak;
    }   
    
    public void setSuami(Pria suami){
        this.suami = suami;
    }
    
    public Pria getSuami(){
        return suami;
    }    
    
    public void setAnak(Manusia anak){
        this.anak = anak;
    }
    
    public Manusia getAnak(){
        return anak;
    }
    
    
    public String setStatus(){
        String status = "";
        if(super.getUmur()>= 20 ){
              super.setDewasa(true);
            status += "Suami  " +"\n" + this.suami.info()+"\n" ;
            status += "Anak   " +"\n" + this.anak.info() +"\n";
        }else{
            status +="Wanita ini masih kuliah";
        }
        return status;
    }
    
    public String info(){
        String info = "";
        info += super.info();
        return info;
    }
}
