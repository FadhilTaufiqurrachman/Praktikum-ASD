package UjianAkhirSemester;

public class QueueTransaksi {
    TransaksiLayanan[] queue;
    int front, rear, size, max;

    public QueueTransaksi(int max) {
        this.max = max;
        queue = new TransaksiLayanan[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(TransaksiLayanan transaksi) {
        if (isFull()) {
            System.out.println(">> Riwayat Transaksi Penuh, Silahkan Menghapus Transaksi Sebelumnya.");
            return;
        }
        if (isEmpty()) {
            front = rear = 0; 
        } else {
            rear = (rear + 1) % max;
        }
        queue[rear] = transaksi;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println(">> Riwayat Transaksi Kosong, Tidak Ada Transaksi Yang Dapat Dihapus.");
            return;
        }
        TransaksiLayanan transaksiDihapus = queue[front];
        if (isEmpty()) {
            front = rear = -1; 
        } else {
            front = (front + 1) % max;
        }
        size--;
        System.out.println("Riwayat Transaksi Yang Dihapus :");
        transaksiDihapus.tampilkanInformasiTransaksi();
        System.out.println(">> Berhasil Menghapus Riwayat Transaksi Posisi Pertama.");
    }

    public void tampilkanRiwayat() {
        if (isEmpty()) {
            System.out.println(">> Riwayat Transaksi Kosong.");
            return;
        }
        System.out.println("------------- Riwayat Transaksi -------------");
        System.out.println(">> Daftar Transaksi :\n");
        int current = front;
        for (int i = 0; i < size; i++) {
            TransaksiLayanan transaksi = queue[current];
            transaksi.tampilkanInformasiTransaksi();
            current = (current + 1) % max;
        }
    }

    public void clear() {
        if (isEmpty()) {
            System.out.println(">> Riwayat Transaksi Kosong.");
            return;
        }
        front = rear = -1;
        size = 0;
        System.out.println(">> Riwayat Transaksi Telah Dikosongkan.");
    }

    public int cekRiwayatTransaksi (String key) {
        int idx = 0;
        int temp = front;
        while (temp < size) {
            if (queue[temp].pasien.nama.equalsIgnoreCase(key)) {
                return idx;
            }
            idx++;
            temp = (temp + 1) % max;
        }
        idx = -1;
        return idx;
    }

    public void perbaruiTransaksi(int index, int durasiLayananBaru) {
        queue[index].hitungBiayaBaru(durasiLayananBaru);
        System.out.println(">> Durasi Layanan Berhasil Diperbarui.");
    }

    public void selectionSortByBiaya() {
        if (isEmpty()) {
            System.out.println(">> Riwayat Transaksi Kosong, Tidak Ada Data Yang Dapat Diurutkan.");
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            int idxMin = (front + i) % max;
            for (int j = i + 1; j < size; j++) {
                int currentIdx = (front + j) % max;
                if (queue[idxMin].biaya > queue[currentIdx].biaya) {
                    idxMin = currentIdx;
                }
            }
            int swapIndex = (front + i) % max; 
            if (idxMin != swapIndex) {
                TransaksiLayanan temp = queue[swapIndex];
                queue[swapIndex] = queue[idxMin];
                queue[idxMin] = temp;
            }
        }
        System.out.println(">> Riwayat Transaksi Berhasil Diurutkan Berdasarkan Harga Secara Ascending.");
    }

    public void durasiLayananMenit () {
        if (isEmpty()) {
            System.out.println(">> Riwayat Transaksi Kosong.");
            return;
        }
        int totalDurasi = 0;
        int current = front;
        for (int i = 0; i < size; i++) {
            TransaksiLayanan transaksi = queue[current];
            int durasiMenit = transaksi.durasiLayanan * 60;
            totalDurasi += durasiMenit;
            current = (current + 1) % max;
        }
        System.out.println(">> Total Durasi Layanan Pada Riwayat Transaksi : " + totalDurasi + " Menit.");
    }
}