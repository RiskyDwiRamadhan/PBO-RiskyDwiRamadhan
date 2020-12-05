/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frontend;
import backend.*;
/**
 *
 * @author User
 */
public class TestKategori{
    public static void main(String[] args){
        Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
        Kategori kat3 = new Kategori("Komik", "Komik anak-anak");

        // TestKategori insert
        kat1.save();
        kat2.save();
        kat3.save();

        // TestKategori update
        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        // TestKategori delete
        kat3.delete();

        // TestKategori select all
        for(Kategori k : new Kategori().getAll()){
           System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
        
        // TestKategori search
        for(Kategori k : new Kategori().search("ilmiah")){
           System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
     }

}
