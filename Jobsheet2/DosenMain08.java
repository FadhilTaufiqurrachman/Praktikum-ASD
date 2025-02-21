public class DosenMain08 {
    public static void main(String[] args) {
        Dosen08 dosen1 = new Dosen08();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Xephyrus Arnando S.Kom., M.Kom.";
        dosen1.bidangKeahlian = "Pemrograman Berorientasi Objek";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.tahun = 2025;
        dosen1.tampilkanInformasi();

        Dosen08 dosen2 = new Dosen08("D002", "Dr. Yudha Pratama S.Kom., M.Kom.", "Algoritma Dan Struktur Data", false, 2015, 2025);
        dosen2.tampilkanInformasi();
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Pemrograman Web");
        dosen2.tampilkanInformasi();
    }
}