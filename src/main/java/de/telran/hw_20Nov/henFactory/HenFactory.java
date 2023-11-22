package de.telran.hw_20Nov.henFactory;

import de.telran.hw_20Nov.henFactory.henTypes.BelarusianHen;
import de.telran.hw_20Nov.henFactory.henTypes.MoldovanHen;
import de.telran.hw_20Nov.henFactory.henTypes.RussianHen;
import de.telran.hw_20Nov.henFactory.henTypes.UkrainianHen;

public class HenFactory {
    public Hen getHen(String land) {
        switch(land) {
            case "Ukraine":
                return new UkrainianHen(30);
            case "Russia":
                return new RussianHen(1);
            case "Belarus":
                return new BelarusianHen(5);
            case "Moldova":
                return new MoldovanHen(70);
        }
        return null;
    }
}
