package Assignment;

import java.time.LocalDateTime;

public class Square {
    private double side;
    private double area;
    private LocalDateTime creationDateTime;

    public Square() {
        this.side = 0.0;
        this.area = 0.0;
        this.creationDateTime = LocalDateTime.now();
    }

    public Square(double side) {
        this.side = side;
        this.area = side * side;
        this.creationDateTime = LocalDateTime.now();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.area = side * side;
    }

    public double getArea() {
        return area;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    @Override
    public String toString() {
        return "Square [side=" + side + ", area=" + area + ", creationDateTime=" + creationDateTime + "]";
    }
}
