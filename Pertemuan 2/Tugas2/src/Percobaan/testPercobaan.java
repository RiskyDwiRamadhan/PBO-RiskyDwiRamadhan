/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Percobaan;

/**
 *
 * @author User
 */
public class testPercobaan {
    public static void main(String[] args) {
        
        System.out.println("=============================");
        System.out.println("Program Mahasiswa");
        System.out.println("=============================");
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No. 1A";
        mhs1.kelas = "1A";
        mhs1.tampiBiodata();        
        System.out.println("=============================");
        
        
        System.out.println("=============================");
        System.out.println("Program Barang");
        System.out.println("=============================");
        Barang brg = new Barang();
        brg.namaBrg = "Pensil";
        brg.jenisBrg = "ATK";
        brg.stok = 10;
        brg.tampilBarang();
        System.out.println("Stok Baru Adalah "+brg.tambahBarang(20));
        System.out.println("=============================");
    }
}
