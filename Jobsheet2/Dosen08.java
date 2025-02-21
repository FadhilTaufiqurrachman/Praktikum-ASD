public class Dosen08 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung, lamaKerja, tahun;

    public Dosen08() {

    }

    public Dosen08(String idDosen, String nama, String bidangKeahlian, boolean statusAktif, int tahunBergabung, int tahun) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangKeahlian = bidangKeahlian;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.tahun = tahun;
    }

    void tampilkanInformasi() {
        System.out.println("======================================================");
        System.out.println("======================= Dosen ========================");
        System.out.println("ID Dosen          : " + idDosen);
        System.out.println("Nama Dosen        : " + nama);
        System.out.println("Bidang Keahlian   : " + bidangKeahlian);
        System.out.println("Status Aktif      : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung   : " + tahunBergabung);
        System.out.println("Lama Kerja        : " + hitungMasaKerja(tahun) + " Tahun");
        System.out.println("======================================================\n");
    }

    void setStatusAktif(boolean status) {
        if (status) {
            System.out.println("Status Aktif Dosen " + nama + " Berhasil Diubah Menjadi Aktif");
            System.out.println();
            statusAktif = true;
        } else {
            System.out.println("Status Aktif Dosen " + nama + " Berhasil Diubah Menjadi Tidak Aktif");
            System.out.println();
            statusAktif = false;
        }
    }

    int hitungMasaKerja(int thnSkrg) {
        lamaKerja = thnSkrg - tahunBergabung;
        return lamaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang Keahlian Dosen " + nama + " Berhasil Diubah Menjadi " + bidangKeahlian);
        System.out.println();
    }
}