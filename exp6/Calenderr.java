package exp6;

import java.util.*;
import java.lang.Math;

class Bank {
    double rate_of_interest = 2.0;

    public double get_rate_of_interest() {
        return rate_of_interest;
    }

}

class SBI extends Bank {
    int days;
    double capital;

    public SBI(int days, double capital) {
        this.days = days;
        this.capital = capital;
    }

    @Override
    public double get_rate_of_interest() {
        if (days < 7)
            return 2.0;
        else if (days <= 45)
            return 3.00;
        else if (days <= 90)
            return 4.05;
        else if (days <= 120)
            return 4.10;
        else if (days <= 180)
            return 4.10;

        return 4.10;
    }

}

class ICICI extends Bank {
    int days;
    double capital;

    public ICICI(int days, double capital) {
        this.days = days;
        this.capital = capital;
    }

    @Override
    public double get_rate_of_interest() {
        if (days < 7)
            return 2.0;
        else if (days <= 14)
            return 3.10;
        else if (days <= 30)
            return 3.20;
        else if (days <= 45)
            return 3.50;
        else if (days <= 90)
            return 4.50;
        else if (days <= 120)
            return 4.70;
        else if (days <= 180)
            return 4.90;

        return 4.90;
    }

}

class AXIS extends Bank {
    int days;
    double capital;

    public AXIS(int days, double capital) {
        this.days = days;
        this.capital = capital;
    }

    @Override
    public double get_rate_of_interest() {
        if (days < 7)
            return 2.0;
        else if (days <= 30)
            return 3.15;
        else if (days <= 45)
            return 3.45;
        else if (days <= 90)
            return 4.05;
        else if (days <= 120)
            return 4.70;
        else if (days <= 180)
            return 5.00;

        return 5.00;
    }

}

public class Calenderr {

    public static void main(String[] args) {
        int days;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of days:");
        days = scanner.nextInt();
        Bank b = new Bank();
        SBI s = new SBI(days, 10000);
        s.capital *= (1 + b.get_rate_of_interest() / 100);

        ICICI i = new ICICI(days, 12500);
        i.capital *= (1 + b.get_rate_of_interest() / 100);

        AXIS a = new AXIS(days, 20000);
        a.capital *= (1 + b.get_rate_of_interest() / 100);

        int p = 1;
        while (p != 0) {
            System.out.println(
                    "Enter Choice:\n1.View Balance in SBI Bank.\n2.View Balance in ICICI Bank.\n3.View Balance in AXIS Bank.\n0.Exit.");
            p = scanner.nextInt();
            switch (p) {
                case 1: {
                    output(s, days, s.capital);
                    break;
                }
                case 2: {
                    output(i, days, i.capital);
                    break;
                }
                case 3: {
                    output(a, days, a.capital);
                    break;
                }
                case 0: {
                    System.out.println("Thank You!");
                    break;
                }

            }

        }

    }

    public static void output(SBI s, int days, double capital) {
        double r = s.get_rate_of_interest();
        double x = (1 + r / 100);
        double t = days / 365.0;
        double amount = capital * Math.pow(x, t);

        System.out.println("Balance in account = Rs." + amount);
    }

    public static void output(ICICI i, int days, double capital) {
        double r = i.get_rate_of_interest();
        double x = (1 + r / 100);
        double t = days / 365.0;
        double amount = capital * Math.pow(x, t);

        System.out.println("Balance in account = Rs." + amount);
    }

    public static void output(AXIS a, int days, double capital) {
        double r = a.get_rate_of_interest();
        double x = (1 + r / 100);
        double t = days / 365.0;
        double amount = capital * Math.pow(x, t);

        System.out.println("Balance in account = Rs." + amount);
    }

}
