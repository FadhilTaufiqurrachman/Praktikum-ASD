package Jobsheet7;

import java.util.Scanner;
public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data Mahasiswa : ");
        int jumMhs = input.nextInt();
        input.nextLine();
        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08();
        
        list.jumlahData(jumMhs);
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa Ke-" + (i + 1));
            System.out.print("NIM     : ");
            String nim = input.nextLine();
            System.out.print("Nama    : ");
            String nama = input.nextLine();
            System.out.print("Kelas   : ");
            String kelas = input.nextLine();
            System.out.print("IPK     : ");
            String ip = input.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------------");
            list.tambah(new Mahasiswa08(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("---------------------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa Yang Dicari");
        System.out.print("IPK     : ");
        double cari = input.nextDouble();

        // System.out.println("Menggunakan Sequential Searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        System.out.println("---------------------------------------------------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("---------------------------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        input.close();
    }
}