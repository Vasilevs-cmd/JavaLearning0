import java.util.Scanner;

public class GameLeapYear {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int counterRightAnswer = 0;

        while (true) {
            System.out.print("Введите год: ");
            int year = scanner.nextInt();
            System.out.print("Введите количество дней в " + year + "-ом году: ");
            int day = scanner.nextInt();

            if (AmountOfDays.determiningTheAmountOfDays(year) == day) {
                System.out.println("Верно!");
                counterRightAnswer++;
            } else {
                System.out.println("Неправильно! В " + year + "-ом году " +
                        AmountOfDays.determiningTheAmountOfDays(year) + " дней.");
                System.out.println("Набрано очков: " + counterRightAnswer);
                break;
            }
        }
    }
}
