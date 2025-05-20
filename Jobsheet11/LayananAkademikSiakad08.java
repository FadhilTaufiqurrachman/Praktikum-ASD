package Jobsheet11;

import java.util.Scanner;
public class LayananAkademikSiakad08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AntrianLayanan08 antrian = new AntrianLayanan08(5);
        int pilihan;

        do {
            System.out.println("\n====== Menu Antrian Layanan Akademik ======");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Cek Antrian Paling Belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt(); 
            input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM     : ");
                    String nim = input.nextLine();
                    System.out.print("Nama    : ");
                    String nama = input.nextLine();
                    System.out.print("Prodi   : ");
                    String prodi = input.nextLine();
                    System.out.print("Kelas   : ");
                    String kelas = input.nextLine();
                    Mahasiswa08 mhs = new Mahasiswa08(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa08 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani Mahasiswa : ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah Dalam Antrian : " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid.");
                    break;
            }
        } while (pilihan != 0);
        input.close();
    }
}