package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: square, area " + getArea()
                + " sq.units, side: " + side
                + " sq.units, color: " + getColor());
    }
}
