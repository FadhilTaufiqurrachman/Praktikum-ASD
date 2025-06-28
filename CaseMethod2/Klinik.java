package CaseMethod2;

import java.util.Scanner;
public class Klinik {
    static Scanner input = new Scanner(System.in);
    static DLLAntrian antrianPasien = new DLLAntrian();
    static QueueTransaksi riwayatTransaksi = new QueueTransaksi(100);
    static int pilihan, durasiLayanan;

    static void tampilkanMenu() {
        System.out.println("\n=============================================");
        System.out.println("=========== Sistem Antrian Klinik ===========");
        System.out.println("=============================================");
        System.out.println("1. Tambah Pasien Ke Antrian.");
        System.out.println("2. Lihat Antrian.");
        System.out.println("3. Layani Pasien.");
        System.out.println("4. Cek Sisa Antrian Pasien.");
        System.out.println("5. Lihat Riwayat Transaksi.");
        System.out.println("6. Hapus Riwayat Transaksi Posisi Pertama.");
        System.out.println("7. Hapus Semua Riwayat Transaksi.");
        System.out.println("8. Hapus Semua Antrian Pasien.");   
        System.out.println("9. Perbarui Data Pasien Pada Antrian.");
        System.out.println("10. Perbarui Durasi Pada Riwayat Transaksi.");
        System.out.println("11. Urutkan Riwayat Transaksi (Harga).");
        System.out.println("0. Keluar");
        System.out.println("=============================================");
        System.out.print("Pilih Menu : ");
        pilihan = input.nextInt();
        input.nextLine();
        System.out.println();
    }
    public static void main(String[] args) {
        do {
            tampilkanMenu();
            switch (pilihan) {
                case 1 -> {
                    System.out.println("--------------- Tambah Pasien ---------------");
                    Pasien pasien = InputObjek.inputPasien();
                    antrianPasien.addLast(pasien);
                }
                case 2 -> {
                    if (antrianPasien.isEmpty()) {
                        System.out.println(">> Antrian Kosong.");
                        break;
                    }
                    antrianPasien.tampilkanAntrian();
                }
                case 3 -> {
                    if (antrianPasien.isEmpty()) {
                        System.out.println(">> Antrian Kosong, Tidak Ada Pasien Yang Dapat Dilayani.");
                        break;
                    }
                    System.out.println("--------------- Layani Pasien ---------------");
                    Pasien pasienDilayani = antrianPasien.removeFirst();
                    System.out.println("Pasien " + pasienDilayani.nama + " Dipanggil.");
                    Dokter dokter = InputObjek.inputDokter();
                    while (true) {
                        System.out.print("Masukkan Durasi Layanan (Jam) : ");
                        durasiLayanan = input.nextInt();
                        input.nextLine();
                        if (durasiLayanan <= 0) {
                            System.out.println("Durasi Layanan Tidak Valid, Silakan Masukkan Durasi Lebih Dari 0 Jam.");
                        } else {
                            break;
                        }
                    }
                    TransaksiLayanan transaksiBaru = new TransaksiLayanan(pasienDilayani, dokter, durasiLayanan);
                    riwayatTransaksi.enqueue(transaksiBaru);
                    System.out.println(">> Pasien Telah Dilayani, Transaksi Berhasil Dicatat.");
                }
                case 4 -> antrianPasien.size();
                case 5 -> riwayatTransaksi.tampilkanRiwayat();
                case 6 -> riwayatTransaksi.dequeue();
                case 7 -> riwayatTransaksi.clear();
                case 8 -> antrianPasien.clear();
                case 9 -> {
                    if (antrianPasien.isEmpty()) {
                        System.out.println(">> Antrian Kosong, Tidak Ada Data Yang Dapat Diperbarui.");
                        break;
                    }
                    System.out.println("--------------- Perbarui Data Pasien Pada Antrian ---------------");
                    System.out.print("Masukkan Nama Pasien Yang Ingin Diperbarui Datanya : ");
                    String namaPasien = input.nextLine();
                    if (!antrianPasien.cekAntrianPasien(namaPasien)) {
                        System.out.println("\n>> Pasien Dengan Nama " + namaPasien + " Tidak Ditemukan Dalam Antrian.");
                        break;
                    }
                    System.out.println(">> Data Pasien Ditemukan, Silakan Masukkan Data Baru.\n");
                    Pasien editData = InputObjek.inputPasien();
                    antrianPasien.updateDataPasien(namaPasien, editData);
                    System.out.println(">> Data Pasien Berhasil Diperbarui.");
                }
                case 10 -> {
                    if (riwayatTransaksi.isEmpty()) {
                        System.out.println(">> Riwayat Transaksi Kosong, Tidak Ada Data Yang Dapat Diperbarui.");
                        break;
                    }
                    System.out.println("--------------- Perbarui Data Durasi Layanan ---------------");
                    System.out.print("Masukkan Nama Pasien Yang Ingin Diperbarui Durasi Layanannya : ");
                    String namaPasien = input.nextLine();
                    int index = riwayatTransaksi.cekRiwayatTransaksi(namaPasien);
                    if (index == -1) {
                        System.out.println("\n>> Transaksi Atas Nama " + namaPasien + " Tidak Ditemukan Dalam Riwayat Transaksi.");
                        break;
                    }
                    System.out.println(">> Data Transaksi Ditemukan, Silakan Masukkan Durasi Layanan Baru.\n");
                    while (true) {
                        System.out.print("Masukkan Durasi Layanan (Jam) : ");
                        durasiLayanan = input.nextInt();
                        input.nextLine();
                        if (durasiLayanan <= 0) {
                            System.out.println("Durasi Layanan Tidak Valid, Silakan Masukkan Durasi Lebih Dari 0 Jam.");
                        } else {
                            break;
                        }
                    }
                    riwayatTransaksi.perbaruiTransaksi(index, durasiLayanan);
                }
                case 11 -> {
                    riwayatTransaksi.selectionSortByBiaya();
                }
                case 0 -> System.out.println(">> Terima Kasih Telah Menggunakan Sistem Antrian Klinik.\n");
                default -> System.out.println(">> Pilihan Tidak Valid! Silakan Pilih Menu Yang Tersedia.");
            }
        } while (pilihan != 0);
    }
}