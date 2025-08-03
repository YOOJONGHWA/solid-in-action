package LSP;

public class RectangleLSP  implements  Shape{

    private int width;
    private int height;

    public RectangleLSP(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public int printArea() {
        return getArea();
    }
}
