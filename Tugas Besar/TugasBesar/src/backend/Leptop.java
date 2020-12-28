/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backend;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Leptop {
    private int idLep;
    private Spesifikasi spek = new Spesifikasi();
    private String warna;
    private int harga;
    private int stok;
    

    public Leptop() {
    }

    public Leptop(Spesifikasi spek, String warna, int harga, int stok) {
        this.spek = spek;
        this.warna = warna;
        this.harga = harga;
        this.stok = stok;
    }

    public int getIdLep() {
        return idLep;
    }

    public void setIdLep(int idLep) {
        this.idLep = idLep;
    }

    public Spesifikasi getSpek() {
        return spek;
    }

    public void setSpek(Spesifikasi spek) {
        this.spek = spek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
}
