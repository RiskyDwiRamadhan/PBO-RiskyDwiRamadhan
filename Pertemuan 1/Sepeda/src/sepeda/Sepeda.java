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
public class Sepeda {
    private String merek;
    private int kecepatan;
    private int gear;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    
    public void gantigear(int newValue){
        gear = newValue;
    }
    
    public void tambahkecepatan(int increment){
        kecepatan = kecepatan + increment;
    }
    
    public void rem(int decrement){
        kecepatan = kecepatan - decrement;
    }
    
    public void cetakStatus(){
        System.out.println("Merek: "+merek);
        System.out.println("Kecepatan: " +kecepatan);
        System.out.println("Gear: " +gear);
    }
        
           
}
