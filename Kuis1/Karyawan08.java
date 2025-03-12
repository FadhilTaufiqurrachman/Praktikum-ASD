package Kuis1;

public class Karyawan08 {
    public String idPegawai08, nama08;
    public int hariKerja08;
    public double gajiPokok08;

    public Karyawan08() {

    }

    public Karyawan08(String idPegawai08, String nama08, double gajiPokok08, int hariKerja08) {
        this.idPegawai08 = idPegawai08;
        this.nama08 = nama08;
        this.gajiPokok08 = gajiPokok08;
        this.hariKerja08 = hariKerja08;
    }

    void tampilkanInformasi() {
        System.out.println("ID          : " + idPegawai08);
        System.out.println("Nama        : " + nama08);
        System.out.println("Gaji Pokok  : " + gajiPokok08);
        System.out.println("Hari Kerja  : " + hariKerja08);
        System.out.println("Total Gaji  : " + hitungGajiBulanan(gajiPokok08));
        System.out.println("=============================");
    }

    double hitungGajiBulanan(double gaji08) {
        double totalGaji08 = 0;
        totalGaji08 = gaji08 * hariKerja08 / 25;
        return totalGaji08;
    }
}
