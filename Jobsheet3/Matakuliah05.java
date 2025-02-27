package Jobsheet3;
import java.util.Scanner;
    public class Matakuliah05 {
        String kode;
        String nama;
        int sks;
        int jumlahJam;

    public Matakuliah05() {
    }

    public void tambahData(Scanner sc) {
        String dummy;
        System.out.print("Kode       : ");
        this.kode = sc.nextLine();
        System.out.print("Nama       : ");
        this.nama = sc.nextLine();
        System.out.print("SKS        : ");
        dummy = sc.nextLine();
        this.sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam : ");
        dummy = sc.nextLine();
        this.jumlahJam = Integer.parseInt(dummy);
        System.out.println("-----------------------------------------");
    }

    public void cetakInfo() {
        System.out.println("Kode       : " + this.kode);
        System.out.println("Nama       : " + this.nama);
        System.out.println("SKS        : " + this.sks);
        System.out.println("Jumlah Jam : " + this.jumlahJam);
        System.out.println("-----------------------------------------");
    }
}