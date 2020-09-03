/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sepeda;

/**
 *
 * @author User
 */
public class SepedaDemo {
    public static void main(String[] args) {
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();
        
        spd1.setMerek("Polygone");
        spd1.tambahkecepatan(10);
        spd1.gantigear(2);
        spd1.cetakStatus();
        
        spd2.setMerek("Wiim Cycle");
        spd2.tambahkecepatan(10);
        spd2.gantigear(2);
        spd2.tambahkecepatan(10);
        spd2.gantigear(3);
        spd2.cetakStatus();
        
        spd3.setMerek("Klinee");
        spd3.tambahkecepatan(5);
        spd3.gantigear(7);
        spd3.setTipeSuspension("Gas Suspension");
        spd3.cetakStatus();
    }
}
