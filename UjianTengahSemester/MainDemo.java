package UjianTengahSemester;
import java.util.Scanner;

public class MainDemo {
    static Scanner sc = new Scanner(System.in);
    static Penilaian penilaian[] =  new Penilaian[5];
    static Mahasiswa mhs[] = new Mahasiswa[3];
    static MataKuliah mk[] = new MataKuliah[3];

    static void tampilMahasiswa(){
        System.out.println("Daftar Mahasiswa");
        for (int i = 0; i < mhs.length; i++) {
            mhs[i].tampilMahasiswa();
        }
        System.out.println();
    }
    static void tampilMatakuliah(){
        System.out.println("Daftar Mata Kuliah");
        for (int i = 0; i < mk.length; i++) {
            mk[i].tampilMataKuliah();
        }
        System.out.println();
    }
    
    static void tampilPenilaian(){
        System.out.println("Daftar Penilaian : ");
        for (int i = 0; i < penilaian.length; i++) {
            penilaian[i].tampilPenilaian();
        }
        System.out.println();
    }

    static void tampilkanUpdateData() {
        System.out.println("Daftar Penilaian Setelah Update : ");
        for (int i = 0; i < penilaian.length; i++) {
            System.out.printf("%s | %s | %.2f | %.2f | %.2f \n", penilaian[i].mahasiswa.nama, penilaian[i].mataKuliah.namaMK, penilaian[i].nilaiTugas, penilaian[i].nilaiUTS, penilaian[i].nilaiUAS);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        mhs[0] = new Mahasiswa("22001", "Ali Rahman", "Informatika");
        mhs[1] = new Mahasiswa("22002", "Budi Santoso", "Informatika");
        mhs[2] = new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis");

        mk[0] = new MataKuliah("MK001","Struktur Data",3);
        mk[1] = new MataKuliah("MK002","Basis Data",3);
        mk[2] = new MataKuliah("MK003","Desain Web",3);

        penilaian[0] = new Penilaian(mhs[0], mk[0], 80, 85, 90);
        penilaian[1] = new Penilaian(mhs[0], mk[1], 60, 75, 70);
        penilaian[2] = new Penilaian(mhs[1], mk[0], 75, 70, 80);
        penilaian[3] = new Penilaian(mhs[2], mk[1], 85, 90, 95);
        penilaian[4] = new Penilaian(mhs[2], mk[2], 80, 90, 65);
        int menu;

        do {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("6. Update Nilai Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            System.out.println();
            switch (menu) {
                case 1:
                    tampilMahasiswa();
                    break;
                case 2:
                    tampilMatakuliah();
                    break;
                case 3:
                    tampilPenilaian();
                    break;
                case 4:
                    Utility.selectionSort(penilaian);
                    break;
                case 5:
                    System.out.print("Masukkan NIM Mahasiswa Yang Dicari : ");
                    String cariNim = sc.nextLine();
                    Utility.sequentialSearch(mhs, cariNim);
                    break;
                case 6:
                    System.out.print("Masukkan NIM Mahasiswa Yang Ingin Diupdate Nilainya : ");
                    cariNim = sc.nextLine();
                    System.out.print("Masukkan Kode Mata Kuliah : ");
                    String kodeMK = sc.nextLine();
                    Utility.updateNilai(penilaian, cariNim, kodeMK);
                    break;
                case 0:
                    System.out.println("Program Selesai, Terima Kasih.");
                    break;
                default:
                    System.out.println("Input Tidak Valid.");
                    break;
            }
        } while (menu!=0);
    }
}