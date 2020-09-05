Kode program
leptop

package tugas.pkg1;

/**
 *
 * @author User
 */
public class leptop {    
    private String merek,warna,prosesor;
    
    public void setMerek(String newValue){
        merek = newValue;
    }    
    
    public void setWarna(String newValue){
        warna = newValue;
    }       
    
    public void setProsesor(String newValue){
        prosesor = newValue;
    }       
    
    public void cetakStatus(){
        System.out.println("Merek: "+merek);
        System.out.println("Warna: " +warna);
        System.out.println("Prosesor: "+prosesor);
    }
}
<img src="image/Output.png" />
