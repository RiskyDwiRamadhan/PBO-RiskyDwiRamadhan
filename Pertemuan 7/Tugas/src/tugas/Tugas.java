package tugas;

public class Tugas {

    public static void main(String[] args) {
        pc pc = new pc("ASUS", 3, 6, "Inter core i5", 15);
        pc.tampilPc();
        System.out.println("");
        
        mac mac = new mac("MacBook", 4, 8, "Quad-core i7", "Polimer", "Kaca layar bebas arsenik");
        mac.tampilMac();
        System.out.println("");
        
        windows windows = new windows("HP", 3, 6, "Intel core i5", "Li-ion", "Layar IPS");
        windows.tampilWindows();
    }
}
