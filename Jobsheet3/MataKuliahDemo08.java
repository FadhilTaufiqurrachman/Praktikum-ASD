package Jobsheet3;
import java.util.Scanner;

public class MataKuliahDemo08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kode, nama;
        int sks, jumlahJam, k;

        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        k = input.nextInt();
        input.nextLine();
        MataKuliah08[] arrayOfMataKuliah = new MataKuliah08[k];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Mata Kuliah Ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah08(kode = null, nama = null, sks = 0, jumlahJam = 0);
            arrayOfMataKuliah[i].tambahData();
        }

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Mata Kuliah Ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }
        input.close();
    }
}