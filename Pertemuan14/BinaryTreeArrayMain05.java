package Pertemuan14;

public class BinaryTreeArrayMain05 {
    public static void main(String[] args) {
        BinaryTreeArray05 bta = new BinaryTreeArray05();

        Mahasiswa05 mhs1 = new Mahasiswa05("244160121", "Ali", "A", 3.57);
        Mahasiswa05 mhs2 = new Mahasiswa05("244160185", "Candra", "C", 3.41);
        Mahasiswa05 mhs3 = new Mahasiswa05("244160221", "Badar", "B", 3.75);
        Mahasiswa05 mhs4 = new Mahasiswa05("244160220", "Dewi", "B", 3.35);
        Mahasiswa05 mhs5 = new Mahasiswa05("244160131", "Devi", "A", 3.48);
        Mahasiswa05 mhs6 = new Mahasiswa05("244160205", "Ehsan", "D", 3.61);
        Mahasiswa05 mhs7 = new Mahasiswa05("244160170", "Fizi", "B", 3.86);

        bta.add(mhs1);
        bta.add(mhs2);
        bta.add(mhs3);
        bta.add(mhs4);
        bta.add(mhs5);
        bta.add(mhs6);
        bta.add(mhs7);

        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        System.out.println("\nPreorder Traversal Mahasiswa: ");
        bta.traversePreOrder(0);
    }
}