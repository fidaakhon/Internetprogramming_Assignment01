package Assignment;
// import Assignment.LinkedList;
// import Assignment.Square;


public class Main {
    public static void main(String[] args) {
        LinkedList squareList = new LinkedList();

        Square square1 = new Square(5.0);
        Square square2 = new Square(8.0);
        Square square3 = new Square(3.0);

        squareList.insert(square1);
        squareList.insert(square2);
        squareList.insert(square3);

        squareList.displayAreas();
    }
}

