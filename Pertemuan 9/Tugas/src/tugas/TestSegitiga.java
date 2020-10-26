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
public class TestSegitiga {
    public static void main(String[] args) {
        
        Segitiga s1 = new Segitiga();
        
        System.out.println("Total sudut : "+s1.totalSudut(30));
        System.out.println("Total sudut : "+s1.totalSudut(10,5));
        System.out.println("Keliling    : "+s1.keliling(5, 5, 9));
        System.out.println("Keliling    : "+s1.keliling(8, 5));
    }
}
