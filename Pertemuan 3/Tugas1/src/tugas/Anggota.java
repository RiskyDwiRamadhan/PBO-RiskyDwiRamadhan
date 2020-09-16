/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas;

import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author User
 */
public class Anggota {
    private String noKTP, nama;
    private int limitPinjaman, jumlahPinjaman;

    Anggota(String noKtp, String nama, int limitPinjaman) {
        this.noKTP = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }
    
    public String getNama(){     
        return nama;
    }
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
    public int getJumlahPinjaman(){        
        return jumlahPinjaman;
    }
    public void pinjam(int uang){
        if(uang < limitPinjaman){
            jumlahPinjaman += uang;
        }else{
            System.out.println("Maaf, Jumlah pinjaman melebihi limit.");            
        }
    }
    public void angsur(int uang){        
        if(uang > ((jumlahPinjaman*10)/100)){
            jumlahPinjaman -= uang;
        }else{
            System.out.println("Maaf, ansuran harus 10% dari jumlah pinjaman.");
        }
    }
    
}
