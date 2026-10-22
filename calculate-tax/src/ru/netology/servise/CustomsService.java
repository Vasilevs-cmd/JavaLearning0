package ru.netology.servise;

public class CustomsService {
    public static int calculateCustoms(int price, int weight) {
        int tax = price / 100 + 100 * weight;
        return tax;
    }
}
