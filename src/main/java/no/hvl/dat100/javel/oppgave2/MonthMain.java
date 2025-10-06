package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        // Oppgave 2a) Skrive ut månedlig strømforbruk
        MonthlyPower.print_PowerUsage(power_usage_month);

        System.out.println();
        // Oppgave 2b) Skrive ut månedlige strømpriser
        MonthlyPower.print_PowerPrices(power_prices_month);

        System.out.println();

        // Oppgave 2c) Total månedlig forbruk
        double mndForbruk = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.println("Totalt månedlig forbruk: " + String.format("%.2f", mndForbruk) + " kWh.");

        // Oppgave 2d) Forbruksgrense
        System.out.println(MonthlyPower.exceedThreshold(power_usage_month, 1000));

        // Oppgave 2e) Spotpris for måneden
        double spotprisMnd = MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month);
        System.out.println("Spotpris for måneden: " + String.format("%.2f", spotprisMnd) + " kr.");

        // Oppgave 2f) Strømstøtte for måneden
        double stromstotte = MonthlyPower.computePowerSupport(power_usage_month, power_prices_month);
        System.out.println("Strømstøtte for måneden: " + String.format("%.2f", stromstotte) + " kr.");

        // Oppgave 2g) Norgespris for måneden.
        double norgesprisMnd = MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.println("Norgespris for måneden: " + String.format("%.2f", norgesprisMnd) + " kr.");
    }
}