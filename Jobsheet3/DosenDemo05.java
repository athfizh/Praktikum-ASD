package Jobsheet3;
import java.util.Scanner;
public class DosenDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Dosen Yang Ingin Diinput : ");
        int n = sc.nextInt();
        sc.nextLine();
        Dosen05[] arrayOfDosen = new Dosen05[n];
        String dummy = "";
        for (int i = 0; i < n; i ++){
            arrayOfDosen[i] = new Dosen05();
            System.out.println("Masukkan Data Dosen Ke-" + (i+1));
            System.out.print("Kode            : ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama            : ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin   : ");
            dummy= sc.nextLine();
            if (dummy.equalsIgnoreCase("wanita")) {
                arrayOfDosen[i].jenisKelamin = true;
            } else {
                arrayOfDosen[i].jenisKelamin = false;
            }
            System.out.print("Usia            : ");
            dummy= sc.nextLine();
            arrayOfDosen[i].usia = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");
        }
        System.out.println();
        for (int i = 0; i < n; i++){
            System.out.println("Data Dosen Ke-" + (i+1));
            System.out.println("Kode             : " + arrayOfDosen[i].kode);
            System.out.println("Nama             : " + arrayOfDosen[i].nama);
            if (arrayOfDosen[i].jenisKelamin == true) {
                System.out.println("Jenis Kelamin    : Wanita");
            } else {
                System.out.println("Jenis Kelamin    : Pria");
            }
            System.out.println("Usia             : " + arrayOfDosen[i].usia);
            System.out.println("-----------------------------------");
        }

        DataDosen05 dsn = new DataDosen05();
        dsn.dataSemuaDosen(arrayOfDosen, n);
        dsn.jumlahDosenPerJenisKelamin(arrayOfDosen, n);
        dsn.rerataUsiaDosenPerJenisKelamin(arrayOfDosen, n);
        dsn.infoDosenPalingMuda(arrayOfDosen, n);
        dsn.infoDosenPalingTua(arrayOfDosen, n);
    }
}