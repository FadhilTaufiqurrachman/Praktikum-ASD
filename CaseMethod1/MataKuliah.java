package CaseMethod1;

public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }
    
    void tampilMataKuliah() {
        System.out.printf("Kode MK: %s | Nama: %-13s | SKS: %s\n", kodeMK, namaMK, sks);
    }
}