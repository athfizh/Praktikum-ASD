package Jobsheet6;
public class Dosen05 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen05() {
    }

    Dosen05 (String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampilData() {
        System.out.println("Kode Dosen : " + kode);
        System.out.println("Nama Dosen : " + nama);
        if (jenisKelamin == true) {
            System.out.println("Jenis Kelamin : Wanita");
        } else {
            System.out.println("Jenis Kelamin : Pria");
        }
        System.out.println("Usia Dosen : " + usia);
    }
}