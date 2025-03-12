package Kuis1;

public class KaryawanMain08 {
    public static void main(String[] args) {
        Karyawan08[] arrKaryawan08 = new Karyawan08[4];

        for (int i = 0; i < 2; i++) {
            arrKaryawan08[i] = new Karyawan08();
        }

        arrKaryawan08[0].idPegawai08 = "116";
        arrKaryawan08[0].nama08 = "Irfan";
        arrKaryawan08[0].gajiPokok08 = 2500000;
        arrKaryawan08[0].hariKerja08 = 20;

        arrKaryawan08[1].idPegawai08 = "121";
        arrKaryawan08[1].nama08 = "Timina";
        arrKaryawan08[1].gajiPokok08 = 2750000;
        arrKaryawan08[1].hariKerja08 = 24;

        arrKaryawan08[2] = new Karyawan08("134", "Luvi", 2500000,25);
        arrKaryawan08[3] = new Karyawan08("147", "Siti", 3000000,24);

        System.out.println("========== Data Karyawan ==========");
        for (int i = 0; i < 4; i++) {
            arrKaryawan08[i].tampilkanInformasi();
        }
    }
}
