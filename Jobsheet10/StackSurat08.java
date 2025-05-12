package Jobsheet10;

public class StackSurat08 {
    Surat08[] data;
    int top, size;
    
    public StackSurat08(int size) {
        this.size = size;
        data = new Surat08[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat08 surat) {
        if (!isFull()) {
            top++;
            data[top] = surat;
            System.out.println("Surat Berhasil Ditambahkan!");
        } else {
            System.out.println("Stack Penuh! Tidak Bisa Menambahkan Surat Lagi.");
        }
    }

    public Surat08 pop() {
        if (!isEmpty()) {
            Surat08 surat = data[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack Kosong! Tidak Ada Surat Yang Dapat Diambil.");
            return null;
        }
    }

    public Surat08 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack Kosong! Tidak Ada Surat Yang Dapat Dilihat.");
            return null;
        }
    }

    public void cariSurat(String namaMahasiswa) {
        boolean ditemukan = false;
        if (isEmpty()) {
            System.out.println("Stack Kosong! Tidak Ada Surat Yang Dapat Dicari.");
            return;
        }
        for (int i = 0; i <= top; i++) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                data[i].tampilkanSurat();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat Dengan Nama Mahasiswa " + namaMahasiswa + " Tidak Ditemukan.");
        }
    }
}