package Jobsheet3;
import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa08[] arrayOfMahasiswa = new Mahasiswa08[3];
        String dummy;

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa08();

            System.out.println("Masukkan Data Mahasiswa Ke-" + (i + 1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa[i].nim = input.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa[i].nama = input.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa[i].kelas = input.nextLine();
            System.out.print("IPK     : ");
            dummy = input.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------------");
        }

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("Data Mahasiswa Ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
        }
    }
}