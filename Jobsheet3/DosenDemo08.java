package Jobsheet3;

public class DosenDemo08 {
    public static void main(String[] args) {
        int j = 0;
        Dosen08[] arrayOfDosen = new Dosen08[3];
        System.out.println("==================== Tambah Data Dosen ====================");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen Ke-" + (i + 1));
            arrayOfDosen[i] = new Dosen08(null, null, null, 0);
            arrayOfDosen[i].tambahData();
        }
        System.out.println();
        System.out.println("========== Data Dosen ==========");
        // for (Dosen08 temp : arrayOfDosen) {
        //     System.out.println("Data Dosen Ke-" + (j=j+1));
        //     temp.cetakInfo();
        // }
        DataDosen08 dataDosen = new DataDosen08();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        System.out.println();
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        System.out.println();
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        System.out.println();
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        System.out.println();
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}