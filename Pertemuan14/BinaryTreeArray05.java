package Pertemuan14;

public class BinaryTreeArray05 {
    Mahasiswa05[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray05() {
        this.dataMahasiswa = new Mahasiswa05[10];
    }

    void populateData (Mahasiswa05 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder (int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1); // Left child
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2); // Right child
            }
        }
    }
}