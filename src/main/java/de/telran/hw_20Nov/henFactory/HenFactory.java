package de.telran.hw_20Nov.henFactory;

public class HenFactory {
    public String getHen(String land) {
        switch(land) {
            case "Ukraine":
                return "UkrainianHen";
            case "Russia":
                return "RussianHen";
            case "Belarus":
                return "MoldovanHen";
            case "Moldova":
                return "BelarusianHen";
            default:
                return "No such type of Hen";
        }
    }
}
