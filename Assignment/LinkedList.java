package Assignment;
// import Assignment.Node;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(Square square) {
        Node newNode = new Node(square);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void displayAreas() {
        Node current = head;
        while (current != null) {
            System.out.println("Area of square with side " + current.getData().getSide() +
                    ": " + current.getData().getArea());
            current = current.getNext();
        }
    }
}

