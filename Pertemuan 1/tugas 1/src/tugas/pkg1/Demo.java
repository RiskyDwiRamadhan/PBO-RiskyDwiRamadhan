/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas.pkg1;

/**
 *
 * @author User
 */
public class Demo {

    public static void main(String[] args) {
        SepatuSepakBola ssb = new SepatuSepakBola();
        Sepatulari sl = new Sepatulari();
        leptop l = new leptop();
        tas t = new tas();
        
        System.out.println("Nama  : Risky Dwi Ramadhan");
        System.out.println("Kelas : TI-2C");
        System.out.println("");
        System.out.println("");
        
        //Sepatu Bola        
        ssb.setMerek("Specs Accelerator");
        ssb.setMaterial("Rubber(karet)");
        ssb.setWarna("Hitam");
        ssb.setTali("Rubber(karet)");
        ssb.cetakStatus();
        System.out.println("");
        
        //Sepatu Lari        
        sl.setMerek("Adidas Neo Spyder");
        sl.setMaterial("Kanvas");
        sl.setWarna("Merah");
        sl.settahan("Percikan air");
        sl.cetakStatus();
        System.out.println("");
        
        //Leptop       
        l.setMerek("Lenovo");
        l.setWarna("Merah");
        l.setProsesor("Intel CORE I3");
        l.cetakStatus();
        System.out.println("");
        
        t.setJenisTas("Tas Sekola");
        t.setWarna("Cokelat");
        t.setHarga(40000);
        t.cetakStatus();
        System.out.println("");
        
    }
    
}
