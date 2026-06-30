import java.util.*;

public class FinancialForecast {

    static double findAmount(double amt, double rate, int year) {

        if (year == 0) {
            return amt;
        }

        return findAmount(amt, rate, year - 1) * (1 + rate / 100);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Current Amount: ");
        double amt = sc.nextDouble();

        System.out.print("Enter Growth Rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int year = sc.nextInt();

        double ans = findAmount(amt, rate, year);

        System.out.printf("Future Amount = %.2f", ans);

        sc.close();
    }
}