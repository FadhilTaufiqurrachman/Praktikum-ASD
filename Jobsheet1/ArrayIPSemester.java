import java.util.Scanner;
public class ArrayIPSemester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] namaMatkul = new String[8];
        float[] nilaiAngka = new float[namaMatkul.length];
        String[] nilaiHuruf = new String[namaMatkul.length];
        float[] bobotNilai = new float[namaMatkul.length];
        byte[] sks = new byte[namaMatkul.length];
        float ipSemester = 0;
        byte totalSKS = 0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan Nama Mata Kuliah : ");
            namaMatkul[i] = input.nextLine();
        }
        System.out.println("==============================");
        for (int i = 0; i < namaMatkul.length; i++) {
            while (true) {
                System.out.print("Masukkan Nilai Angka Untuk MK " + namaMatkul[i] + " : ");
                nilaiAngka[i] = input.nextFloat();
                if (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                    System.out.println("Nilai Angka Tidak Valid!");
                } else {
                    break;
                }
            }

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00f;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50f;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00f;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50f;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00f;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00f;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }
        System.out.println("==============================");
        for (int i = 0; i < namaMatkul.length; i++) {
            while (true) {
                System.out.print("Masukkan Bobot SKS Untuk MK " + namaMatkul[i] + " : ");
                sks[i] = input.nextByte();
                if (sks[i] < 0 || sks[i] > 10) {
                    System.out.println("Bobot SKS Tidak Valid!");
                } else {
                    break;
                }
            }
            totalSKS += sks[i];
        }

        for (int i = 0; i < namaMatkul.length; i++) {
            ipSemester += (bobotNilai[i] * sks[i]);
        }
        ipSemester = ipSemester / totalSKS;
        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.println("MK\t\t\t\t\t Nilai Angka\t Nilai Huruf\t Bobot Nilai");
        for (int i = 0; i < 8; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n",namaMatkul[i],nilaiAngka[i],nilaiHuruf[i],bobotNilai[i]);
        }
        System.out.println("==============================");
        System.out.println("IP Semester : " + ipSemester);
        input.close();
    }    
}