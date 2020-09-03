/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sepeda;

/**
 *
 * @author User
 */
public class SepedaGunung extends Sepeda{
    private String tipesuspensi;
    
    public void setTipeSuspension(String newValue){
        tipesuspensi = newValue;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe Suspensi: "+tipesuspensi);
    }
}
