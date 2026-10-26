import java.util.Scanner;

public class LeapYear {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int year;
        String yesOrNo;

        System.out.println("Здравствуйте!");

        while (true) {
            System.out.print("Введите год : ");
            year = scanner.nextInt();

            System.out.println("Количество дней " + AmountOfDays.determiningTheAmountOfDays(year) + ".");

            System.out.print("Желаете продолжить работу с программой y/n: ");
            yesOrNo = scanner.next();
            while (!yesOrNo.equals("y") && !yesOrNo.equals("n")) {
                System.out.println("Не корректный ответ.");
                System.out.print("Желаете продолжить работу с программой y/n: ");
                yesOrNo = scanner.next();
            }
            if (yesOrNo.equals("n")) {
                break;
            }
        }
        System.out.println("Завершение работы программы.");
    }
}
