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
public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;

    public Orang(String nama) {
        this.nama = nama;
    }
    
    public void pelihaanHewan(Hewan hewanPelihaan){
        this.hewanPeliharaan = hewanPelihaan;
    }
    
    public void ajakPelihaanJalanJalan(){
        System.out.println("Namaku "+this.nama);
        System.out.println("Hewan pelihaan berjalan dengan cara: ");
        this.hewanPeliharaan.bergerak();
        System.out.println("-------------------------------------");
    }
}
