package LSP;

public class SquareLSP implements Shape{

    private int side;

    public SquareLSP(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public int printArea() {
        return getArea();
    }
}
