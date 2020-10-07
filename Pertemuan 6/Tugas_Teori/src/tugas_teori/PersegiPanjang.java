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
public class PersegiPanjang extends BangunDatar{
    public float panjang;
    public float lebar;

    @Override
    public float luas() {
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : "+luas);
        return super.luas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float keliling() {
        float keliling = 2*(panjang+lebar) ;
        System.out.println("Keliling Persegi Panjang : "+keliling);
        return super.keliling(); //To change body of generated methods, choose Tools | Templates.
    }
}
