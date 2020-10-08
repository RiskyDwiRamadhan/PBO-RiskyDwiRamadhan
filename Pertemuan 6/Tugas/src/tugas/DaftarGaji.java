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
public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlahPegawaiSekarang = 0;
    
    DaftarGaji(int jumlah_pegawai){
        listPegawai = new Pegawai[jumlah_pegawai];
    }
    
    public void addPegawai(Pegawai p){
        listPegawai[jumlahPegawaiSekarang] = p;
        jumlahPegawaiSekarang++;
    }
    
    public void printSemuaGaji(){
        for (int i=0;i<jumlahPegawaiSekarang;i++){
            System.out.print(listPegawai[i].getNama()+" mendapatkan gaji ");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}
