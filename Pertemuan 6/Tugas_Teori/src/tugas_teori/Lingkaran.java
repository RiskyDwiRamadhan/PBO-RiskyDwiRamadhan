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
public class Lingkaran extends BangunDatar{
    public float r;

    @Override
    public float luas() {
        float luas = (float) (3.14 *r*r);
        System.out.println("Luas Lingkaran : "+luas);
        return super.luas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float keliling() {
        float keliling = (float) (2*3.14*r);
        System.out.println("Keliling Lingkaran : "+keliling);
        return super.keliling(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
