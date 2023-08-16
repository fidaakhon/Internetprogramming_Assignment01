package Assignment;
// import Assignment.Square;

public class Node {
    private Square data;
    private Node next;

    public Node(Square square) {
        this.data = square;
        this.next = null;
    }

    public Square getData() {
        return data;
    }

    public void setData(Square data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

