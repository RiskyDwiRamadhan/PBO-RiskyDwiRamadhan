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
public class Pria extends Manusia{
    private Wanita istri;
    
    Pria(){
        
    }

    public Pria(int umur, String nama, boolean dewasa, Wanita istri) {
        super(umur, nama, dewasa);
        this.istri = istri;
    }
    
    public void setIstri(Wanita istri){
        this.istri = istri;
    }
    
    public Wanita getIstri(){
        return istri;
    }
    
    public String setStatus(){
        String status = "";
        if(super.getUmur() >= 22 ){
              super.setDewasa(true);
            status += "Istri  "+"\n" + this.istri.info();
        }else{
            status +="Pria ini masih kuliah";
        }
        return status;
    }
    
    public String info(){
        String info = "";
        info += super.info();
        return info;
    }
    

    
    
}
