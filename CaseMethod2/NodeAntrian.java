package CaseMethod2;

public class NodeAntrian {
    Pasien data;
    NodeAntrian next;
    NodeAntrian prev;

    public NodeAntrian(Pasien data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}