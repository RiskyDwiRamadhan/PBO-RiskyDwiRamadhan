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
public class BahanBakar {
    public String bbm;
    
    BahanBakar() {
    }
    
    public void setBBM(String bbm){
        this.bbm = bbm;
    }
    
    public String getBBM(){
        return bbm;
    }
    
    public String info() {
        String info = "";
        info += getBBM();
        return info;
    }
}
