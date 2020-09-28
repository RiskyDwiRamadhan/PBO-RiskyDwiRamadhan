/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kuis1;

/**
 *
 * @author User
 */
public class Kuis1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//  Data Pertama
        Pria p1 = new Pria();
        p1.setNama("Budi Hariono");
        p1.setUmur(30);

        Wanita w1 = new Wanita();
        w1.setNama("Anisa Putri");
        w1.setUmur(24);

        Manusia anak1 = new Manusia(15, "Ali Mahmud", false);

        p1.setIstri(w1);
        w1.setSuami(p1);
        w1.setAnak(anak1);
//  Data kedua       
        Pria p2 = new Pria();
        p2.setNama("Risky Dwi Ramadhan");
        p2.setUmur(20);

        Wanita w2 = new Wanita();
        w2.setNama("Indah Dewi");
        w2.setUmur(19);

        p2.setIstri(w1);
        w2.setSuami(p1);
        
        

        System.out.println("=====INFORMASI ORANG YANG TELAH BERKELUARGA=====");
        System.out.println("Orang Pertama");
        System.out.println(p1.info()); 
        System.out.println(p1.setStatus());
        System.out.println("");
        
        System.out.println("Orang Kedua");
        System.out.println(w1.info());
        System.out.println(w1.setStatus());
        
        System.out.println("=====INFORMASI ORANG YANG BELUM BERKELUARGA=====");
        System.out.println("Orang Pertama");
        System.out.println(p2.info()); 
        System.out.println(p2.setStatus());
        System.out.println("");
        
        System.out.println("Orang Kedua");
        System.out.println(w2.info());
        System.out.println(w2.setStatus());
        
    }
    
}
