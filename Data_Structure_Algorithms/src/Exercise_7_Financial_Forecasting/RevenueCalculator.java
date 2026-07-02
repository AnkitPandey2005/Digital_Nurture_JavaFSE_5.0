package Exercise_7_Financial_Forecasting;

public class RevenueCalculator {
    public static double futureAmount(double current, double rate, int years) {
        if (years == 0) {
            return current;
        }
        return futureAmount(current * (1 + rate), rate, years - 1);
    }

}
