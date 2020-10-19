/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uts;

/**
 *
 * @author User
 */
public class Topeng extends Kerajinan{
    public Ornamen ornamen;

    public Topeng(String asal, String namaKerajinan, Ornamen ornamen ) {
        this.asal = asal;
        this.nama = namaKerajinan;
        this.ornamen = ornamen;
    }
    
    public void buatKerajinan(){
        harga = 1500000;
    }
    
}
