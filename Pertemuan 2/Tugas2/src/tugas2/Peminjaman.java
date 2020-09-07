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
public class Peminjaman {
    public String id,namaMember,namaGame;
    public int hargaGame,lamaSewa;
    
    public void tampilData(){
        System.out.println("Id Peminjam     : "+id);
        System.out.println("Nama Peminjam   : "+namaMember);
        System.out.println("Nama Game       : "+namaGame);
        System.out.println("Harga Game      : Rp."+hargaGame);
        System.out.println("Lama Sewa       : "+lamaSewa+" Hari");
    }
    public int hitungTotalHarga(){
        int totalHarga = hargaGame*lamaSewa;
        return totalHarga;
    }   
}
