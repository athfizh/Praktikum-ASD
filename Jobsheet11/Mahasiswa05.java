package Jobsheet11;
public class Mahasiswa05 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa05() {
    }

    public Mahasiswa05(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.printf("\n%-10s %-10s %-10s %.1f", nama, nim, kelas, ipk);
    }
}