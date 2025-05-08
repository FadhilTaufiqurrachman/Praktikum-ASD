package Jobsheet10;

import java.util.Scanner;
public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackTugasMahasiswa08 stack = new StackTugasMahasiswa08(5);
        int pilih;

        do {
            System.out.println("\nMenu :");
            System.out.println("1. Mengumpulkan Tugas"); 
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Total Tugas Yang Sudah Dikumpulkan");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            input.nextLine(); 
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = input.nextLine();
                    System.out.print("NIM : ");
                    String nim = input.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = input.nextLine();
                    Mahasiswa08 mhs = new Mahasiswa08(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s Berhasil Dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa08 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai Tugas Dari " + dinilai.nama);
                        System.out.print("Masukkan Nilai (0-100) : ");
                        int nilai = input.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s Adalah %d\n", dinilai.nama, dinilai.nilai);
                    }
                    break;
                case 3:
                    Mahasiswa08 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas Terakhir Dikumpulkan Oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar Semua Tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa08 terbawah = stack.bottom();
                    if (terbawah != null) {
                        System.out.println("Tugas Terbawah Adalah " + terbawah.nama);
                    }
                    break;
                case 6:
                    int total = stack.jumlahTugas();
                    if (total > 0) {
                        System.out.println("Total Tugas Yang Sudah Dikumpulkan : " + total);
                    } else {
                        System.out.println("Tidak Ada Tugas Yang Dikumpulkan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid.");
            }
        } while (pilih >= 1 && pilih <= 6);
        input.close();
    }
}