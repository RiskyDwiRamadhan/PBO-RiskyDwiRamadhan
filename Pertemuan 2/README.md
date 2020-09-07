# Laporan Tugas 2
## Kode Program Peminjaman
public class Peminjaman {

    public String id,namaMember,namaGame;
    
    public int hargaGame,lamaSewa;
    
    public void tampilData(){
        System.out.println("Id Peminjam     : "+id);
        System.out.println("Nama Peminjam   : "+namaMember);
        System.out.println("Nama Game       : "+namaGame);
        System.out.println("Harga Game      : Rp."+hargaGame);
        System.out.println("Lama Sewa       : "+lamaSewa+" Hari");
    }
    public int hitungTotalHarga(){
        int totalHarga = hargaGame*lamaSewa;
        return totalHarga;
    }   
}
## Kode Program Lingkaran
public class Lingkaran {

    public double phi=3.14,r,luas,keliling;
    
    public double hitungLuas(){
        luas = phi*r*r;
        return luas;
    }
    
    
    public double hitungKeliling(){
        keliling = 2*phi*r;
        return keliling;
    }
    
}
## Kode Program Barang
public class Barang {

    public String kode,namaBarang;
    
    public int hargaDasar;
    
    public float diskon;
    
    public void tampilData(){
        System.out.println("Kode Barang     : "+kode);
        System.out.println("Nama Barang     : "+namaBarang);
        System.out.println("Harga Dasar     : Rp."+hargaDasar);
        System.out.println("Diskon          : " +diskon+ " %");
    }
    public int hitungHargaJual(){
        diskon = diskon / 100;
        int hargaJual = (int)(hargaDasar-(diskon*hargaDasar));
        return hargaJual;
    }
    
}
## Kode Program TestProgram
public class TestProgram {

    public static void main(String[] args) {
        

        System.out.println("=============================");
        System.out.println("=Nama  : Risky Dwi Ramadhan =");
        System.out.println("=Kelas : TI-2C              =");
        System.out.println("=============================");
        System.out.println("");
        
        //peminjaman
        Peminjaman p =new Peminjaman();
        System.out.println("=============================");
        System.out.println("Program Peminjaman Vidio Game");
        System.out.println("=============================");
        
        p.id = "12345";
        p.namaMember = "Risky";
        p.namaGame = "Tetris";
        p.hargaGame = 20000;
        p.lamaSewa = 3;
        
        p.tampilData();
        System.out.println("Total Harga     : "+ p.hitungTotalHarga());
        System.out.println("=============================");
        System.out.println("");
        
        //Lingkaran
        Lingkaran l = new Lingkaran();
        System.out.println("=============================");
        System.out.println("     Program Lingkaran");
        System.out.println("=============================");
        
        l.r=10;
        
        System.out.println("Jari-jari Lingkaran adalah  "+l.r);
        System.out.println("Luas Lingkaran adalah       "+ l.hitungLuas());        
        System.out.println("Keliling Lingkaran adalah   "+ l.hitungKeliling());
        System.out.println("=============================");
        System.out.println("");
                
        //Barang
        Barang b = new Barang();
        System.out.println("=============================");
        System.out.println("       Program Barang");
        System.out.println("=============================");
        
        b.kode = "KB039";
        b.namaBarang = "Susu Kotak";
        b.hargaDasar = 10000;
        b.diskon = 1;
        
        b.tampilData();
        System.out.println("Total Harga     : "+ b.hitungHargaJual());
        System.out.println("=============================");
        
    }
}

## Output Program

<img src="image/Output.png" />
