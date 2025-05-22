package Jobsheet11;
import java.util.Scanner;

public class LayananUnitKemahasiswaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListLayananUnit antrian = new LinkedListLayananUnit();
        int pilihan;

        System.out.println("======================================================");
        System.out.println("    SISTEM ANTRIAN LAYANAN UNIT KEMAHASISWAAN");
        System.out.println("======================================================");

        do {
            System.out.println("\n=== MENU ANTRIAN LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Kosongkan Antrian");
            System.out.println("4. Tambah Antrian");
            System.out.println("5. Panggil Antrian");
            System.out.println("6. Lihat Antrian Terdepan Dan Paling Akhir");
            System.out.println("7. Lihat Jumlah Antrian Mahasiswa");
            System.out.println("0. Keluar");
            System.out.println("===============================================");

            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                    
                case 2:
                    if (antrian.cekAntrianPenuh()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian belum penuh.");
                    }
                    break;
                    
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian sudah kosong.");
                    } else {
                        System.out.print("Apakah Anda yakin ingin mengosongkan antrian? (y/n): ");
                        sc.nextLine(); 
                        String konfirmasi = sc.nextLine();
                        if (konfirmasi.equalsIgnoreCase("y") || konfirmasi.equalsIgnoreCase("yes")) {
                            antrian.kosongkan();
                        } else {
                            System.out.println("Pembatalan mengosongkan antrian.");
                        }
                    }
                    break;
                    
                case 4: {
                    if (antrian.cekAntrianPenuh()) {
                        System.out.println("Antrian penuh! Tidak dapat menambahkan mahasiswa baru.");
                        break;
                    }
                    
                    sc.nextLine();
                    System.out.println("\n=== PENDAFTARAN ANTRIAN ===");
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.daftarkanData(mhs);
                    break;
                }
                
                case 5:
                    antrian.memanggilAntrian();
                    break;
                    
                case 6:
                    antrian.tampilAntrianDepanTerakhir();
                    break;
                    
                case 7: 
                    antrian.tampilMahasiswaYangMengantre();
                    break;
                    
                case 0:
                    System.out.println("Terima kasih telah menggunakan Sistem Layanan Unit Kemahasiswaan!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 0-7.");
            }
        } while (pilihan != 0);
    }
}