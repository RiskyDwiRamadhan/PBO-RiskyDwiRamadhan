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
public class Staff extends Karyawan{
    public int lembur, potongan;

    public Staff() {
    }

    public Staff(int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaff(){
        super.tampilDataKaryawan();
        System.out.println("Lembur              = "+lembur);
        System.out.println("Potongan            = "+potongan);
        System.out.println("Total Gaji          = "+(gaji+lembur-potongan));
    }
    
    
}
