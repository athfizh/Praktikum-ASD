package Jobsheet7;
import java.util.Scanner;
public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = sc.nextInt();
        MahasiswaBerprestasi05 list = new MahasiswaBerprestasi05(jumMhs);
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            String nim = sc.next();
            System.out.print("Nama    : ");
            String nama = sc.next();
            System.out.print("Kelas   : ");
            String kelas = sc.next();
            System.out.print("IPK     : ");
            double ipk = sc.nextDouble();
            System.out.println("-----------------------------------");
            list.tambah(new Mahasiswa05(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("-----------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-----------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        
        System.out.println("-----------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("-----------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        System.out.println("-----------------------------------");
        System.out.println("Menggunakan sequential searching");
        System.out.println("-----------------------------------");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}