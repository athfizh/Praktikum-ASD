package Jobsheet12;
public class DoubleLinkedLists05 {
    Node05 head;
    Node05 tail;

    public DoubleLinkedLists05() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa05 data) {
        Node05 newNode = new Node05(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa05 data) {
        Node05 newNode = new Node05(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa05 data) {
        Node05 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node05 newNode = new Node05(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong!");
            return;
        }
        Node05 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
        }
        if (head == tail) {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah " + head.data.nama);
            head = tail = null;
        } else {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah " + head.data.nama);
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah " + tail.data.nama);
            head = tail = null;
        } else {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah " + tail.data.nama);
            tail = tail.prev;
            tail.next = null;
        }
    }

    public Node05 search(String cariNim) {
        Node05 current = head;
        while (current != null) {
            if (current.data.nim.equals(cariNim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void add(Mahasiswa05 data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node05 temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                System.out.println("Index melebihi ukuran list.");
                return;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            addLast(data);
        } else {
            Node05 newNode = new Node05(data);
            temp.next.prev = newNode;
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
        }        
    }

    public void removeAfter(String key) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }

        Node05 temp = head;

        while (temp != null && !temp.data.nama.equalsIgnoreCase(key)) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Tidak ada node setelah " + key + " atau node tersebut adalah yang terakhir.");
            return;
        }

        temp.next.prev = temp;
        temp.next = temp.next.next;
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        
        if (index < 0) {
            System.out.println("Index tidak boleh negatif.");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node05 temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                System.out.println("Index melebihi ukuran list.");
                return;
            }
            temp = temp.next;
        }

        if (temp.next == tail) {
            removeLast();
        }
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
    }

    Mahasiswa05 getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang bisa diambil.");
            return null;
        }
        return head.data;
    }

    Mahasiswa05 getLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang bisa diambil.");
            return null;
        }
        return tail.data;
    }

    Mahasiswa05 getIndex(int index) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang bisa diambil.");
            return null;
        }
        
        if (index < 0) {
            System.out.println("Index tidak boleh negatif.");
            return null;
        }

        Node05 temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                System.out.println("Index melebihi ukuran list.");
                return null;
            }
            temp = temp.next;
        }
        return temp.data;
    }

    int getSize() {
        int counter = 0;

        Node05 temp = head;
        while (temp != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }
}