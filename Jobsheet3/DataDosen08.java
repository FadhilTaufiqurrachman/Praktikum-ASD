package Jobsheet3;

public class DataDosen08 {
    void dataSemuaDosen(Dosen08 arrayOfDosen[]) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen Ke-" + (i + 1));
            arrayOfDosen[i].cetakInfo();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen08 arrayOfDosen[]) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin.equals("Pria")) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("Jumlah Dosen Laki-laki: " + jumlahPria);
        System.out.println("Jumlah Dosen Perempuan: " + jumlahWanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen08 arrayOfDosen[]) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin.equalsIgnoreCase("Pria")) {
                jumlahPria++;
                totalUsiaPria += arrayOfDosen[i].usia;
            } else {
                jumlahWanita++;
                totalUsiaWanita += arrayOfDosen[i].usia;
            }
        }
        System.out.println("Rerata Usia Dosen Laki-laki: " + (totalUsiaPria / jumlahPria));
        System.out.println("Rerata Usia Dosen Perempuan: " + (totalUsiaWanita / jumlahWanita));
    }

    void infoDosenPalingTua(Dosen08 arrayOfDosen[]) {
        int usiaTertua = 0;
        int indexDosenTertua = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > usiaTertua) {
                usiaTertua = arrayOfDosen[i].usia;
                indexDosenTertua = i;
            }
        }
        System.out.println("Dosen Tertua ");
        arrayOfDosen[indexDosenTertua].cetakInfo();
    }

    void infoDosenPalingMuda(Dosen08 arrayOfDosen[]) {
        int usiaTermuda = 100;
        int indexDosenTermuda = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < usiaTermuda) {
                usiaTermuda = arrayOfDosen[i].usia;
                indexDosenTermuda = i;
            }
        }
        System.out.println("Dosen Termuda ");
        arrayOfDosen[indexDosenTermuda].cetakInfo();
    }

}