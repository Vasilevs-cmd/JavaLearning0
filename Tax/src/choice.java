public class choice {
    public static void choiceTax(int earnings, int spendings) {
        int taxEarnings = earningsTax.taxEarnings(earnings);
        int taxEarningsSpendings = earningsSpendingsTax.taxEarningsMinusSpendings(earnings, spendings);

        if (taxEarnings < taxEarningsSpendings) {
            System.out.println("Мы советуем вам УСН доходы");
            System.out.println("Ваш налог составит: " + taxEarnings + " рублей");
            System.out.println("Налог на другой системе: " + taxEarningsSpendings + " рублей");
            System.out.println("Экономия: " + (taxEarningsSpendings - taxEarnings) + " рублей");
        } else if (taxEarningsSpendings < taxEarnings) {
            System.out.println("Мы советуем вам УСН доходы минус расходы");
            System.out.println("Ваш налог составит: " + taxEarningsSpendings + " рублей");
            System.out.println("Налог на другой системе: " + taxEarnings + " рублей");
            System.out.println("Экономия: " + (taxEarnings - taxEarningsSpendings) + " рублей");
        } else {
            System.out.println("Можете выбрать любую систему налогооблажения");
        }

    }
}
