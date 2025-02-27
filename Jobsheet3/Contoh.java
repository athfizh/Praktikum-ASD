package Jobsheet3;
public class Contoh {
    String nim;
    String nama;
    String kelas;
    float ipk;
    
    public Contoh() {
        this.nim = "Contoh";
        this.nama = "Contoh";
        this.kelas = "Contoh";
        this.ipk = 0.0f;
    }
    public Contoh(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = "Contoh";
        this.ipk = 0.0f;
    }
    public Contoh(String nim, String nama, String kelas, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampilkanInfo() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("----------------------------");
    }
}