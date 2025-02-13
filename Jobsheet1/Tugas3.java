import java.util.Scanner;
public class Tugas3 {
    static Scanner input = new Scanner(System.in);
    static byte menu;
    static byte jumlahData = 0;
    static String namaMatkul[];
    static String hari[];
    static int sks[];
    static int semester[];

    static void tampilMenu() {
        System.out.println("======= Program Jadwal Kuliah Mahasiswa =======");
        System.out.println("1. Tambah Data Mata Kuliah.\n" + 
                            "2. Seluruh Jadwal Kuliah Mahasiswa.\n" + 
                            "3. Jadwal Kuliah Berdasarkan Hari.\n" +
                            "4. Jadwal Kuliah Berdasarkan Semester.\n" +
                            "5. Jadwal Kuliah Berdasarkan Nama Mata Kuliah.\n" +
                            "6. Keluar.");
        System.out.println("===============================================");
        System.out.print("Masukkan Nomor Menu : ");
        menu = input.nextByte();
        input.nextLine();
        System.out.println();
    }

    static boolean validasi() {
        boolean kosong = jumlahData <= 0 ? true : false;
        return kosong;
    }

    static void inputData() {
        boolean kosong = validasi();
        if (!kosong){
            System.out.println("Data Sudah Ada");
            return;
        }
        System.out.println("=========== Input Data Mata Kuliah ===========");
        while (kosong) {
            System.out.print("Masukkan Jumlah Data : ");
            jumlahData = input.nextByte();
            input.nextLine();
            if (jumlahData < 0) {
                System.out.println("Jumlah Data Tidak Valid!");
            } else {
                break;
            }
        }
        System.out.println("==============================================");
        namaMatkul = new String[jumlahData];
        hari = new String[jumlahData];
        sks = new int[jumlahData];
        semester = new int[jumlahData];
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data Ke-" + (i + 1));
            System.out.print("Masukkan Nama Mata Kuliah : ");
            namaMatkul[i] = input.nextLine();
            System.out.print("Masukkan Jadwal Hari Mata Kuliah : ");
            hari[i] = input.nextLine();
            System.out.print("Masukkan Jumlah SKS Mata Kuliah : ");
            sks[i] = input.nextInt();
            System.out.print("Masukkan Semester Mata Kuliah : ");
            semester[i] = input.nextInt();
            input.nextLine();
            System.out.println("==============================================");
            System.out.println();
        }
    }

    static void cetak(String namaMatkul, int sks, int semester, String hari) {
        System.out.printf("Nama Mata Kuliah : %s\n", namaMatkul);
        System.out.printf("Jumlah SKS : %s\n", sks);
        System.out.printf("Semester : %s\n", semester);
        System.out.printf("Hari : %s\n", hari);
        System.out.println("-----------------------------");
    }

    static void tampilkanJadwal() {
        boolean kosong = validasi();
        if (kosong){
            System.out.println("Silahkan Input Data Terlebih Dahulu!\n");
            return;
        }
        System.out.println("==============================================");
        System.out.println("========= Seluruh Jadwal Mata Kuliah =========");
        System.out.println("==============================================");
        for (int i = 0; i < jumlahData; i++) {
            cetak(namaMatkul[i], sks[i], semester[i], hari[i]);
        }
        System.out.println("==============================================");
        System.out.println();
    }

    static void tampilkanHari() {
        boolean kosong = validasi();
        if (kosong){
            System.out.println("Silahkan Input Data Terlebih Dahulu!\n");
            return;
        }
        System.out.print("Masukkan Hari Yang Ingin Dicari : ");
        String inputHari = input.nextLine();
        boolean ditemukan = false;
        System.out.printf("========== Mata Kuliah Hari %s ==========\n", inputHari);
        for (int i = 0; i < jumlahData; i++) {
            if (hari[i].equalsIgnoreCase(inputHari)) {
                ditemukan = true;
                cetak(namaMatkul[i], sks[i], semester[i], hari[i]);
            }
        }
        if (!ditemukan) {
            System.out.println("Mata Kuliah Tidak Ditemukan\n");
        }
        System.out.println();
    }

    static void tampilkanSemester() {
        boolean kosong = validasi();
        if (kosong){
            System.out.println("Silahkan Input Data Terlebih Dahulu!\n");
            return;
        }
        System.out.print("Masukkan Semester : ");
        int inputSemester = input.nextInt();
        input.nextLine();
        System.out.printf("========== Mata Kuliah Semester %s ==========\n", inputSemester);
        boolean ditemukan = false;
        for (int i = 0; i < jumlahData; i++) {
            if (semester[i] == inputSemester) {
                ditemukan = true;
                cetak(namaMatkul[i], sks[i], semester[i], hari[i]);
            }
        }
        if (!ditemukan) {
            System.out.println("Mata Kuliah Tidak Ditemukan\n");
        }
        System.out.println();
    }

    static void tampilkanMatkul() {
        boolean kosong = validasi();
        if (kosong){
            System.out.println("Silahkan Input Data Terlebih Dahulu!\n");
            return;
        }
        System.out.print("Masukkan Mata Kuliah : ");
        String inputNama = input.nextLine();
        System.out.printf("========== Mata Kuliah Semester %s ==========\n", inputNama);
        boolean ditemukan = false;
        for (int i = 0; i < jumlahData; i++) {
            if (namaMatkul[i].equalsIgnoreCase(inputNama)) {
                ditemukan = true;
                cetak(namaMatkul[i], sks[i], semester[i], hari[i]);
            }
        }
        if (!ditemukan) {
            System.out.println("Mata Kuliah Tidak Ditemukan\n");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        do {
            tampilMenu();
            switch (menu) {
                case 1:
                inputData();
                break;
                case 2:
                tampilkanJadwal();    
                break;
                case 3:
                tampilkanHari();
                break;
                case 4:
                tampilkanSemester();
                break;
                case 5:
                tampilkanMatkul();
                break;
                case 6:
                System.out.println("Terima kasih!");
                break;
                default:
                System.out.println("Pilihan tidak valid.");
                break;
            }
        } while (menu != 6 );
        input.close();
    }
}