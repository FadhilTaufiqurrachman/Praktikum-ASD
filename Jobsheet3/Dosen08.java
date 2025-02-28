package Jobsheet3;
import java.util.Scanner;

public class Dosen08 {
    public String kode, nama, jenisKelamin;
    public int usia;

    public Dosen08(String kode, String nama, String jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tambahData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kode Dosen                     : ");
        kode = input.nextLine();
        System.out.print("Nama Dosen                     : ");
        nama = input.nextLine();
        System.out.print("Jenis Kelamin (Pria/Wanita)    : ");
        jenisKelamin = input.nextLine();
        System.out.print("Usia                           : ");
        usia = input.nextInt();
        input.nextLine();
        System.out.println("-----------------------------------------------------");
    }

    void cetakInfo() {
        System.out.println("Kode Dosen       : " + kode);
        System.out.println("Nama Dosen       : " + nama);
        System.out.println("Jenis Kelamin    : " + jenisKelamin);
        System.out.println("Usia             : " + usia);
        System.out.println("-----------------------------------------------------");
    }
}