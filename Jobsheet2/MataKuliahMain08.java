public class MataKuliahMain08 {
    public static void main(String[] args) {
        MataKuliah08 matkul1 = new MataKuliah08();
        matkul1.kodeMK = "ALSD912";
        matkul1.nama = "Algoritma Dan Struktur Data";
        matkul1.sks = 2;
        matkul1.jumlahJam = 4;
        matkul1.tampilInformasi();

        MataKuliah08 matkul2 = new MataKuliah08("PBO123", "Pemrograman Berorientasi Objek", 3, 6);
        matkul2.tampilInformasi();
        matkul2.ubahSKS(4);
        matkul2.tambahJam(5);
        matkul2.kurangiJam(3);
        matkul2.tampilInformasi();
    }
}