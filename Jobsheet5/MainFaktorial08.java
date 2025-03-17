package Jobsheet5;
import java.util.Scanner;

public class MainFaktorial08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();
        input.nextLine();

        Faktorial08 fk = new Faktorial08();
        System.out.println("Nilai Faktorial " + nilai + " Menggunakan Brute Force : " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + " Menggunakan Divide And Conquer : " + fk.faktorialDC(nilai));
    }
}