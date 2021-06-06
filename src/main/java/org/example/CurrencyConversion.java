package org.example;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        int euro = scan.nextInt();
        System.out.print("What is the exchange rate? ");
        Double rate = scan.nextDouble();

        Double dollar = rate * euro;
        System.out.println(String.format("%d euros at an exchange rate of %.04f is\n%.02f U.S. Dollars.",euro, rate, dollar));
    }
}
