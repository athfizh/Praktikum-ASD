package Jobsheet9;
public class Mahasiswa05 {
    String nim, nama, kelas;
    int nilai;

    Mahasiswa05() {
    }

    Mahasiswa05(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}