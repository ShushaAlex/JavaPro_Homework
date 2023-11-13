package de.telran.hw_11Nov.task3;
public class BoxDemo {
    public static void main(String[] args) {
        Service service = new Service();
        int width = service.getBoxWidth();
        int length = service.getBoxLength();
        int height = service.getBoxHeight();
        int prodVolume = service.getProdVolume();
        Box box1 = new Box(length, width, height);
        service.showResultOfCalc(prodVolume, box1.calcBoxesCount(prodVolume), box1.calcRestProdVolume(prodVolume));
    }
}