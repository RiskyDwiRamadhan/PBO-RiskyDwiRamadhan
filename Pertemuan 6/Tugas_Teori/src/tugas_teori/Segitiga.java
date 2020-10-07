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
public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;

    @Override
    public float luas() {
        float luas = (alas*tinggi)/2;
        System.out.println("Luas Segitiga   : "+luas);
        return super.luas();         
    }

    @Override
    public float keliling() {
        float m = (float) ((alas*tinggi)+(tinggi*tinggi));
        float keliling = m + alas + tinggi;
        System.out.println("Keliling Segitiga   : "+keliling);
        return super.keliling(); //To change body of generated methods, choose Tools | Templates.
    }
}
