package UjianAkhirSemester;

public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan, biaya;
    
    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
    }

    public int hitungBiaya() {
        int tarifPerJam = 50000;
        biaya = durasiLayanan * tarifPerJam;
        return biaya;
    }

    public void tampilkanInformasiTransaksi() {
        System.out.println("Pasien          : " + pasien.nama);
        System.out.println("Dokter          : " + dokter.nama + " (" + dokter.idDokter + ")");
        System.out.println("Durasi Layanan  : " + durasiLayanan + " Jam");
        System.out.println("Biaya Layanan   : Rp." + hitungBiaya());
        System.out.println("---------------------------------------------");
    }

    public void hitungBiayaBaru(int durasiLayananBaru) {
        durasiLayanan = durasiLayananBaru;
        biaya = durasiLayananBaru * 50000; 
    }
}