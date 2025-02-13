import java.util.Scanner;
public class PemilihanNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte tugas, kuis, uts, uas;
        float hasil;
        boolean valid = false;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = input.nextByte();
        System.out.print("Masukkan Nilai Kuis : ");
        kuis = input.nextByte();
        System.out.print("Masukkan Nilai UTS : ");
        uts = input.nextByte();
        System.out.print("Masukkan Nilai UAS : ");
        uas = input.nextByte();
        System.out.println("==============================");
        System.out.println("==============================");

        if (tugas > 100 || tugas < 0 || kuis > 100 || kuis < 0 || uts > 100 || uts < 0 || uas > 100 || uts < 0) {
            System.out.println("Nilai Tidak Valid");
            System.out.println("==============================");
            System.out.println("==============================");
        } else {
            valid = true;
        }

        if (valid) {
            hasil = (tugas * 0.2f) + (kuis * 0.2f) + (uts * 0.3f) + (uas * 0.3f);
            System.out.println("Nilai Akhir : " + hasil);
            if (hasil > 80 && hasil <= 100) {
                nilaiHuruf = "A";
            } else if (hasil > 73 && hasil <= 80) {
                nilaiHuruf = "B+";
            } else if (hasil > 65 && hasil <= 73) {
                nilaiHuruf = "B";
            } else if (hasil > 60 && hasil <= 65) {
                nilaiHuruf = "C+";
            } else if (hasil > 50 && hasil <= 60) {
                nilaiHuruf = "C";
            } else if (hasil > 39 && hasil <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("==============================");
                if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                    System.out.println("ANDA TIDAK LULUS");
                } else {
                    System.out.println("SELAMAT ANDA LULUS");
                }
        }
        input.close();
    }
}