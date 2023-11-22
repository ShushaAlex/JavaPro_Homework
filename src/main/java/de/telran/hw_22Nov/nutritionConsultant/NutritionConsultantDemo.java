package de.telran.hw_22Nov.nutritionConsultant;

public class NutritionConsultantDemo {

    static void getRecommendation(Month month) {
        switch (month) {
            case JANUARY:
                System.out.println("eat more meat!");
                break;
            case FEBRUARY:
                System.out.println("eat more bread and meat!");
                break;
            case MARCH:
                System.out.println("eat greens and oranges!");
                break;
            case APRIL:
                System.out.println("eat bliny it's Maslenitsa!");
                break;
            case MAY:
                System.out.println("eat fresh apricots!");
                break;
            case JUNE:
                System.out.println("eat fresh cherries and peaches!");
                break;
            case JULY:
                System.out.println("eat watermelons and tomatoes!");
                break;
            case AUGUST:
                System.out.println("eat apples from garden!");
                break;
            case SEPTEMBER:
                System.out.println("eat corn and carrots!");
                break;
            case OCTOBER:
                System.out.println("eat potatoes and pears!");
                break;
            case NOVEMBER:
                System.out.println("eat cabbage and meat!");
                break;
            case DECEMBER:
                System.out.println("eat duck and vinigret!");
                break;
        }
    }

    public static void main(String[] args) {
        getRecommendation(Month.MARCH);
        getRecommendation(Month.JANUARY);
    }

}
