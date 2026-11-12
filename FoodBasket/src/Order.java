import java.util.Scanner;

public class Order {
    public static int[] basket = new int[FoodBasket.prises.length];

    public static void entryOrder() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nДля выхода из программы введите \"end\".");
            System.out.print("Для продолжения работы с программой\n" +
                    "введите порядковый номер подукта и количество через пробел: ");
            String enter = scanner.nextLine();
            if (enter.equals("end")) {
                break;
            }
            String[] order = enter.split(" ");

            boolean chek = true;
            if (order.length != 2) {
                System.out.println("Не корректный ввод.\n");
                continue;
            }

            for (char num : order[0].toCharArray()) {
                if (!Character.isDigit(num)) {
                    chek = false;
                }
            }

            for (char num : order[1].toCharArray()) {
                if (!Character.isDigit(num)) {
                    chek = false;
                }
            }

            if (!chek || Integer.parseInt(order[0]) < 0 || Integer.parseInt(order[0]) > FoodBasket.products.length) {
                chek = false;
            }

            if (chek) {
                basket[Integer.parseInt(order[0]) - 1] = basket[Integer.parseInt(order[0]) - 1] + Integer.parseInt(order[1]);
            } else {
                System.out.println("Не корректный ввод.\n");
            }
        }
    }
}
