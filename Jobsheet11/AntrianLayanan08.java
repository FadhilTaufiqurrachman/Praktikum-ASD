package Jobsheet11;

public class AntrianLayanan08 {
    Mahasiswa08[] data;
    int front, rear, size, max;

    public AntrianLayanan08(int max) {
        this.max = max;
        this.data = new Mahasiswa08[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong.");
        } else {
            System.out.print("Mahasiswa Terdepan : " );
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa Dalam Antrian : ");
        System.out.println("NIM - Nama - Prodi - Kelas");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue Berhasil Dikosongkan");
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }

    public void tambahAntrian(Mahasiswa08 mhs) {
        if (isFull()) {
            System.out.println("Antrian Penuh, Tidak Dapat Menambah Mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs; 
        size++;
        System.out.println(mhs.nama + " Berhasil Masuk Ke Antrian.");
    }

    public Mahasiswa08 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong.");
            return null;
        }
        Mahasiswa08 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong.");
        } else {
            System.out.print("Mahasiswa Terakhir : " );
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[rear].tampilkanData();
        }
    }
}