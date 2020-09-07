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
public class TestProgram {
    public static void main(String[] args) {
        

        System.out.println("=============================");
        System.out.println("=Nama  : Risky Dwi Ramadhan =");
        System.out.println("=Kelas : TI-2C              =");
        System.out.println("=============================");
        System.out.println("");
        
        //peminjaman
        Peminjaman p =new Peminjaman();
        System.out.println("=============================");
        System.out.println("Program Peminjaman Vidio Game");
        System.out.println("=============================");
        
        p.id = "12345";
        p.namaMember = "Risky";
        p.namaGame = "Tetris";
        p.hargaGame = 20000;
        p.lamaSewa = 3;
        
        p.tampilData();
        System.out.println("Total Harga     : "+ p.hitungTotalHarga());
        System.out.println("=============================");
        System.out.println("");
        
        //Lingkaran
        Lingkaran l = new Lingkaran();
        System.out.println("=============================");
        System.out.println("     Program Lingkaran");
        System.out.println("=============================");
        
        l.r=10;
        
        System.out.println("Jari-jari Lingkaran adalah  "+l.r);
        System.out.println("Luas Lingkaran adalah       "+ l.hitungLuas());        
        System.out.println("Keliling Lingkaran adalah   "+ l.hitungKeliling());
        System.out.println("=============================");
        System.out.println("");
                
        //Barang
        Barang b = new Barang();
        System.out.println("=============================");
        System.out.println("       Program Barang");
        System.out.println("=============================");
        
        b.kode = "KB039";
        b.namaBarang = "Susu Kotak";
        b.hargaDasar = 10000;
        b.diskon = 1;
        
        b.tampilData();
        System.out.println("Total Harga     : "+ b.hitungHargaJual());
        System.out.println("=============================");
        
    }
}
