package Exercise_7_Financial_Forecasting;

import java.util.Scanner;

public class ForecastDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current revenue: ");
        double revenue = sc.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        double growth = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double answer = RevenueCalculator.futureAmount(revenue, growth / 100, years);

        System.out.printf("\nExpected Revenue after %d years = %.2f", years, answer);

        sc.close();
    }
}
