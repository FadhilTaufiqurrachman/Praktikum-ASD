import java.util.Scanner;
public class Tugas2 {
    static Scanner input = new Scanner(System.in);
    static byte menu;
    static float rusuk;

    static void tampilMenu() {
        System.out.println("         ================");
        System.out.println("           Pilihan Menu");
        System.out.println("==================================");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.println("==================================");
        System.out.print("Pilih Nomor Menu : ");
        menu = input.nextByte();
        input.nextLine();
        System.out.println();
    }

    static void input() {
        System.out.print("Masukkan Rusuk Dari Kubus : ");
        rusuk = input.nextShort();
    }

    static void volume() {
        input();
        float volume = rusuk * rusuk * rusuk; 
        System.out.println("Volumenya Adalah " + volume );
        System.out.println();
    }

    static void luasPermukaan() {
        input();
        float luasPermukaan = 6 * (rusuk * rusuk); 
        System.out.println("Luas Permukaannya Adalah " + luasPermukaan );
        System.out.println();
    }

    static void keliling() {
        input();
        float keliling = 12 * rusuk; 
        System.out.println("Kelilingnya Adalah " + keliling);
        System.out.println();
    }

    public static void main(String[] args) {
        do {
            tampilMenu();
                switch (menu) {
                    case 1:
                    volume();
                    break;
                    case 2:
                    luasPermukaan();
                    break;
                    case 3:
                    keliling();
                    break;
                    case 4:
                    System.out.println("Terima Kasih!");
                    break;
                    default:
                    System.out.println("Pilihan Tidak Valid.");
                    break;
            }
        } while (menu != 4 );
        input.close();
    }
}