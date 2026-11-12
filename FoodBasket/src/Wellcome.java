public class Wellcome {
    public static void outputGreeting() {
        System.out.println("Добро пожаловать!");
        System.out.println("Ассортимент покупок:");
        System.out.printf("%-6s %-15s %11s\n", "Номер", "Продукт", "Цена");
        for (int i = 0; i < FoodBasket.products.length; i++) {
            System.out.printf("%-6d %-15s %10dр.\n", i + 1, FoodBasket.products[i], FoodBasket.prises[i]);
        }
    }
}
