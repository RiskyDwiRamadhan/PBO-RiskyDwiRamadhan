package tugas;

public class laptop extends komputer{
    public String jnsBatrei;

    public laptop(){

    }
    public laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei=jnsBatrei;
    }
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis baterai       : "+jnsBatrei);
        System.out.println("===============================================");
    }
}