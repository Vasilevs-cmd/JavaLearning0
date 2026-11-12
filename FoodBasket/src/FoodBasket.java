public class FoodBasket {
    public static String[] products = {"Батон молочный", "Яблоки", "Молоко", "Бананы", "Карбонат", "Яйца", "Сахар", "Овсянка"};
    public static int[] prises = {60, 156, 160, 200, 240, 110, 85, 120};

    static void main() {
        Wellcome.outputGreeting();

        Order.entryOrder();

        System.out.println();

        OutputOrder.output();

    }
}
