package Jobsheet7;

public class Mahasiswa08 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa08() {

    }

    public Mahasiswa08(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
    }
}