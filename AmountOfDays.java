import static java.lang.Integer.parseInt;

public class AmountOfDays {
    public static int determiningTheAmountOfDays(int year) {
        if (year % 400 == 0) {
            return 366;
        } else if (year % 100 == 0) {
            return 365;
        } else if (year % 4 == 0) {
            return 366;
        } else {
            return 365;
        }
    }
}
