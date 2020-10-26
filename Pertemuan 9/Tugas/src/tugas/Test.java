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
public class Test {
    
    public static void main(String[] args) {
        Manusia m = new Manusia();
        Dosen d = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        
        m.bernafas();
        m.makan();
        System.out.println("");
        
        d.makan();
        d.lembur();
        System.out.println("");
        
        mhs.makan();
        mhs.tidur();
        
    }
}
