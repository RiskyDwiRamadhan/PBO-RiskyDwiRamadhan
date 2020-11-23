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
public class MediaInformasi implements Penerbit{
    public int jmlHalaman;
    public int tahunSekarang;

    public int getTahunSekarang(int tahun){
        return this.tahunSekarang=tahun;
    }
    
    public void setJMLHalaman(int jml){
        this.jmlHalaman = jml;
    }
    
    @Override
    public void reputasi() {
        System.out.println("Penerbit memiliki reputasi");
    }

    @Override
    public void alamatPenerbit(String alamat) {
        System.out.println("Alamat penerbit: "+alamat);
    }

    @Override
    public void tahunBerdiri(int tahun) {
        System.out.println("Penerbit ini berdiri pada tahun "+tahun+", "
                + "sehingga Penerbit ini sekarang berusia: "+(tahunSekarang-tahun)+" tahun");
    }
    
}
