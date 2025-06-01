package Jobsheet12;
import java.util.Scanner;
public class DLLMain {
    static Scanner sc = new Scanner(System.in);
    public static Mahasiswa05 inputMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas, ipk);
        return mhs;
    }

    public static void main(String[] args) {
        DoubleLinkedLists05 list = new DoubleLinkedLists05();
        int pilihan;

            do {
                System.out.println("\nMenu Double Linked List Mahasiswa");
                System.out.println("1. Tambah di awal");
                System.out.println("2. Tambah di akhir");
                System.out.println("3. Hapus dari awal");
                System.out.println("4. Hapus dari akhir");
                System.out.println("5. Tampilkan data");
                System.out.println("6. Cari Mahasiswa berdasarkan NIM");
                System.out.println("7. Tambah data setelah Mahasiswa tertentu");
                System.out.println("8. Tambah data pada indeks tertentu");
                System.out.println("9. Hapus data setelah Mahasiswa tertentu");
                System.out.println("10. Hapus data pada indeks tertentu");
                System.out.println("11. Tampilkan data pertama");
                System.out.println("12. Tampilkan data terakhir");
                System.out.println("13. Tampilkan data berdasarkan indeks");
                System.out.println("14. Tampilkan ukuran list");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = sc.nextInt();
                sc.nextLine();

                switch (pilihan) {
                    case 1: {
                        Mahasiswa05 mhs = inputMahasiswa();
                        list.addFirst(mhs);
                        break;
                    }
                    case 2: {
                        Mahasiswa05 mhs = inputMahasiswa();
                        list.addLast(mhs);
                        break;
                    }
                    case 3:
                        list.removeFirst();
                        break;
                    case 4:
                        list.removeLast();
                        break;
                    case 5:
                        list.print();
                        break;
                    case 6:
                        System.out.print("Masukkan NIM yang ingin dicari: ");
                        String nimCari = sc.nextLine();
                        Node05 found = list.search(nimCari);
                        if (found != null) {
                            System.out.println("Data Mahasiswa ditemukan:");
                            found.data.tampil();
                        } else {
                            System.out.println("Data Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                        }
                        break;
                    case 7:
                        System.out.print("Masukkan NIM yang ingin dicari: ");
                        String keyNim = sc.nextLine();
                        Node05 foundNode = list.search(keyNim);
                        if (foundNode != null) {
                            System.out.println("Masukkan data Mahasiswa baru:");
                            Mahasiswa05 newMhs = inputMahasiswa();
                            list.insertAfter(keyNim, newMhs);
                        } else {
                            System.out.println("NIM " + keyNim + " tidak ditemukan.");
                        }
                        break;
                    case 8: {
                        Mahasiswa05 mhs = inputMahasiswa();
                        System.out.print("Masukkan indeks untuk menambahkan data: ");
                        int index = sc.nextInt();
                        list.add(mhs, index);
                        break;
                    }
                    case 9:
                        System.out.print("Masukkan nama mahasiswa yang ingin dihapus setelahnya: ");
                        String hapusNama = sc.nextLine();
                        list.removeAfter(hapusNama);
                        break;
                    case 10:
                        System.out.print("Masukkan indeks yang ingin dihapus: ");
                        int hapusIndex = sc.nextInt();
                        list.remove(hapusIndex);
                        break;
                    case 11: {
                        Mahasiswa05 mhs = list.getFirst();
                        if (mhs != null) {
                            System.out.println("Data Mahasiswa pertama: ");
                            mhs.tampil();
                        } else {
                            System.out.println("List masih kosong.");
                        }
                        break;
                    }
                    case 12: {
                        Mahasiswa05 mhs = list.getLast();
                        if (mhs != null) {
                            System.out.println("Data Mahasiswa terakhir: ");
                            mhs.tampil();
                        } else {
                            System.out.println("List masih kosong.");
                        }
                        break;
                    }
                    case 13: {
                        System.out.print("Masukkan indeks yang ingin ditampilkan: ");
                        int index = sc.nextInt();
                        Mahasiswa05 mhs = list.getIndex(index);
                        if (mhs != null) {
                            System.out.println("Data Mahasiswa pada indeks " + index + ": ");
                            mhs.tampil();
                        } else {
                            System.out.println("Indeks " + index + " tidak ditemukan.");
                        }
                        break;
                    }
                    case 14:
                        int size = list.getSize();
                        System.out.println("Jumlah Mahasiswa : " + size);
                        break;
                    case 0:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                        break;
                }
            } while (pilihan != 0);
        
        sc.close();
    }
}