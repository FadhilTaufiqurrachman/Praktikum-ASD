public class MataKuliah08 {
    String kodeMK, nama;
    int sks, jumlahJam;

    public MataKuliah08() {

    }

    public MataKuliah08(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("=================================================");
        System.out.println("================== Mata Kuliah ==================");
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("Jumlah SKS       : " + sks);
        System.out.println("Jumlah Jam       : " + jumlahJam);
        System.out.println("=================================================\n");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS Mata Kuliah " + nama + " Berhasil Diubah Menjadi " + sks);
        System.out.println();
    }

    void tambahJam (int jam) {
        jumlahJam += jam;
        System.out.println("Penambahan Jam Mata Kuliah " + nama + " Berhasil, Jumlah Jam Menjadi " + jumlahJam);
        System.out.println();
    }

    void kurangiJam (int jam) {
        if (jam >= jumlahJam) {
            System.out.println("Jam Yang Akan Dikurangi Melebihi Jumlah Jam Yang Ada");
            System.out.println();
        } else if (jam < 0) {
            System.out.println("Jam Yang Dimasukkan Tidak Valid");
            System.out.println();
        }else {
            jumlahJam -= jam;
            System.out.println("Pengurangan Jam Mata Kuliah " + nama +" Berhasil, Jumlah Jam Menjadi " + jumlahJam);
            System.out.println();
        }
    }
}