package Jobsheet7;

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
    
    void PencarianDataSequential08(String cariNama) {
        int dosen = 0;
        for (int i = 0; i < dataDosen.length; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(cariNama)) {
                dosen++;
                if (dosen > 1) {
                    System.out.println("Data Dosen Yang Dicari Ditemukan Lebih Dari Satu!");
                    break;
                }
                System.out.println("Data Dosen Ditemukan!");
                dataDosen[i].tampilkanData();
            }
        }
        if (dosen == 0) {
            System.out.println("Data Dosen Tidak Ditemukan!");
        }
        System.out.println();
    }

    void pencarianDataBinary08(int cariUsia) {
        int left = 0, right = idx - 1;
        boolean dataAda = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (dataDosen[mid].usia == cariUsia) {
                System.out.println("Data Dosen Ditemukan!");
                dataAda = true;
                dataDosen[mid].tampilkanData();
                for (int i = mid + 1; i <= right; i++) {
                    if (dataDosen[i].usia == cariUsia) {
                        System.out.println("Data Dosen Yang Dicari Ditemukan Lebih Dari Satu!");
                        break;
                    }
                }
                for (int i = mid - 1; i >= left; i--) {
                    if (dataDosen[i].usia == cariUsia) {
                        System.out.println("Data Dosen Yang Dicari Ditemukan Lebih Dari Satu!");
                        break;
                    }
                }
                break;
            } else if (dataDosen[mid].usia < cariUsia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!dataAda) {
            System.out.println("Data Dosen Tidak Ditemukan!");
        }
        System.out.println();
    }
}