/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package percobaan4;

/**
 *
 * @author User
 */
public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    public Kursi(String nomor) {
        this.nomor = nomor;
    }   
    
    public void setNomor(String nomor){
        this.nomor = nomor;
    }
    
    public void setPenumpang(Penumpang penumpang){
        this.penumpang = penumpang;
    }
    
    public String getNomor(){
        return nomor;
    }
    
    public Penumpang getPenumpang(){
        return penumpang;
    }
    
    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
            if (this.penumpang != null) {
                 info += "Penumpang: " + penumpang.info() + "\n";
            }
    return info;
    }
    
}
