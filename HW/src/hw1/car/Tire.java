package hw1.car;

public class Tire {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Tire(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "size=" + size +
                '}';
    }

    public int increaseSize() {
        int newSize = this.size * 2;
        return newSize;
    }
}
