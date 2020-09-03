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
public class sepatu {
    private String merek,warna,material;    
    
    public void setMerek(String newValue){
        merek = newValue;
    }    
    
    public void setWarna(String newValue){
        warna = newValue;
    }       
    
    public void setMaterial(String newValue){
        material = newValue;
    }       
    
    public void cetakStatus(){
        System.out.println("Merek: "+merek);
        System.out.println("Material: " +material);
        System.out.println("Warna: " +warna);
    }
}
