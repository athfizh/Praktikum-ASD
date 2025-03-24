package Jobsheet6;
import java.util.Scanner;
public class DosenDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen05 dosen = new DataDosen05();
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan Data Dosen Ke-" + (i + 1));
            System.out.print("Masukkan Kode                 : ");
            String kode = sc.nextLine();
            System.out.print("Masukkan Nama                 : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita)   : ");
            String jenisKelamin = sc.nextLine();
            boolean jk = false;
            if (jenisKelamin.equalsIgnoreCase("wanita")) {
                jk = true;
            }
            System.out.print("Masukkan Usia                 : ");
            int usia = sc.nextInt();
            sc.nextLine();
            Dosen05 dsn = new Dosen05(kode, nama, jk, usia);
            dosen.tambah(dsn);
            System.out.println();
        }

        System.out.println("Data dosen sebelum sorting: ");
        dosen.tampil();

        System.out.println();
        System.out.println("Data dosen setelah sorting menggunakan BUBBLE SORT (ASC): ");
        dosen.sortingASC();
        dosen.tampil();

        System.out.println();
        System.out.println("Data dosen setelah sorting menggunakan SELECTION SORT (DSC) : ");
        dosen.sortingDSC();
        dosen.tampil();

        System.out.println();
        System.out.println("Data dosen setelah sorting menggunakan INSERTION SORT (DSC) : ");
        dosen.insertionSort();
        dosen.tampil();
    }
}