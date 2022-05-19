class RT {
    private int width = 10;
    private int length = 5;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public RT() {

    }
    public RT(int width, int length) {
        this.width = width;
        this.length = length;

    }

    public int getSquare() {
        int square = width * length;
        return square;
    }

    public int getPerimeter() {
        int perimeter = 2 * (width + length);
        return perimeter;
    }
}
