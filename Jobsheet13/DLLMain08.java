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
            System.out.println("8. Tambah Data Di Indeks Tertentu");
            System.out.println("9. Hapus Setelah NIM Tertentu");
            System.out.println("10. Hapus Pada Indeks Tertentu");
            System.out.println("11. Tampilkan Data Pertama");
            System.out.println("12. Tampilkan Data Terakhir");
            System.out.println("13. Tampilkan Data Pada Indeks Tertentu");
            System.out.println("14. Tampilkan Jumlah Data");      
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
                case 8 -> {
                    System.out.print("Masukkan Indeks Untuk Menambahkan Data : ");
                    int index = input.nextInt();
                    input.nextLine();
                    Mahasiswa08 mhsIndex = inputMahasiswa(input);
                    list.add(index, mhsIndex);
                }
                case 9 -> {
                    if (list.isEmpty()) {
                        System.out.println("List Kosong, Tidak Ada Data Yang Dihapus.");
                        break;
                    }
                    System.out.print("Masukkan NIM Untuk Menghapus Data Setelah NIM : ");
                    String keyNim = input.nextLine();
                    list.removeAfter(keyNim);
                }
                case 10 -> {
                    if (list.isEmpty()) {
                        System.out.println("List Kosong, Tidak Ada Data Yang Dihapus.");
                        break;
                    }
                    System.out.print("Masukkan Indeks Untuk Menghapus Data : ");
                    int indexHapus = input.nextInt();
                    input.nextLine();
                    list.remove(indexHapus);
                }
                case 11 -> {
                    Mahasiswa08 firstNode = list.getFirst();
                    if (firstNode != null) {
                        System.out.println("Data Pertama :");
                        firstNode.tampil();
                    } 
                }
                case 12 -> {
                    Mahasiswa08 lastNode = list.getLast();
                    if (lastNode != null) {
                        System.out.println("Data Terakhir :");
                        lastNode.tampil();
                    } 
                }
                case 13 -> {
                    if (list.isEmpty()) {
                        System.out.println("List Kosong, Tidak Ada Data Yang Ditampilkan.");
                        break;
                    }
                    System.out.print("Masukkan Indeks Untuk Menampilkan Data : ");
                    int indexTampil = input.nextInt();
                    input.nextLine();
                    Mahasiswa08 dataAtIndex = list.getIndex(indexTampil);
                    if (dataAtIndex != null) {
                        System.out.println("Data Pada Indeks " + indexTampil + " :");
                        dataAtIndex.tampil();
                    } 
                }
                case 14 -> list.size();
                case 0 -> System.out.println("Keluar Dari Program.");
                default -> System.out.println("Pilihan Tidak Valid!");
            }
        } while (pilihan != 0);
        input.close();
    }
}