/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas;

/**
 *
 * @author User
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Dosen d1 = new Dosen("12345","Budi Sutejo","Jl.Melati");
        d1.setSKS(10);
        
        Dosen d2 = new Dosen("12346","Anita Ayu","Jl.Mawar");
        d2.setSKS(9);
        
        Pegawai p1 = new Pegawai("12245","Umar Bhakri","Jl.Ikan Asin");
        
        Pegawai p2 = new Pegawai("12246","Husen","");
        
        DaftarGaji daftar_gaji = new DaftarGaji(5);
        
        daftar_gaji.addPegawai(d1);
        daftar_gaji.addPegawai(d2);
        daftar_gaji.addPegawai(p1);
        daftar_gaji.addPegawai(p2);
        
        System.out.println("==================+++++==================");
        System.out.println("      Daftar Gaji Dosen Dan Pegawai ");
        System.out.println("==================+++++==================");
        daftar_gaji.printSemuaGaji();
        System.out.println("==================+++++==================");
    }    
    
}
