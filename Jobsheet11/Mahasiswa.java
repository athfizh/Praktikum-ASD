package Jobsheet11;

public class Mahasiswa {
    String nama, nim, kelas, prodi;

    public Mahasiswa(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilInformasi() {
        System.out.printf("Nama: %s\n", nama);
        System.out.printf("NIM: %s\n", nim);
        System.out.printf("Prodi: %s\n", prodi);
        System.out.printf("Kelas: %s\n", kelas);
        System.out.println();
    }
}