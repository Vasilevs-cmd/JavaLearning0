public class EarningsSpendingsTax {
    public static int calculationTaxMinus(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;

        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
}