package Jobsheet12;

public class SingleLinkedList08 {
    // Percobaan 1
    NodeMahasiswa08 head;
    NodeMahasiswa08 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa08 tmp = head;
            System.out.println("Isi Linked List :\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong.");
        }
    }

    public void addFirst(Mahasiswa08 input) {
        NodeMahasiswa08 ndInput = new NodeMahasiswa08(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa08 input) {
        NodeMahasiswa08 ndInput = new NodeMahasiswa08(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter (String key, Mahasiswa08 input) {
        NodeMahasiswa08 ndInput = new NodeMahasiswa08(input, null);
        NodeMahasiswa08 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa08 input) {
        if (index < 0) {
            System.out.println("Indeks Salah.");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa08 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa08(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}