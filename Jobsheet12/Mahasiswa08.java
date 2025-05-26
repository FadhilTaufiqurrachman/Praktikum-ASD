package Jobsheet12;

public class Mahasiswa08 {
    public String nim, nama, kelas;
    public double ipk;

    public Mahasiswa08() {

    }

    public Mahasiswa08(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi () {
        System.out.printf("%-15s %-25s %-10s %.1f\n", nama, nim, kelas, ipk);
    }
}