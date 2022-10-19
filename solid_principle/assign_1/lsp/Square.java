package lsp;
public class Square implements areaShape {
    private int width;

    Square(int side) {
        this.setSide(side);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.width = height;
    }

    public void setSide(int side) {
        this.setWidth(side);
        this.setHeight(side);
    }

    @Override
    public int getArea() {
        return this.width * this.width;
    }
}