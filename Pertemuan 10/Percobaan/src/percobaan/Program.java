/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package percobaan;

/**
 *
 * @author User
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan lumbahLumbah = new Ikan();
        
        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");
        
        ani.pelihaanHewan(kucingKampung);
        budi.pelihaanHewan(lumbahLumbah);
        
        ani.ajakPelihaanJalanJalan();
        budi.ajakPelihaanJalanJalan();
    }
    
}
