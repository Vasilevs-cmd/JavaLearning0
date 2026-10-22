package ru.netology.servise;

public class CustomsService {

    static final int CUSTOM_OF_WEIGHT = 100;

    public static int calculateCustoms(int price, int weight) {
        return price / 100 + CUSTOM_OF_WEIGHT * weight;
    }
}
