package Jobsheet6;

import java.util.Scanner;
public class DosenMain08 {
    Scanner input = new Scanner(System.in);
    static int menu;
    static DataDosen08 data = new DataDosen08();

    void menampilkanMenu() {
        System.out.println("================================");
        System.out.println("========= Pilihan Menu =========");
        System.out.println("1. Tambah Data Dosen.\n" + 
                            "2. Tampil Data Dosen.          \n" + 
                            "3. Sorting ASC Usia Dosen.     \n" +
                            "4. Sorting DSC Usia Dosen.     \n" +
                            "5. Keluar.                       ");
        System.out.println("================================");
        System.out.print("Masukkan Nomor Menu : ");
        menu = input.nextInt();
        input.nextLine();
        System.out.println();
    }

    void menambahData() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan Data Dosen Ke-" + (i + 1));
            System.out.print("Masukkan Kode Dosen           : ");
            String kode = input.nextLine();
            System.out.print("Masukkan Nama Dosen           : ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin L (true/false)? : ");
            boolean jenisKelamin = input.nextBoolean();
            System.out.print("Masukkan Usia Dosen           : ");
            int usia = input.nextInt();
            input.nextLine();
            System.out.println("------------------------------------------");
            Dosen08 dsn = new Dosen08(kode, nama, jenisKelamin, usia);
            data.tambah(dsn);
        }
    }
    void menampilkanDataDosen() {
        data.tampil();
    }

    void mengurutkanASC() {
        data.sortingASC();
        data.tampil();
    }

    void mengurutkanDSC() {
        data.sortingDSC();
        data.tampil();
    }

    public static void main(String[] args) {
        do {
            DosenMain08 app = new DosenMain08();
            app.menampilkanMenu();
            switch (app.menu) {
                case 1:
                    app.menambahData();
                    break;
                case 2:
                    app.menampilkanDataDosen();
                    break;
                case 3:
                    app.mengurutkanASC();
                    break;
                case 4:
                    app.mengurutkanDSC();
                    break;
                case 5:
                    System.out.println("Terima Kasih!");
                    break;
                default:
                    System.out.println("Nomor Menu Tidak Ada!");
                    break;
            }
        } while (menu != 5);
    }
}
