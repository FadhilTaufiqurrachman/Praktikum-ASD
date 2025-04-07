package Jobsheet7;

public class MahasiswaBerprestasi08 {
    Mahasiswa08 listMhs[] = new Mahasiswa08[5];
    int idx;

    void tambah(Mahasiswa08 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!");
        }
    }

    void tampil() {
        for (Mahasiswa08 m : listMhs) {
            m.tampilInformasi();
            System.out.println("----------------------");
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data Mahasiswa Dengan IPK : " + x + " Ditemukan Pada Indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t : " + listMhs[pos].nim); 
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t : " + x);
        } else {
            System.out.println("Data Mahasiswa Dengan IPK " + x + " Tidak Ditemukan");
        }
    }
}