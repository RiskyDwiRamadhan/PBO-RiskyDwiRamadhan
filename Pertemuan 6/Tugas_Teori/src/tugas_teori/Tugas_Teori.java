/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas_teori;

/**
 *
 * @author User
 */
public class Tugas_Teori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Segitiga s = new Segitiga();
        s.alas = 5;
        s.tinggi = 4;
        
        PersegiPanjang p = new PersegiPanjang();
        p.lebar = 5;
        p.panjang = 10;
        
        Lingkaran l = new Lingkaran();
        l.r = 5;
        
        System.out.println("Menghitung luas dan keliling Segitiga");
        s.luas();
        s.keliling();
        System.out.println("");
        
        System.out.println("Menghitung luas dan keliling Persegi Panjang");
        p.luas();
        p.keliling();
        System.out.println("");
        
        System.out.println("Menghitung luas dan keliling Lingkaran");
        l.luas();
        l.keliling();
    }
    
}
