package Jobsheet11;
import java.util.Scanner;
public class SLLMain05 {
    public static void main(String[] args) {
        SingleLinkedList05 sll = new SingleLinkedList05();
        Scanner sc = new Scanner(System.in);

        /*int jml = 100;
        for (int i = 0; i < jml ; i++) {
            System.out.println("Masukkan data mahasiswa ke- " + (i + 1) + " : ");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas, ipk);
            sll.addFirst(mhs);
            System.out.println();
            System.out.print("Apakah mau lanjut? (y/n) : ");
            String jawab = sc.nextLine();
            if (jawab.equalsIgnoreCase("n")) {
                System.out.println("Terima kasih.");
                break;
                }
        }*/
        
        Mahasiswa05 mhs3 = new Mahasiswa05("22212202", "Cintia", "3C", 3.5);
        Mahasiswa05 mhs2 = new Mahasiswa05("23212201", "Bimon", "2B", 3.8);
        Mahasiswa05 mhs1 = new Mahasiswa05("21212203", "Dirga", "4D", 3.6);
        Mahasiswa05 mhs4 = new Mahasiswa05("24212200", "Alvaro", "1A", 4.0);
        
        sll.addFirst(mhs1);
        sll.addFirst(mhs2);
        sll.addFirst(mhs3);
        sll.addFirst(mhs4);

        System.out.println("data index 1 :");
        sll.getData(1);
        System.out.println();

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);  
        sll.print();        
    }
}