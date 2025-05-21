package Jobsheet11;

public class AntrianLayananKrs08 {
    MahasiswaKrs08[] queueKrs;
    int front, rear, max, totalMahasiswa, size, sudahDilayani, belumDilayani;

    public AntrianLayananKrs08(int max) {
        this.max = max;
        queueKrs = new MahasiswaKrs08[max];
        front = rear = -1;
        size = sudahDilayani = 0;
        totalMahasiswa = belumDilayani = 30;
    }

    public boolean antrianKosong() {
        return size == 0;
    }

    public boolean antrianPenuh() {
        return size == max;
    }

    public void menghapusAntrian() {
        if (antrianKosong()) {
            System.out.println("Antrian Sudah Kosong.\n");
        } else {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian Berhasil Dikosongkan.\n");
        }
    }

    public void menambahAntrian(MahasiswaKrs08 mhs) {
        if (sudahDilayani >= totalMahasiswa) {
            System.out.println("Jumlah Mahasiswa Yang Dapat Ditangani Mencapai Batas Maksimal (30 Mahasiswa).\n");
            return;
        }
        if (antrianPenuh()) {
            System.out.println("Antrian Sudah Penuh.\n");
        } else {
            if (antrianKosong()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            queueKrs[rear] = mhs;
            size++;
            System.out.println("Mahasiswa " + mhs.nama + " Berhasil Ditambahkan Ke Antrian.\n");
        }
    }

    public MahasiswaKrs08[] memprosesAntrian() {
        int maxProses = 2;
        if (antrianKosong()) {
            System.out.println("Antrian Kosong, Tidak Ada Mahasiswa Yang Dapat Diproses.\n");
            return null;
        } else if (size < maxProses) {
            System.out.println("Antrian Kurang Dari 2 Mahasiswa, Tidak Dapat Memproses KRS.\n");
            return null;
        } else if (sudahDilayani >= totalMahasiswa) {
            System.out.println("Jumlah Mahasiswa Yang Dapat Ditangani Mencapai Batas Maksimal (30 Mahasiswa).\n");
            return null;
        }
        MahasiswaKrs08[] mahasiswaDiproses = new MahasiswaKrs08[maxProses];
        System.out.println("========== Memproses 2 Mahasiswa Untuk KRS ==========");
        System.out.printf("%-10s %-20s %-30s %-10s %-10s\n", "NIM", "Nama", "Prodi", "Kelas", "Semester");
        for (int i = 0; i < maxProses; i++) {
            mahasiswaDiproses[i] = queueKrs[front]; 
            front = (front + 1) % max;             
            size--;                                
            sudahDilayani++;
            mahasiswaDiproses[i].tampilkanData();                       
        }        
        belumDilayani = totalMahasiswa - sudahDilayani; 
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        System.out.println("Proses KRS Berhasil Dilakukan.\n");
        return mahasiswaDiproses;
    }

    public void tampilkanSemuaAntrian() {
        if (antrianKosong()) {
            System.out.println("Antrian Masih kosong.");
            return;
        }
        System.out.println("========== Daftar Mahasiswa Dalam Antrian ==========");
        System.out.printf("%-10s %-20s %-30s %-10s %-10s\n", "NIM", "Nama", "Prodi", "Kelas", "Semester");
        int temp = front;
        for (int i = 0; i < size; i++) {
            queueKrs[temp].tampilkanData();
            temp = (temp + 1) % max; 
        }
        System.out.println();
    }

    public void tampilkanDuaTerdepan() {
        if (antrianKosong()) {
            System.out.println("Antrian Masih Kosong.");
            return;
        }
        System.out.println("========== Daftar Mahasiswa 2 Terdepan ==========");
        System.out.printf("%-10s %-20s %-30s %-10s %-10s\n", "NIM", "Nama", "Prodi", "Kelas", "Semester");
        int temp = front;
        for (int i = 0; i < 2; i++) {
            queueKrs[temp].tampilkanData();
            temp = (temp + 1) % max;
        }
        System.out.println();
    }

    public void tampilkanPalingAkhir() {
        if (antrianKosong()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("========== Mahasiswa Paling Akhir ==========");
        System.out.printf("%-10s %-20s %-30s %-10s %-10s\n", "NIM", "Nama", "Prodi", "Kelas", "Semester");
        queueKrs[rear].tampilkanData();
        System.out.println();
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah Mahasiswa Dalam Antrian Saat Ini : " + size);
        System.out.println();
    }

    public void cetakJumlahSudahDilayani() {
        System.out.println("Jumlah Mahasiswa Yang sudah Melakukan Proses KRS : " + sudahDilayani);
        System.out.println();
    }

    public void cetakJumlahBelumDilayani() {
        System.out.println("Jumlah Mahasiswa Yang Belum Melakukan Proses KRS : " + belumDilayani);
        System.out.println();
    }
}