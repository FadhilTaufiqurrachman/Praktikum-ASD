package Jobsheet13;

public class DoubleLinkedList08 {
    Node08 head;
    Node08 tail;
    int size;

    public DoubleLinkedList08() {
        head = null;
        tail = null;
        size = 0;
    }   

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa08 data) {
        Node08 newNode = new Node08(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode; 
        }
        size++;
    }

    public void addLast(Mahasiswa08 data) {
        Node08 newNode = new Node08(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode; 
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa08 data) {
        Node08 current = head;
        while(current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node Dengan NIM " + keyNim + " Tidak Ditemukan.");
            return;
        }
        Node08 newNode = new Node08(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Node Berhasil Disisipkan Setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List Kosong.");
            return;
        }
        Node08 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public Node08 search(String nim) {
        Node08 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null; 
    }

    // Percobaan 2
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List Kosong, Tidak Bisa Dihapus.");
            return;
        }
        System.out.println("Data Sudah Berhasil Dihapus. Data Yang Terhapus Adalah");
        head.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List Kosong, Tidak Bisa Dihapus.");
            return;
        }
        System.out.println("Data Sudah Berhasil Dihapus. Data Yang Terhapus Adalah");
        tail.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    // Tugas Praktikum
    public void add(int index, Mahasiswa08 data) {
        if (index < 0) {
            System.out.println("Index Tidak Valid!");
            return;
        }
        if (index > 0 && isEmpty()) {
            System.out.println("List Masih Kosong, Otomatis Menambahkan Di Awal.");
            addFirst(data);
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node08 newNode = new Node08(data);
        Node08 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Index Melebihi Ukuran List, Otomatis Menambahkan Di Akhir.");
            addLast(data);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                tail = newNode; 
            }
            current.next = newNode;
        }
        size++;
    }

    public void removeAfter(String keyNim) {
        Node08 current = head;
        while (current != null) {
            if (current.data.nim.equals(keyNim)) {
                break;
            } 
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node Dengan NIM " + keyNim + " Tidak Ditemukan.");
            return;
        }
        if (current.next == null) {
            System.out.println("Tidak Ada Node Setelah NIM " + keyNim + ", Tidak Ada Data Yang Dapat Dihapus.");
            return;
        }

        if (current.next == tail) {
            removeLast();
        } else if (current == head) {
            removeFirst();
        } else {
            System.out.println("Data Sudah Berhasil Dihapus. Data Yang Terhapus Adalah");
            current.next.data.tampil();
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }

    public void remove(int index) {
        if (index < 0) {
            System.out.println("Index Tidak Valid!");
            return;
        }
        if (head == tail && index > 0) {
            System.out.println("List Hanya Memiliki Satu Elemen, Tidak Ada Data Yang Dapat Dihapus.");
            return;
            
        }
        if (index == 0) {
            removeFirst();
            return;
        }

        Node08 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Index Melebihi Ukuran List, Tidak Ada Data Yang Dapat Dihapus.");
            return;
        }
        System.out.println("Data Sudah Berhasil Dihapus. Data Yang Terhapus Adalah");
        current.data.tampil();
        if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
        size--;
    }

    public Mahasiswa08 getFirst() {
        if (isEmpty()) {
            System.out.println("List Masih Kosong, Tidak Ada Data Yang Dapat Ditampilkan.");
            return null;
        }
        return head.data; 
    }

    public Mahasiswa08 getLast() {
        if (isEmpty()) {
            System.out.println("List Masih Kosong, Tidak Ada Data Yang Dapat Ditampilkan.");
            return null;
        }
        return tail.data; 
    }

    public Mahasiswa08 getIndex(int index) {
        if (index < 0) {
            System.out.println("Index Tidak Valid!");
            return null;
        }
        Node08 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Index Melebihi Ukuran List, Tidak Ada Data Yang Dapat Ditampilkan.");
            return null;
        }
        return current.data; 
    }

    public void size() {
        if (isEmpty()) {
            System.out.println("List Masih Kosong, Jumlah Data Adalah 0.");
        } else {
            System.out.println("Jumlah Data Saat Ini Adalah " + size);
        }
    }
}