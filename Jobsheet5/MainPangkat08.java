package Jobsheet5;
import java.util.Scanner;

public class MainPangkat08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Elemen : ");
        int elemen = input.nextInt();

        Pangkat08[] png = new Pangkat08[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Nilai Basis Elemen Ke-" + (i+1) + " : ");
            int basis = input.nextInt();
            System.out.print("Masukkan Nilai Pangkat Elemen Ke-" + (i+1) + " : ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat08(basis, pangkat);
        }

        System.out.println("Hasil Pangkat Brute Force : ");
        for (Pangkat08 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatBF(p.nilai, p.pangkat));
        }
        
        System.out.println("Hasil Pangkat Divide And Conquer : ");
        for (Pangkat08 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
