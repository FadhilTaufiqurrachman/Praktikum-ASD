package UjianAkhirSemester;

public class Pasien {
    public String nama, nik, keluhan;
    public int umur;

    public Pasien(String nama, String nik, int umur, String keluhan) {
        this.nama = nama;
        this.nik = nik;
        this.umur = umur;
        this.keluhan = keluhan;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama            : " + nama);
        System.out.println("NIK             : " + nik);
        System.out.println("Umur            : " + umur);
        System.out.println("Keluhan         : " + keluhan);
        System.out.println("----------------------------------------------");
    }

    public void setData(String nama, String nik, int umur, String keluhan) {
        this.nama = nama;
        this.nik = nik;
        this.umur = umur;
        this.keluhan = keluhan;
    }
}