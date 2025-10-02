package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for (int i=0; i<usage.length; i++){
            System.out.print("Day " + (i+1) + ": ");
            for (int j=0; j<usage[i].length; j++){
                System.out.print(usage[i][j] + " kWh ");
            }
            System.out.println();
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int i=0; i<prices.length; i++){
            System.out.print("Day " + (i+1) + ": ");
            for (int j=0; j<prices[i].length; j++){
                System.out.print(prices[i][j] + " NOK ");
            }
            System.out.println();
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {
        double sum = 0;

        for (double[] rad : usage){
            for (double verdi : rad){
                sum += verdi;
            }
        }
        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        int i = 0;
        int j = 0;

        // Kunne brukt en for-løkke som er enklere imo, men det stod i oppgaven at man skulle bruke while.

        while (!exceeded && i < powerusage.length){
            j = 0;
            while (!exceeded && j < powerusage[i].length){
                usage += powerusage[i][j];
                if (usage > threshold){
                    exceeded = true;
                }
                j++;
            }
            i++;
        }
        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {
        double price = 0;

        for (int i=0; i<usage.length; i++){
            for (int j=0; j<usage[i].length; j++){
                price += usage[i][j] * prices[i][j];
            }
        }
        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        // TODO

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {
        double norgesPris = 0.50; // pr kWh
        double price = 0;

        for (double[] rad : usage){
            for (double verdi : rad){
                price += verdi*norgesPris;
            }
        }
        return price;
    }
}
