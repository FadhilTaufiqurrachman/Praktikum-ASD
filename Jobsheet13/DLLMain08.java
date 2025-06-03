package Jobsheet13;

import java.util.Scanner;
public class DLLMain08 {
    static Mahasiswa08 inputMahasiswa(Scanner input) {
        System.out.print("Masukkan NIM : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = input.nextLine();
        System.out.print("Masukkan IPK : ");
        double ipk = input.nextDouble();
        input.nextLine(); 
        return new Mahasiswa08(nama, nim, kelas, ipk);
    }
    
    public static void main(String[] args) {
        DoubleLinkedList08 list = new DoubleLinkedList08();
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah Di Awal");
            System.out.println("2. Tambah Di Akhir");
            System.out.println("3. Hapus Di Awal");
            System.out.println("4. Hapus Di Akhir");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Sisipkan Setelah NIM Tertentu");
            System.out.println("7. Cari Mahasiswa Berdasarkan NIM");      
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");       
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa08 mhs = inputMahasiswa(input);
                    list.addFirst(mhs);
                }     
                case 2 -> {
                    Mahasiswa08 mhsw = inputMahasiswa(input);
                    list.addLast(mhsw);  
                }   
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM Untuk Menyisipkan Setelah NIM : ");
                    String nimCari = input.nextLine();
                    Mahasiswa08 mhsa = inputMahasiswa(input);
                    list.insertAfter(nimCari, mhsa);
                }
                case 7 -> {
                    System.out.print("Masukkan NIM Yang Dicari : ");
                    String nim = input.nextLine();
                    Node08 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data Ditemukan :");
                        found.data.tampil();
                    } else {
                        System.out.println("Data Tidak Ditemukan.");
                    }
                }
                case 0 -> System.out.println("Keluar Dari Program.");
                default -> System.out.println("Pilihan Tidak Valid!");
            }
        } while (pilihan != 0);
        input.close();
    }
}