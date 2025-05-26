package Jobsheet12;

public class LayananAntrian08 {
    NodeAntrian08 head, tail;
    int size, max;

    public LayananAntrian08(int max) {
        this.max = max;
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void mengosongkanAntrian() {
        if (!isEmpty()) {
            System.out.println("Seluruh Antrian Mahasiswa Yang Dihapus : ");
            System.out.printf("%-20s %-20s %-30s %-30s %-20s\n", "NIM", "Nama", "Jurusan", "Prodi", "Keperluan");
            NodeAntrian08 tmp = head;
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            head = null;
            tail = null;
            size = 0;
            System.out.println("Antrian Berhasil Dikosongkan.");
        } else {
            System.out.println("Antrian Memang Kosong.");
        }
    }

    public void addLast(MahasiswaAntrian08 input) {
        NodeAntrian08 ndInput = new NodeAntrian08(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        System.out.println("Data Berhasil Ditambahkan Ke Antrian.");
        size++;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            System.out.println("Antrian Mahasiswa Yang Dipanggil : ");
            System.out.printf("%-20s %-20s %-30s %-30s %-20s\n", "NIM", "Nama", "Jurusan", "Prodi", "Keperluan");
            head.data.tampilInformasi();
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            size--;
        } else {
            System.out.println("Antrian Kosong.");
        }
    }

    public void print() {
        if (!isEmpty()) {
            NodeAntrian08 tmp = head;
            System.out.println("Seluruh Antrian Mahasiswa : ");
            System.out.printf("%-20s %-20s %-30s %-30s %-20s\n", "NIM", "Nama", "Jurusan", "Prodi", "Keperluan");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian Kosong.");
        }
    }

    public void printFirst() {
        if (!isEmpty()) {
            System.out.println("Antrian Mahasiswa Pertama : ");
            System.out.printf("%-20s %-20s %-30s %-30s %-20s\n", "NIM", "Nama", "Jurusan", "Prodi", "Keperluan");
            head.data.tampilInformasi();
        } else {
            System.out.println("Antrian Kosong.");
        }
    }

    public void printLast() {
        if (!isEmpty()) {
            System.out.println("Antrian Mahasiswa Terakhir : ");
            System.out.printf("%-20s %-20s %-30s %-30s %-20s\n", "NIM", "Nama", "Jurusan", "Prodi", "Keperluan");
            tail.data.tampilInformasi();
        } else {
            System.out.println("Antrian Kosong.");
        }
    }

    public void printSize() {
        System.out.println("Jumlah Mahasiswa Dalam Antrian : " + size);
    }
}