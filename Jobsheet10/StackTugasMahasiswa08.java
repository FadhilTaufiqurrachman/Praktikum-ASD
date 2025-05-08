package Jobsheet10;

public class StackTugasMahasiswa08 {
    Mahasiswa08[] stack;
    int size, top;

    public StackTugasMahasiswa08(int size) {
        this.size = size;
        stack = new Mahasiswa08[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa08 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh! Tidak Bisa Menambahkan Tugas Lagi.");
        }
    }

    public Mahasiswa08 pop() {
        if (!isEmpty()) {
            Mahasiswa08 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack Kosong! Tidak Ada Tugas Yang Untuk Dinilai.");
            return null;
        }
    }

    public Mahasiswa08 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong! Tidak Ada Tugas Yang Dikumpulkan.");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println();
    }

    public Mahasiswa08 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack Kosong! Tidak Ada Tugas Yang Dikumpulkan.");
            return null;
        }
    }

    public int jumlahTugas () {
        return top + 1;
    }
}