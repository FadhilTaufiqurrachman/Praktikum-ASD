import java.util.Scanner;
public class FungsiRoyalGarden {
    static Scanner input = new Scanner(System.in);
    static byte menu;
    static int[][] arrToko = {
        {10,5,15,7},
        {6,11,9,12},
        {2,10,10,5},
        {5,7,12,9}
};

    static void tampilMenu() {
        System.out.println("           Royal Garden");
        System.out.println("         ================");
        System.out.println("           Pilihan Menu");
        System.out.println("==================================");
        System.out.println("1. Menampilkan Pendapatan");
        System.out.println("2. Menampilkan Stok RoyalGarden 4");
        System.out.println("3. Keluar");
        System.out.println("==================================");
        System.out.print("Pilih Nomor Menu : ");
        menu = input.nextByte();
        input.nextLine();
        System.out.println();
    }

    static void pilihan() {
        String pilihan;
        String bunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        System.out.print("Apakah Terdapat Pengurangan Stock (Iya/Tidak)? : ");
        pilihan = input.nextLine();
        System.out.println("Stok Bunga Pada RoyalGarden 4");
        if (pilihan.equalsIgnoreCase("Iya")) {
            arrToko[3][0] = 4;
            arrToko[3][1] = 5;
            arrToko[3][3] = 4;
            for (int i = 0; i < 4; i++) {
                System.out.println(bunga[i] + " : " + arrToko[3][i]);
            }
        } else {
            for (int i = 0; i < 4; i++) {
                System.out.println(bunga[i] + " : " + arrToko[3][i]);
            }
        }
        System.out.println();
    }

    static void pendapatan() {
        String namaToko[] = {"RoyalGarden 1","RoyalGarden 2","RoyalGarden 3","RoyalGarden 4"};
        int total[] = new int[4];
        for (int i = 0; i < arrToko.length; i++) {
            int pendapatan = (arrToko[i][0] * 75000) + (arrToko[i][1] * 50000) + (arrToko[i][2] * 60000) + (arrToko[i][3] * 10000) ;
            total[i] = pendapatan;
        }
        System.out.println("Pendapatan Toko");
        System.out.println("==================================");
        for (int i = 0; i < 4; i++) {
            System.out.println(namaToko[i] + " : Rp." +total[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        do {
            tampilMenu();
                switch (menu) {
                    case 1:
                    pendapatan();
                    break;
                    case 2:
                    pilihan();
                    break;
                    case 3:
                    System.out.println("Terima Kasih!");
                    break;
                    default:
                    System.out.println("Pilihan Tidak Valid.");
                    break;
            }
        } while (menu != 3 );
        input.close();
    } 
}