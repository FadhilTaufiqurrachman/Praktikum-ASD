package Jobsheet11;

import java.util.Scanner;
public class QueueMain08 {
    public static void menu() {
        System.out.println("Masukkan Operasi Yang Diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Queue : ");
        int n = input.nextInt();

        Queue08 Q = new Queue08(n);
        int pilih;

        do {
            menu();
            System.out.print("Pilih Menu : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    if (Q.isFull()) {
                        System.out.println("Queue Overflow, Program Berhenti.");
                        return;
                    }
                    System.out.print("Masukkan Data Baru : ");
                    int dataMasuk = input.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    if (Q.isEmpty()) {
                        System.out.println("Queue Underflow, Program Berhenti.");
                        return;
                    }
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data Yang Dikeluarkan : " + dataKeluar);
                    } 
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}