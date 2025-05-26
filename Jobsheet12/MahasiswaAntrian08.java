package Jobsheet12;

public class MahasiswaAntrian08 {
    String nim, nama, jurusan, prodi, keperluan;

    public MahasiswaAntrian08(String nim, String nama, String jurusan, String prodi, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.prodi = prodi;
        this.keperluan = keperluan;
    }

    public void tampilInformasi() {
        System.out.printf("%-20s %-20s %-30s %-30s %-20s\n", nim, nama, jurusan, prodi, keperluan);
    }
}