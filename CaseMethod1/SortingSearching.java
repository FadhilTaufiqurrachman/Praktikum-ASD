package CaseMethod1;

public class SortingSearching {
    static void selectionSort(Penilaian[] penilaian) {
        Penilaian[] newPenilaian = new Penilaian[penilaian.length];
        for (int i = 0; i < penilaian.length; i++) {
            newPenilaian[i] = penilaian[i];
        }
        for (int i = 0; i < newPenilaian.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < newPenilaian.length; j++) {
                if (newPenilaian[j].nilaiAkhir > newPenilaian[max].nilaiAkhir) {
                    max = j;
                }
            }
            Penilaian temp = newPenilaian[i];
            newPenilaian[i] = newPenilaian[max];
            newPenilaian[max] = temp;
        }
        for (int i = 0; i < newPenilaian.length; i++) {
            newPenilaian[i].tampilPenilaian();
        }
        System.out.println();
    }

    static void sequentialSearch(Mahasiswa[] mhs, String nim) {
        boolean ditemukan = false;
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].NIM.equals(nim)) {
                mhs[i].tampilMahasiswa();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Data Mahasiswa Tidak Ditemukan");
        }
        System.out.println();
    }
}