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
public class Buku extends MediaInformasi{
    public void setJMLHalaman(int jml){
        System.out.println("Buku ini memiliki "+jml+" halaman");
        super.jmlHalaman = jml+4;
        System.out.println("Jika dihitung dengan cover, maka jumlah halaman "
                + "dari buku tersebut: "+jmlHalaman+" halaman, "
                + "lebih tebal daripada majalah karena terdapat cover dalam dan cover luar");
    }

    @Override
    public void reputasi() {
        System.out.println("Penerbit buku ini memiliki reputasi");
    }
    
}
