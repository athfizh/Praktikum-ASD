package Pertemuan14;

public class BinaryTreeArray05 {
    Mahasiswa05[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray05() {
        this.dataMahasiswa = new Mahasiswa05[10];
        this.idxLast = -1;
    }

    void populateData (Mahasiswa05 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void add(Mahasiswa05 mahasiswa) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = mahasiswa;
            System.out.println("Data mahasiswa berhasil ditambahkan:");
            mahasiswa.tampilInformasi();
        } else {
            System.out.println("Array penuh, tidak dapat menambah data");
        }
    }

    void traverseInOrder (int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}