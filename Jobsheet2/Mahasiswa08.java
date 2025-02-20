public class Mahasiswa08 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa08() {

    }

    public Mahasiswa08(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkanInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
        System.out.println("Kelas : " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipk > 4.0 || ipk < 0) {
            System.out.println("IPK Tidak Valid. Harus Antara 0.0 - 4.0");
            ipk = 0;
        } else {
            ipk = ipkBaru;
        }
    }

    String menilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
}
