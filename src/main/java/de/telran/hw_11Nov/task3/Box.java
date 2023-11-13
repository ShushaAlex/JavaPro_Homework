package de.telran.hw_11Nov.task3;

public class Box {
    private final int length;
    private final int width;
    private final int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    private int getVolume() {
        return length * width * height;
    }
    protected int calcBoxesCount(int productVolume) {
        return productVolume / getVolume();
    }
    protected int calcRestProdVolume(int productVolume) {
        return productVolume % getVolume();
    }
}
