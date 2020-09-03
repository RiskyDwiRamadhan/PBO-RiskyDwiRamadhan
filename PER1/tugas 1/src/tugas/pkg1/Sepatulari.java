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
public class Sepatulari extends sepatu{        
    private String tahan;    
        
    public void settahan(String newValue){
        tahan = newValue;
    }   
    
    public void cetakStatus(){
        super.cetakStatus();  
        System.out.println("Tahan Terhadap : "+tahan);
    }
}
