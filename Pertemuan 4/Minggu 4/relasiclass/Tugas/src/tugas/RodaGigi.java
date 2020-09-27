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
public class RodaGigi {
    public int gigi;
    
    RodaGigi() {
    }
    
    public void setGigi(int gigi){
        this.gigi = gigi;
    }
    
    public int getGigi(){
        return gigi;
    }
    
    public String info(){
        String info = "";
        info += getGigi();
        return info;
    }
}
