/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package koperasigettersetter;

/**
 *
 * @author User
 */
public class KoperasiDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Iwan","Jalan Mawar");
        System.out.println("Simpan "+anggota1.getNama()+" : Rp."+anggota1.getSimpan());
        
        
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpan "+anggota1.getNama()+" : Rp."+anggota1.getSimpan());
        
        anggota1.pinjam(5000);
        System.out.println("Simpan "+anggota1.getNama()+" : Rp."+anggota1.getSimpan());
    }
    
}
