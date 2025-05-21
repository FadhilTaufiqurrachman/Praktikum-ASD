package Jobsheet11;

import java.util.Scanner;
public class LayananAkademikKrs08 {
    static Scanner input = new Scanner(System.in);
    static int pilihan;

    static void tampilkanMenu() {
        System.out.println("===================================================");
        System.out.println("            Sistem Layanan Akademik KRS            ");
        System.out.println("===================================================");        
        System.out.println("1. Cek Antrian Kosong.");
        System.out.println("2. Cek Antrian Penuh.");
        System.out.println("3. Menghapus Seluruh Antrian KRS (Mengosongkan).");
        System.out.println("4. Tambah Mahasiswa Ke Antrian KRS.");
        System.out.println("5. Memproses Antrian KRS (2 Mahasiswa).");
        System.out.println("6. Tampilkan Semua Antrian KRS.");
        System.out.println("7. Tampilkan 2 Antrian Terdepan.");
        System.out.println("8. Tampilkan Antrian Paling Akhir");
        System.out.println("9. Cetak Jumlah Antrian Saat Ini");
        System.out.println("10. Cetak Jumlah Mahasiswa Yang Sudah Proses KRS.");
        System.out.println("11. Cetak Jumlah Mahasiswa Yang Belum Proses KRS.");
        System.out.println("0. Keluar.");
        System.out.println("===================================================");
        System.out.print("Pilih Menu : ");
        pilihan = input.nextInt();
        input.nextLine();
        System.out.println(); 
    }

    public static void main(String[] args) {
        int antrianMaksimal = 10;
        AntrianLayananKrs08 antrianKrs = new AntrianLayananKrs08(antrianMaksimal);

        do {
            tampilkanMenu();
            switch (pilihan) {                
                case 1:
                    if (antrianKrs.antrianKosong()) {
                        System.out.println("Antrian Masih Kosong.\n");
                    } else {
                        System.out.println("Antrian Tidak Kosong.\n");
                    }
                    break;
                case 2:
                    if (antrianKrs.antrianPenuh()) {
                        System.out.println("Antrian Sudah Penuh.\n");
                    } else {
                        System.out.println("Antrian Tidak Penuh.\n");
                    }
                    break;
                case 3:
                    antrianKrs.menghapusAntrian();
                    break;
                case 4:
                    System.out.println("========== Tambah Mahasiswa Ke Antrian KRS ==========");
                    System.out.print("NIM      : ");
                    String nim = input.nextLine();
                    System.out.print("Nama     : ");
                    String nama = input.nextLine();
                    System.out.print("Prodi    : ");
                    String prodi = input.nextLine();
                    System.out.print("Kelas    : ");
                    String kelas = input.nextLine();
                    System.out.print("Semester : ");
                    int semester = input.nextInt(); 
                    input.nextLine();
                    MahasiswaKrs08 inputMahasiswa = new MahasiswaKrs08(nim, nama, prodi, kelas, semester);
                    antrianKrs.menambahAntrian(inputMahasiswa);
                    break;
                case 5:
                    antrianKrs.memprosesAntrian();
                    break;
                case 6:
                    antrianKrs.tampilkanSemuaAntrian();
                    break;
                case 7:
                    antrianKrs.tampilkanDuaTerdepan();
                    break;
                case 8:
                    antrianKrs.tampilkanPalingAkhir();
                    break;
                case 9:
                    antrianKrs.cetakJumlahAntrian();
                    break;
                case 10:
                    antrianKrs.cetakJumlahSudahDilayani();
                    break;
                case 11:
                    antrianKrs.cetakJumlahBelumDilayani();
                    break;
                case 0:
                System.out.println("Terima Kasih Telah Menggunakan Layanan Akademik KRS.\n");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid.");
                    break;
            }
    } while (pilihan != 0);
        input.close();
    }
}