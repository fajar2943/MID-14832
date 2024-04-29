import java.util.Scanner;
public class RumahMakan implements RumahMakanInterface{

    private String nim;
    private String alamat;
    private String kota;

    public RumahMakan(String nim, String alamat, String kota){
        this.nim = nim;        
        this.alamat = alamat;        
        this.kota = kota;        
    }

    public void pesan(){
        Scanner nama_ctrl = new Scanner(System.in);
        Scanner nama_ctrl = new Scanner(System.in);

        System.out.println("====Selamat Datang di Rumah Makan " + this.nim + " Cabang "+ this.alamat + ", "+ this.kota +" =====");
        System.out.println("Untuk memesan, silahkan isi form dibawah ini..!");
        System.out.println("Masukan nama anda : ");
        String nama = nama_ctrl.nextLine();
        System.out.println("nama anda : " + nama);
    }
}