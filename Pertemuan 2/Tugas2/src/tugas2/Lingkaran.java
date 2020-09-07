/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas2;

/**
 *
 * @author User
 */
public class Lingkaran {

    public double phi=3.14,r,luas,keliling;
    
    public double hitungLuas(){
        luas = phi*r*r;
        return luas;
    }
    
    
    public double hitungKeliling(){
        keliling = 2*phi*r;
        return keliling;
    }
    
}
