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
public class KerajinanDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Topeng topeng = new Topeng("Malang = ", "Topeng Malang ", new Ornamen(200000));
        topeng.buatKerajinan();
        System.out.println("Nama Kerajinan = " +topeng.nama);
        System.out.println("Asal = "+topeng.asal);
        System.out.println("Harga Untuk Membuat = "+topeng.harga);
        topeng.perbaikiKerajinan();
        System.out.println("Harga Untuk Memperbaiki = "+topeng.harga);
        System.out.println("Harga Untuk Ornamen = "+topeng.ornamen.harga);
    }
    
}
