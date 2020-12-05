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
public class TestAnggota {
    public static void main(String[] args){
        Anggota kat1 = new Anggota("Risky", "Pasuruan","082999234763");
        Anggota kat2 = new Anggota("Dwi", "Pasuruan","082398167363");
        Anggota kat3 = new Anggota("Ramadhan", "Pasuruan","083282734763");

        // TestAnggota insert
        kat1.save();
        kat2.save();
        kat3.save();

        // TestAnggota update
        kat2.setAlamat("Malang");
        kat2.save();

        // TestAnggota delete
        kat3.delete();

        // TestAnggota select all
        for(Anggota k : new Anggota().getAll()){
           System.out.println("Nama: " + k.getNama() + ", Alamat: " + k.getAlamat()+ ", Telepon: " + k.getTelepon());
        }

        // TestAnggota search
        for(Anggota k : new Anggota().search("Malang")){
           System.out.println("Nama: " + k.getNama() + ", Alamat: " + k.getAlamat()+ ", Telepon: " + k.getTelepon());
        }
     }
    
}
