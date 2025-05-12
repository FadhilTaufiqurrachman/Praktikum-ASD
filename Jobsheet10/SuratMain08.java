package Jobsheet10;

import java.util.Scanner;
public class SuratMain08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat08 stack = new StackSurat08(10);
        int pilihan;

        do {
            System.out.println("====== Menu Program Surat Mahasiswa ======");
            System.out.println("1. Terima Surat Izin.");
            System.out.println("2. Proses Surat Izin.");
            System.out.println("3. Lihat Surat Izin Terakhir.");
            System.out.println("4. Cari Surat.");
            System.out.println("5. Lihat Semua Surat Yang Belum Diproses.");
            System.out.println("0. Keluar.");
            System.out.println("==========================================");
            System.out.print("Pilih Menu : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n------ Terima Surat Izin ------");
                    System.out.print("Masukkan ID Surat                         : ");
                    String idSurat = input.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa                   : ");
                    String namaMahasiswa = input.nextLine();
                    System.out.print("Masukkan Kelas                            : ");
                    String kelas = input.nextLine();
                    char jenisIzin;
                    do {
                        System.out.print("Masukkan Jenis Izin (S (Sakit), I (Izin)) : ");
                        jenisIzin = Character.toUpperCase(input.nextLine().charAt(0));
                        if (jenisIzin != 'S' && jenisIzin != 'I') {
                            System.out.println("Input Tidak Valid. Harap Masukkan 'S' Atau 'I'.");
                        }
                    } while (jenisIzin != 'S' && jenisIzin != 'I');
                    System.out.print("Masukkan Durasi (Hari)                    : ");
                    int durasi = input.nextInt();
                    input.nextLine(); 
                    Surat08 suratBaru = new Surat08(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(suratBaru);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\n------ Proses Surat Izin ------");
                    Surat08 suratDiproses = stack.pop();
                    if (suratDiproses != null) {
                        System.out.println("Surat Berikut Telah Diproses / Diverifikasi :");
                        suratDiproses.tampilkanSurat();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\n------ Lihat Surat Izin Terakhir ------");
                    Surat08 suratTerakhir = stack.peek();
                    if (suratTerakhir != null) {
                        System.out.println("Surat Izin Terakhir (Teratas) Adalah :");
                        suratTerakhir.tampilkanSurat();
                    } 
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\n------ Cari Surat ------");
                    System.out.print("Masukkan Nama Mahasiswa Yang Dicari : ");
                    String namaCari = input.nextLine();
                    stack.cariSurat(namaCari);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("\n------ Lihat Semua Surat Yang Belum Diproses ------");
                    if (stack.isEmpty()) {
                        System.out.println("Tidak Ada Surat Yang Tersimpan.");
                    } else {
                        System.out.println("Daftar Surat Izin Yang Tersimpan :");
                        for (int i = stack.top; i >= 0; i--) {
                            stack.data[i].tampilkanSurat();
                        }
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Keluar Dari Program, Terima Kasih!\n");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid! Silakan Coba Lagi.\n");
            }
        } while (pilihan != 0);
    }
}