/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class test {
    public static void main(String[] args) {
//        String [] kolom ={"ID Tra", "Nama Karyawan", "Nama Customer", "Merek", "Harga", "Tanggal Tra", "QTY", "Total Harga", };
        ArrayList<Transaksi> list = new Transaksi().getAll();
        for(Transaksi ang : list){
            System.out.print("id tra "+ang.getIdTra());
            System.out.print(" nama kar "+ang.getK().getNama());
            System.out.print(" nama cus "+ang.getC().getNama());
            System.out.print(" merek "+ang.getMerek());
            System.out.print(" harga "+ang.getL().getHarga());
            System.out.print(" tgl "+ang.getTgl());
            System.out.print(" qty "+ang.getQty());
            System.out.println(" total "+ang.getTotal());
        }
    }
}
