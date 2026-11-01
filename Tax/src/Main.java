import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int earnings = 0;
        int spendings = 0;

        while (true) {
            System.out.println("Выберете операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогооблажения");
            System.out.println("\"end\" Завершение работы программы");

            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        System.out.print("Введите сумму дохода: ");
                        String moneyStr = scanner.nextLine();
                        int money = Integer.parseInt(moneyStr);
                        earnings += money;
                        break;
                    case 2:
                        System.out.print("Введите сумму расхода: ");
                        String expenseStr = scanner.nextLine();
                        int expense = Integer.parseInt(expenseStr);
                        spendings += expense;
                        break;
                    case 3:
                        Choice.getChoiceTax(earnings, spendings);
                        break;
                    default:
                        System.out.println("Такой операции нет");
                }
            }
        }
        scanner.close();
    }
}