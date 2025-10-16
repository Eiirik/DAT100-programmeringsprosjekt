package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month

    // Oppgave 5a) Konstruktør
    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;

    }

    double totalUsage = 0;
    public void computeAmount() {
        totalUsage = 0;
        amount = 0;
        if (c.getAgreement() == PowerAgreementType.SPOTPRICE) {
            for (int i = 0; i < usage.length; i++) {
                for (int j = 0; j < usage[i].length; j++) {
                    totalUsage += usage[i][j];
                    amount += usage[i][j] * prices[i][j];
                }
            }
        } else if (c.getAgreement() == PowerAgreementType.NORGESPRICE) {
            for (int i = 0; i < usage.length; i++) {
                for (int j = 0; j < usage[i].length; j++) {
                    totalUsage += usage[i][j];
                    amount += usage[i][j] * 0.50; // Norgespris er 0.50kr pr kWh
                }
            }

        } else if (c.getAgreement() == PowerAgreementType.POWERSUPPORT) {
            final double THRESHOLD = 0.9375;
            final double PERCENTAGE = 0.9;
            double support = 0;

            for (int i = 0; i < usage.length; i++) {
                for (int j = 0; j < usage[i].length; j++) {
                    totalUsage += usage[i][j];
                    double currentPrice = prices[i][j];
                    double effectivePrice;

                    if (currentPrice > THRESHOLD) {
                        // Staten dekker 90& av alt over THRESHOLD grensen
                        double stromstotte = (currentPrice - THRESHOLD) * PERCENTAGE;
                        effectivePrice = currentPrice - stromstotte;
                    } else {
                        effectivePrice = currentPrice;
                    }
                    amount += usage[i][j] * effectivePrice;
                }
            }

        }
    }

    public void printInvoice() {

        System.out.println(this.c + "\n" +
                "\nMonth: " + month +
                "\nUsage (kWh): " + totalUsage +
                "\nAmount: " + amount + " kr");

    }
}
