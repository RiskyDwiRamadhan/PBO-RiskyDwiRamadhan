/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teori;

/**
 *
 * @author User
 */
public class TestBayaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manajer man = new Manajer ("Agus", 800, 50);
        Programmer prog = new Programmer("Budi", 600, 30);
        Bayaran hr = new Bayaran();
     
        System.out.println("Bayaran untuk manajer: " + hr.hitungBayaran(man));
        System.out.println("Bayaran untuk Progammer: " + hr.hitungBayaran(prog));
    }
    
}
