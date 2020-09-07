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
public class Barang {
    public String kode,namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public void tampilData(){
        System.out.println("Kode Barang     : "+kode);
        System.out.println("Nama Barang     : "+namaBarang);
        System.out.println("Harga Dasar     : Rp."+hargaDasar);
        System.out.println("Diskon          : " +diskon+ " %");
    }
    public int hitungHargaJual(){
        diskon = diskon / 100;
        int hargaJual = (int)(hargaDasar-(diskon*hargaDasar));
        return hargaJual;
    }
    
}
