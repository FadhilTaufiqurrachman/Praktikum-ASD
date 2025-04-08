package Jobsheet7;

public class Dosen08 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen08(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampilkanData() {
        System.out.println("Kode Dosen      : " + kode);
        System.out.println("Nama Dosen      : " + nama);
        System.out.println("Jenis Kelamin   : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia            : " + usia);
        System.out.println("------------------------------------------");
    }
}