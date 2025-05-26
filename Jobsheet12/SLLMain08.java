package Jobsheet12;

import java.util.Scanner;
public class SLLMain08 {
    // Modifikasi Percobaan 1
    static Scanner input = new Scanner(System.in);
    static SingleLinkedList08 sll = new SingleLinkedList08();
    static int pilihan;
    static String nim, nama, kelas;
    static double ipk; 

    public static Mahasiswa08 tambahkanData() {
        while (true) {
            System.out.print("NIM      : ");
            nim = input.nextLine();
            System.out.print("Nama     : ");
            nama = input.nextLine();
            System.out.print("Kelas    : ");
            kelas = input.nextLine();
            System.out.print("IPK      : ");
            ipk = input.nextDouble();
            input.nextLine();
            if (ipk >= 0 && ipk <= 4) {
                break;
            } else {
                System.out.println("IPK Tidak Valid, Silahkan Coba Lagi."); 
            }        
        }
        return new Mahasiswa08(nim, nama, kelas, ipk);
    }

    static void tampilkanMenu() {
        System.out.println("========== Menu Operasi Single Linked List ==========");
        System.out.println("1. Tambah Data Mahasiswa Di Awal");
        System.out.println("2. Tambah Data Mahasiswa Di Akhir");
        System.out.println("3. Tambah Data Mahasiswa Pada Indeks Tertentu");
        System.out.println("4. Tambah Data Mahasiswa Setelah Data Tertentu");
        System.out.println("5. Cetak Semua Data Mahasiswa");
        System.out.println("0. Keluar");
        System.out.println("=====================================================");
        System.out.print("Pilih Menu : ");
        pilihan = input.nextInt();
        input.nextLine();
        System.out.println();
    }

    public static void main(String[] args) {
        do {
            tampilkanMenu();
            switch (pilihan) {
                case 1:
                    sll.addFirst(tambahkanData());
                    System.out.println("Data Berhasil Ditambahkan Di Awal.\n");
                    break;
                case 2:
                    sll.addLast(tambahkanData());
                    System.out.println("Data Berhasil Ditambahkan Di Akhir.\n");
                    break;
                case 3:
                    System.out.print("Masukkan Indeks : ");
                    int index = input.nextInt();
                    input.nextLine();
                    sll.insertAt(index, tambahkanData());
                    System.out.println("Data Berhasil Ditambahkan Di Indeks " + index + ".\n");
                    break;
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa Yang Dicari : ");
                    String key = input.nextLine();
                    sll.insertAfter(key, tambahkanData());
                    System.out.println("Data Berhasil Ditambahkan Setelah " + key + ".\n");
                    break;
                case 5:
                    sll.print();
                    break;
                case 0:
                    System.out.println("Terima Kasih Telah Menggunakan Program Ini.");
                    break;
                default:
                    break;
            }
        } while (pilihan != 0);

        // Percobaan 1
        // Mahasiswa08 mhs1 = new Mahasiswa08("21212203", "Dirga", "4D", 3.6);
        // Mahasiswa08 mhs2 = new Mahasiswa08("23212201", "Bimon", "2B", 3.8);
        // Mahasiswa08 mhs3 = new Mahasiswa08("22212202", "Cintia", "3C", 3.5);
        // Mahasiswa08 mhs4 = new Mahasiswa08("24212200", "Alvaro", "1A", 4.0);

        // sll.print();
        // System.out.println(); 
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addFirst(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs3);
        // sll.insertAt(2, mhs2);
        // sll.print();
    }
}