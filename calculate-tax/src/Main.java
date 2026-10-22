import java.util.Scanner;
import ru.netology.servise.CustomsService;

public class Main {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Здравсвуйте!");

        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();

        System.out.print("Введите массу товара (в кг.): ");
        int weight = scanner.nextInt();

        int tax = CustomsService.calculateCustoms(price,weight);
        System.out.println("Размер пошлины (в руб.) составит: " + tax);
    }
}