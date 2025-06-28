package UjianAkhirSemester;

public class DLLAntrian {
    NodeAntrian head;
    NodeAntrian tail;
    int size;

    public DLLAntrian() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pasien data) {
        NodeAntrian newNode = new NodeAntrian(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode; 
        }
        size++;
        System.out.println(">> Pasien Masuk Ke Dalam Antrian.");
    }

    public Pasien removeFirst() {
        Pasien data = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return data;
    }

    public void tampilkanAntrian() {
        NodeAntrian current = head;
        System.out.println("--------------- Antrian Pasien ---------------");
        System.out.println(">> Daftar Antrian Pasien :\n");
        while (current != null) {
            current.data.tampilkanInformasi();
            current = current.next;
        }
    }

    public void size() {
        if (isEmpty()) {
            System.out.println(">> Tidak Ada Pasien Dalam Antrian.");
            return;
        }
        System.out.println(">> Sisa Pasien Dalam Antrian : " + size);
    }

    public void clear() {
        if (isEmpty()) {
            System.out.println(">> Antrian Pasien Kosong.");
            return;
        }
        head = tail = null;
        size = 0;
        System.out.println(">> Antrian Pasien Telah Dikosongkan.");
    }

    public boolean cekAntrianPasien(String key) {
        NodeAntrian current = head;
        boolean ditemukan = false;
        while (current != null) {
            if (current.data.nama.equalsIgnoreCase(key)) {
                ditemukan = true;
                return ditemukan; 
            }
            current = current.next;
        }
        return ditemukan;
    }

    public Pasien updateDataPasien(String key, Pasien pasienBaru) {
        NodeAntrian current = head;
        while (current != null) {
            if (current.data.nama.equalsIgnoreCase(key)) {
                current.data.setData(pasienBaru.nama, pasienBaru.nik, pasienBaru.umur, pasienBaru.keluhan);
                return current.data; 
            }
            current = current.next;
        }
        return null;
    }
}