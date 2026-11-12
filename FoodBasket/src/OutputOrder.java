public class OutputOrder {
    public static void output() {
        System.out.println("Ваш заказ:");
        System.out.printf("%-15s %11s %10s\n", "Продукт", "Количество", "Сумма");
        int sum = 0;
        for (int i = 0; i < Order.basket.length; i++) {
            if (Order.basket[i] != 0) {
                System.out.printf("%-15s %11d %10dр.\n", FoodBasket.products[i], Order.basket[i], Order.basket[i] * FoodBasket.prises[i]);
                sum = sum + Order.basket[i] * FoodBasket.prises[i];
            }
        }
        System.out.println("Итого: " + sum + "р.");
    }
}
