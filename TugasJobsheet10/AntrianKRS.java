package TugasJobsheet10;
public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahProses;
    
    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jumlahProses = 0;
    }
    
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    
    public void clear() {
        if (!IsEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    
    public void Enqueue(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }
    
    public void Dequeue() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        for (int i = 0; i < 2; i++) {
            if (size > 0) {
                Mahasiswa mhs = data[front];
                mhs.setProses(true);
                jumlahProses++;
                
                System.out.println("Memproses KRS mahasiswa: ");
                mhs.tampilkanData();
                
                front = (front + 1) % max;
                size--;
            } else {
                System.out.println("Tidak ada lagi mahasiswa dalam antrian");
                break;
            }
        }
    }
    
    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam antrian:");
        System.out.println("NO | NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    
    public void peek() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        
        System.out.println("Dua Mahasiswa terdepan dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        
        for (int i = 0; i < 2 && i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    
    public void peekRear() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        
        System.out.println("Mahasiswa paling belakang dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[rear].tampilkanData();
    }
    
    public int getSize() {
        return size;
    }
    
    public int getJumlahProses() {
        return jumlahProses;
    }
    
    public int getJumlahBelumProses() {
        return size;
    }
}