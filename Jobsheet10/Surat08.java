package Jobsheet10;

public class Surat08 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;

    Surat08() {

    }

    Surat08(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilkanSurat() {
        System.out.println("ID Surat        : " + idSurat);
        System.out.println("Nama Mahasiswa  : " + namaMahasiswa);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Jenis Izin      : " + (jenisIzin == 'S' ? "Sakit" : "Izin Keperluan Lain"));
        System.out.println("Durasi          : " + durasi + " Hari");
        System.out.println();
    }
}