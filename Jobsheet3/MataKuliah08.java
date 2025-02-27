package Jobsheet3;
import java.util.Scanner;

public class MataKuliah08 {
    public String kode, nama, dummy;
    public int sks, jumlahJam;

    public MataKuliah08(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData() {
        Scanner input = new Scanner(System.in);
            System.out.print("Kode          : ");
            kode = input.nextLine();
            System.out.print("Nama          : ");
            nama = input.nextLine();
            System.out.print("SKS           : ");
            dummy = input.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = input.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------------");
    }

    void cetakInfo() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("SKS           : " + sks);
        System.out.println("Jumlah Jam    : " + jumlahJam);
        System.out.println("-------------------------------------");
    }
}