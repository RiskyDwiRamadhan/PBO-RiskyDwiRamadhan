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
public class SepatuSepakBola extends sepatu{    
    private String tali;   
    public void setTali(String newValue){
        tali = newValue;
    }   
    
    public void cetakStatus(){  
        super.cetakStatus();
        System.out.println("Jenis Tali: "+tali);
    }
}
