package task4;

public class Square implements iSide, iArea {
    private int side;

    @Override
    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return this.side * this.side;
    }

}
