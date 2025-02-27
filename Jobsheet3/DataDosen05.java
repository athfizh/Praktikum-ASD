package Jobsheet3;
public class DataDosen05 {
    void dataSemuaDosen(Dosen05[] arrayOfDosen,int n){
        System.out.println("======================================");
        System.out.println("========== DATA SEMUA DOSEN ==========");
        System.out.println("======================================");
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
            System.out.println("-------------------------------");
        }
        System.out.println();
    }

    void jumlahDosenPerJenisKelamin(Dosen05[] arrayOfDosen, int n){
        System.out.println("======================================");
        System.out.println("====== DOSEN BERDASARKAN GENDER ======");
        System.out.println("======================================");
        System.out.println("Dosen Wanita : ");
        for (int i = 0; i < n; i++){
            if (arrayOfDosen[i].jenisKelamin == true) {
                System.out.println(arrayOfDosen[i].nama);
            }
        }
        System.out.println("Dosen Pria : ");
        for (int i = 0; i < n; i++){
            if (arrayOfDosen[i].jenisKelamin == false) {
                System.out.println(arrayOfDosen[i].nama);
            }
        }
        System.out.println();
    }
    
    void rerataUsiaDosenPerJenisKelamin(Dosen05[] arrayOfDosen, int n){
        System.out.println("======================================");
        System.out.println("==== RATA RATA USIA SESUAI GENDER ====");
        System.out.println("======================================");
        int jmlWanita = 0;
        int jmlPria= 0;
        int htgWanita = 0;
        int htgPria = 0;
        
        for (int i = 0; i < n; i++){
            if (arrayOfDosen[i].jenisKelamin == true) {
                jmlWanita += arrayOfDosen[i].usia;
                htgWanita += 1;
            }
        }
        double rataWanita = jmlWanita / htgWanita;
        System.out.println("Rata Rata Usia Dosen Wanita : " + rataWanita);
        
        for (int i = 0; i < n; i++){
            if (arrayOfDosen[i].jenisKelamin == false) {
                jmlPria += arrayOfDosen[i].usia;
                htgPria += 1;
            }
        }
        double rataPria = jmlPria / htgPria;
        System.out.println("Rata Rata Usia Dosen Pria : " + rataPria);
        System.out.println();
    }

    void infoDosenPalingTua(Dosen05[] arrayOfDosen, int n) {
        System.out.println("======================================");
        System.out.println("========= DOSEN PALING TUA ===========");
        System.out.println("======================================");
        int tertua = arrayOfDosen[0].usia;
        int b = 0;
       
        for (int i = 1; i < n; i++) {
            if (tertua < arrayOfDosen[i].usia) {
                tertua = arrayOfDosen[i].usia;
                b = i;
            }
        }
        System.out.println("Dosen Paling Tua : " + arrayOfDosen[b].nama);
        System.out.println();
    }

    void infoDosenPalingMuda(Dosen05[] arrayOfDosen, int n ) {
        System.out.println("======================================");
        System.out.println("========== DOSEN PALING MUDA =========");
        System.out.println("======================================");
        int termuda = arrayOfDosen[0].usia;

        int b = 0;
        for (int i = 1; i < n; i++) {
            if (termuda > arrayOfDosen[i].usia) {
                termuda = arrayOfDosen[i].usia;
                b = i;
            }
        }
        System.out.println("Dosen Paling Muda : " + arrayOfDosen[b].nama);
        System.out.println();
    }
}