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
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RodaGigi gigi = new RodaGigi();
        BahanBakar bbm = new BahanBakar();
        SepedaMotor spd = new SepedaMotor();
        Pengendara p = new Pengendara();
        
        gigi.setGigi(5);
        
        bbm.setBBM("Pertalite");
        
        spd.setBBM(bbm);
        spd.setGigi(gigi);
        spd.setPlatNo("N 2931 XA");
        spd.setMerk("Vario");
        spd.setWarna("Abu-abu");
        
        p.setSepeda(spd);
        p.setNoKtp("01392823");
        p.setNama("Risky Dwi Ramadhan");
        p.setAlamat("Pasuruan");
        
        System.out.println(p.info());
        p.info();
    }
    
}
