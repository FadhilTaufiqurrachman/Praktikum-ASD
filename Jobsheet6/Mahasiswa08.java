package Jobsheet6;

import java.util.Scanner;
public class Mahasiswa08 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa08() {

    }

    public Mahasiswa08(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
    }

    void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("NIM     : ");
        nim = sc.nextLine();
        System.out.print("Nama    : ");
        nama = sc.nextLine();
        System.out.print("Kelas   : ");
        kelas = sc.nextLine();
        System.out.print("IPK     : ");
        ipk = sc.nextDouble();
        sc.nextLine();
    }
}