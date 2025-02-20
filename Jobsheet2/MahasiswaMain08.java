public class MahasiswaMain08 {
    public static void main(String[] args) {
        Mahasiswa08 mhs = new Mahasiswa08();
        mhs.nama = "Muhammad Ali Farhan";
        mhs.nim = "2241720171";
        mhs.kelas = "SI 2J";
        mhs.ipk = 3.55;

        mhs.tampilkanInformasi();
        mhs.ubahKelas("SI 2K");
        mhs.updateIpk(3.60);
        mhs.tampilkanInformasi();
    }
}