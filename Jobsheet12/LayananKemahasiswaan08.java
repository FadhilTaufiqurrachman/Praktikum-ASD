package Jobsheet12;

import java.util.Scanner;
public class LayananKemahasiswaan08 {
    static Scanner input = new Scanner(System.in);
    static int pilihan;

    public void tampilkanMenu() {
        System.out.println("\n===================================================");
        System.out.println("            Sistem Layanan Kemahasiswaan           ");
        System.out.println("===================================================");        
        System.out.println("1. Cek Antrian Kosong.");
        System.out.println("2. Cek Antrian Penuh.");
        System.out.println("3. Menghapus Seluruh Antrian.");
        System.out.println("4. Tambah Mahasiswa Ke Antrian.");
        System.out.println("5. Memanggil Antrian Mahasiswa.");
        System.out.println("6. Tampilkan Semua Antrian.");
        System.out.println("7. Tampilkan Antrian Terdepan.");
        System.out.println("8. Tampilkan Antrian Terakhir");
        System.out.println("9. Tampilkan Jumlah Mahasiswa Dalam Antrian.");
        System.out.println("0. Keluar.");
        System.out.println("===================================================");
        System.out.print("Pilih Menu : ");
        pilihan = input.nextInt();
        input.nextLine();
        System.out.println(); 
    }

    public static void main(String[] args) {
        int jumlahAntrian = 5;
        LayananAntrian08 sllAntrian = new LayananAntrian08(jumlahAntrian);

        do {
            LayananKemahasiswaan08 menu = new LayananKemahasiswaan08();
            menu.tampilkanMenu();
            switch (pilihan) {
                case 1:
                    if (sllAntrian.isEmpty()) {
                        System.out.println("Antrian Masih Kosong.");
                    } else {
                        System.out.println("Antrian Tidak Kosong.");
                    }
                    break;
                case 2:
                    if (sllAntrian.isFull()) {
                        System.out.println("Antrian Sudah Penuh.");
                    } else {
                        System.out.println("Antrian Tidak Penuh.");
                    }
                    break;
                case 3:
                    sllAntrian.mengosongkanAntrian();
                    break;
                case 4:
                    if (sllAntrian.isFull()) {
                        System.out.println("Maaf, Antrian Sudah Penuh.");
                        break;
                    }
                    System.out.println("------------ Tambah Mahasiswa Ke Antrian ------------");
                    System.out.print("Masukkan NIM          : ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama         : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Jurusan      : ");
                    String jurusan = input.nextLine();
                    System.out.print("Masukkan Prodi        : ");
                    String prodi = input.nextLine();
                    System.out.print("Masukkan Keperluan    : ");
                    String keperluan = input.nextLine();
                    MahasiswaAntrian08 mahasiswa = new MahasiswaAntrian08(nim, nama, jurusan, prodi, keperluan);
                    sllAntrian.addLast(mahasiswa);
                    break;
                case 5:
                    sllAntrian.removeFirst();
                    break;
                case 6:
                    sllAntrian.print();
                    break;
                case 7:
                    sllAntrian.printFirst();
                    break;
                case 8:
                    sllAntrian.printLast();
                    break;
                case 9:
                    sllAntrian.printSize();
                    break;
                case 0:
                    System.out.println("Terima Kasih Telah Menggunakan Sistem Layanan Kemahasiswaan.\n");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid, Silakan Coba Lagi!");
            }
        } while (pilihan != 0);
    }
}