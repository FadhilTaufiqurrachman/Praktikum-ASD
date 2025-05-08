package UjianTengahSemester;

public class Mahasiswa {
    String NIM;
    String nama;
    String prodi;
    
    Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa() {
        System.out.printf("NIM: %s | Nama: %-12s | Prodi: %s\n", NIM, nama, prodi);
    }
}