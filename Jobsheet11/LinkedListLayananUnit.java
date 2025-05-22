package Jobsheet11;

public class LinkedListLayananUnit {
    NodeMhs head;
    NodeMhs tail;
    int maxSize = 100;
    int size = 0;

    public boolean isEmpty() {
        return (head == null);
    }

    public boolean cekAntrianPenuh() {
        return size >= maxSize;
    }

    public void kosongkan() {
        head = tail = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void daftarkanData(Mahasiswa input) {
        if (cekAntrianPenuh()) {
            System.out.println("Antrian penuh! Tidak dapat menambahkan mahasiswa baru.");
            return;
        }
        
        NodeMhs ndInput = new NodeMhs(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
        System.out.println(input.nama + " berhasil masuk ke antrian.");
    }

    public void memanggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada yang bisa dipanggil.");
        } else {
            System.out.println(head.data.nama + " dipanggil untuk dilayani.");
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            size--;
        }
    }

    public void tampilAntrianDepanTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada data yang dapat ditampilkan.");
        } else {
            System.out.println("=== ANTRIAN TERDEPAN ===");
            head.data.tampilInformasi();
            
            if (head != tail) {
                System.out.println("=== ANTRIAN TERAKHIR ===");
                tail.data.tampilInformasi();
            } else {
                System.out.println("Hanya ada satu mahasiswa dalam antrian.");
            }
        }
    }

    public void tampilMahasiswaYangMengantre() {
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + size);
        
        if (!isEmpty()) {
            System.out.println("\nDaftar mahasiswa yang mengantre:");
            NodeMhs temp = head;
            int nomor = 1;
            while (temp != null) {
                System.out.println(nomor + ". " + temp.data.nama + " (" + temp.data.nim + ")");
                temp = temp.next;
                nomor++;
            }
        }
    }
}