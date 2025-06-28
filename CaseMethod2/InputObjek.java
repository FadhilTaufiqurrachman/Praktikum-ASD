package CaseMethod2;

import java.util.Scanner;
public class InputObjek {
    static Scanner input = new Scanner(System.in);
    static String idDokter, namaDokter, spesialisasiDokter;
    static String namaPasien, nikPasien, keluhanPasien;
    static int umurPasien;
    
    public static Dokter inputDokter() {
        System.out.print("Masukkan ID Dokter            : ");
        idDokter = input.nextLine();
        System.out.print("Masukkan Nama Dokter          : ");
        namaDokter = input.nextLine();
        System.out.print("Masukkan Spesialisasi Dokter  : ");
        spesialisasiDokter = input.nextLine();
        return new Dokter(idDokter, namaDokter, spesialisasiDokter);
    }

    public static Pasien inputPasien() {
        System.out.print("Nama Pasien      : ");
        namaPasien = input.nextLine();
        System.out.print("NIK Pasien       : ");
        nikPasien = input.nextLine();
        while (true) {
            System.out.print("Umur Pasien      : ");
            umurPasien = input.nextInt();
            input.nextLine();
            if (umurPasien < 0 || umurPasien > 150) {
                System.out.println("Umur Tidak Valid, Silakan Masukkan Umur Antara 0 - 150.");
            } else {
                break;
            } 
        }
        System.out.print("Keluhan Pasien   : ");
        keluhanPasien = input.nextLine();
        return new Pasien(namaPasien, nikPasien, umurPasien, keluhanPasien);
    }
}