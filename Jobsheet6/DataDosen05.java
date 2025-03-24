package Jobsheet6;

public class DataDosen05 {
    Dosen05[] dataDosen05 = new Dosen05[10];
    int idx;

    void tambah (Dosen05 dsn) {
        if (idx < dataDosen05.length) {
            dataDosen05 [idx] = dsn;
            idx++;
        } else {
            System.out.println ("Data sudah penuh");
        }
    }

    void tampil () {
        for (Dosen05 dsn:dataDosen05) {
            dsn.tampilData();
            System.out.println("-----------------------");
        }
    }

    void sortingASC () {
        for (int i = 0; i < dataDosen05.length-1; i++) {
            for (int j = 1; j < dataDosen05.length-i; j++) {
                if (dataDosen05 [j].usia < dataDosen05 [j-1].usia) {
                    Dosen05 temp = dataDosen05 [j];
                    dataDosen05 [j] = dataDosen05 [j-1];
                    dataDosen05 [j-1] = temp;
                }
            }
        }
    }

    void sortingDSC () {
        for (int i = 0; i < dataDosen05.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < dataDosen05.length; j++) {
                if (dataDosen05 [j].usia > dataDosen05 [idxMin].usia) {
                    idxMin = j;
                }
            }
            Dosen05 temp = dataDosen05 [idxMin];
            dataDosen05 [idxMin] = dataDosen05 [i];
            dataDosen05 [i] = temp;
        }
    }

    void insertionSort () {
        for (int i = 1; i < dataDosen05.length; i++) {
            Dosen05 temp = dataDosen05 [i];
            int j = i;
            while (j > 0 && dataDosen05 [j-1].usia < temp.usia) {
                dataDosen05 [j] = dataDosen05 [j-1];
                j--;
            }
            dataDosen05 [j] = temp;
        }
    }
}