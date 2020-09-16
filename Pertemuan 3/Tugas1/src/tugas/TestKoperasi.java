/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestKoperasi {
    public static void main(String[] args){        
        Scanner sc = new Scanner(System.in);
        int pinjam, angsur;
        
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        
        System.out.println("\nMeminjam uang sebesar");
        System.out.print("Rp.");
        pinjam = sc.nextInt();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini: Rp." + donny.getJumlahPinjaman());
        
        System.out.println("\nMeminjam uang sebesar");
        System.out.print("Rp.");
        pinjam = sc.nextInt();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini: Rp." + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran sebesar");
        System.out.print("Rp.");
        angsur = sc.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: Rp." + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran sebesar");
        System.out.print("Rp.");
        angsur = sc.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: Rp." + donny.getJumlahPinjaman());
    }
}
