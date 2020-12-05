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
public class test {
    public static void main(String[] args) {
//        ArrayList<Peminjaman> list = new Peminjaman().searchBuku("3");
//        for(Peminjaman ang : list){
//            System.out.println(ang.getJudul());
        ArrayList<Kategori> list = new Peminjaman().getAll();
        for(Kategori ang : list){
            System.out.println(ang.getIdKategori());
        }
    }
}
