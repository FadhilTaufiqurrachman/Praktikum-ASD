package Jobsheet11;

public class MahasiswaKrs08 {
    String nim, nama, kelas, prodi;
    int semester;

    public MahasiswaKrs08(String nim, String nama, String prodi, String kelas, int semester) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
        this.semester = semester;
    }

    public void tampilkanData() {
        System.out.printf("%-10s %-20s %-30s %-10s %-10s\n", nim, nama, prodi, kelas, semester);
    }
}