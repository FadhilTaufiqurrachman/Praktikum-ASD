package Jobsheet6;

public class DataDosen08 {
    Dosen08 dataDosen[] = new Dosen08[10];
    int idx;

    void tambah(Dosen08 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!");
        }
    }

    void tampil() {
        if (dataDosen[0] == null) {
            System.out.println("Data Kosong!");
        } else {
            System.out.println("Data Dosen : ");
            for (Dosen08 dsn : dataDosen) {
                dsn.tampilkanData();
            }
        }
    }

    void sortingASC() {
        for (int i = 0; i < dataDosen.length - 1; i++) {
            for (int j = 1; j < dataDosen.length - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen08 dummy = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = dummy;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < dataDosen.length; i++) {
            Dosen08 temp = dataDosen[i]; 
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
