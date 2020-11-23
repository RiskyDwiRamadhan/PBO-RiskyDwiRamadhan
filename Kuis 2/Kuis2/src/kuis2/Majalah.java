/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kuis2;

/**
 * Risky Dwi Ramadhan
 * TI-2C
 */
public class Majalah extends MediaInformasi{
    public void setJMLHalaman(int jml){
        System.out.println("Majalah ini memiliki "+jml+" halaman");
        super.jmlHalaman = jml+2;
        System.out.println("Jika dihitung dengan cover, maka jumlah halaman "
                + "dari majalah tersebut: "+jmlHalaman+" halaman");
    }

    @Override
    public void reputasi() {
        System.out.println("Penerbit majalah ini memiliki reputasi");
    }
    
    
}
