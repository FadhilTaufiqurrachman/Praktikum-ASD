package Jobsheet13;

public class DoubleLinkedList08 {
    Node08 head;
    Node08 tail;

    public DoubleLinkedList08() {
        head = null;
        tail = null;
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
    }
}