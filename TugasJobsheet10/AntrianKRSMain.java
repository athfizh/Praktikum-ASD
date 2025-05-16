package TugasJobsheet10;
import java.util.Scanner;
public class AntrianKRSMain {
    public static void menu() {
        System.out.println("\n=== Sistem Antrian Persetujuan KRS ===");
        System.out.println("1. Tambah Mahasiswa ke Antrian");
        System.out.println("2. Proses KRS (2 Mahasiswa)");
        System.out.println("3. Cek Antrian Kosong");
        System.out.println("4. Cek Antrian Penuh");
        System.out.println("5. Tampilkan Semua Antrian");
        System.out.println("6. Tampilkan 2 Antrian Terdepan");
        System.out.println("7. Tampilkan Antrian Paling Akhir");
        System.out.println("8. Tampilkan Jumlah Antrian");
        System.out.println("9. Tampilkan Jumlah Mahasiswa yang Sudah Proses KRS");
        System.out.println("10. Tampilkan Jumlah Mahasiswa yang Belum Proses KRS");
        System.out.println("11. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.println("-----------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianKRS[] antrian = new AntrianKRS[3];
        for (int i = 0; i < antrian.length; i++) {
            antrian[i] = new AntrianKRS(30);
        }
        
        int pilih;
        int dpaPilihan;
        
        do {
            menu();
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();
            
            if (pilih >= 1 && pilih <= 11) {
                System.out.println("\nPilih DPA (1-3): ");
                dpaPilihan = sc.nextInt() - 1; sc.nextLine();
                
                if (dpaPilihan < 0 || dpaPilihan >= antrian.length) {
                    System.out.println("DPA tidak valid");
                    continue;
                }
            } else {
                dpaPilihan = 0;
            }
            
            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian[dpaPilihan].Enqueue(mhs);
                    break;
                case 2:
                    System.out.println("Proses KRS untuk DPA " + (dpaPilihan + 1));
                    antrian[dpaPilihan].Dequeue();
                    break;
                case 3:
                    if (antrian[dpaPilihan].IsEmpty()) {
                        System.out.println("Antrian DPA " + (dpaPilihan + 1) + " kosong");
                    } else {
                        System.out.println("Antrian DPA " + (dpaPilihan + 1) + " tidak kosong");
                    }
                    break;
                case 4:
                    if (antrian[dpaPilihan].IsFull()) {
                        System.out.println("Antrian DPA " + (dpaPilihan + 1) + " penuh");
                    } else {
                        System.out.println("Antrian DPA " + (dpaPilihan + 1) + " tidak penuh");
                    }
                    break;
                case 5:
                    System.out.println("Antrian DPA " + (dpaPilihan + 1) + ":");
                    antrian[dpaPilihan].print();
                    break;
                case 6:
                    System.out.println("Dua Antrian Terdepan DPA " + (dpaPilihan + 1) + ":");
                    antrian[dpaPilihan].peek();
                    break;
                case 7:
                    System.out.println("Antrian Terakhir DPA " + (dpaPilihan + 1) + ":");
                    antrian[dpaPilihan].peekRear();
                    break;
                case 8:
                    System.out.println("Jumlah antrian DPA " + (dpaPilihan + 1) + ": " + 
                                      antrian[dpaPilihan].getSize() + " mahasiswa");
                    break;
                case 9:
                    System.out.println("Jumlah mahasiswa yang sudah proses KRS di DPA " + 
                                      (dpaPilihan + 1) + ": " + antrian[dpaPilihan].getJumlahProses());
                    break;
                case 10:
                    System.out.println("Jumlah mahasiswa yang belum proses KRS di DPA " + 
                                      (dpaPilihan + 1) + ": " + antrian[dpaPilihan].getJumlahBelumProses());
                    break;
                case 11:
                    antrian[dpaPilihan].clear();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program antrian KRS.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
        
        sc.close();
    }
}