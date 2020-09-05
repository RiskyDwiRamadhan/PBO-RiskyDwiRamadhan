Kode program leptop

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


Kode program tas

public class tas {    
    private String jenisTas,warna;    
    private int harga;
    
    public void setJenisTas(String newValue){
        jenisTas = newValue;
    }    
    
    public void setWarna(String newValue){
        warna = newValue;
    }       
    
    public void setHarga(int newValue){
        harga = newValue;
    }       
    
    public void cetakStatus(){
        System.out.println("Jenis Tas: "+jenisTas);
        System.out.println("Warna: " +warna);
        System.out.println("Harga: Rp." +harga);
    }
}


Kode program sepatu

public class sepatu {
    private String merek,warna,material;    
    
    public void setMerek(String newValue){
        merek = newValue;
    }    
    
    public void setWarna(String newValue){
        warna = newValue;
    }       
    
    public void setMaterial(String newValue){
        material = newValue;
    }       
    
    public void cetakStatus(){
        System.out.println("Merek: "+merek);
        System.out.println("Material: " +material);
        System.out.println("Warna: " +warna);
    }
}


Kode program sepatu lari

public class Sepatulari extends sepatu{        
    private String tahan;    
        
    public void settahan(String newValue){
        tahan = newValue;
    }   
    
    public void cetakStatus(){
        super.cetakStatus();  
        System.out.println("Tahan Terhadap : "+tahan);
    }
}


Kode program sepatu sepak bola

public class SepatuSepakBola extends sepatu{    
    private String tali;   
    public void setTali(String newValue){
        tali = newValue;
    }   
    
    public void cetakStatus(){  
        super.cetakStatus();
        System.out.println("Jenis Tali: "+tali);
    }
}


Kode program demo program

public class Demo {

    public static void main(String[] args) {
        SepatuSepakBola ssb = new SepatuSepakBola();
        Sepatulari sl = new Sepatulari();
        leptop l = new leptop();
        tas t = new tas();
        
        System.out.println("Nama  : Risky Dwi Ramadhan");
        System.out.println("Kelas : TI-2C");
        System.out.println("");
        System.out.println("");
        
        //Sepatu Bola        
        ssb.setMerek("Specs Accelerator");
        ssb.setMaterial("Rubber(karet)");
        ssb.setWarna("Hitam");
        ssb.setTali("Rubber(karet)");
        ssb.cetakStatus();
        System.out.println("");
        
        //Sepatu Lari        
        sl.setMerek("Adidas Neo Spyder");
        sl.setMaterial("Kanvas");
        sl.setWarna("Merah");
        sl.settahan("Percikan air");
        sl.cetakStatus();
        System.out.println("");
        
        //Leptop       
        l.setMerek("Lenovo");
        l.setWarna("Merah");
        l.setProsesor("Intel CORE I3");
        l.cetakStatus();
        System.out.println("");
        
        t.setJenisTas("Tas Sekola");
        t.setWarna("Cokelat");
        t.setHarga(40000);
        t.cetakStatus();
        System.out.println("");
        
    }
    
}

Output Program
<img src="image/Output.png" />
