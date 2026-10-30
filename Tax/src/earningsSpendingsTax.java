public class earningsSpendingsTax {
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;

        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
}
