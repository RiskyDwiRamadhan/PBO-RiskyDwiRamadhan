/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Percobaan;

/**
 *
 * @author User
 */
public class Mahasiswa {
    public int nim;
    public String nama,alamat,kelas;
    
    public void tampiBiodata(){
        System.out.println("Nim     :"+nim);
        System.out.println("Nama    :"+nama);
        System.out.println("Alamat  :"+alamat);
        System.out.println("Kelas   :"+kelas);
    }
}
