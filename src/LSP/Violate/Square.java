package LSP.Violate;

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;  // 정사각형은 너비와 높이가 같아야 함
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}
