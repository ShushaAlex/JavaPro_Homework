package de.telran.hw_28Feb.singleton;

public enum Singleton {
    INSTANCE;

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void showCount() {
        System.out.println(count);
    }

}
