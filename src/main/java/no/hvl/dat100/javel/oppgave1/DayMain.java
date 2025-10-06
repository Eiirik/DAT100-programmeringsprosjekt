package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        // Oppgave 1a)
        DailyPower.printPowerPrices(powerprices_day);

        System.out.println("\n");

        // Oppgave 1b)
        DailyPower.printPowerUsage(powerusage_day);

        // Oppgave 1c)
        System.out.println("\nTotal strømforbruk for en dag: " + DailyPower.computePowerUsage(powerusage_day) + "kWh.");

        System.out.println();

        // Oppgave 1d)
        double pris = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.println("Strømpris med spotpris for dagen: " + String.format("%.2f", pris) + " kr.");

        // Oppgave 1e)
        double stromstotteTime = DailyPower.getSupport(powerusage_day[8], powerprices_day[8]);
        System.out.println("Strømstøtte for gitt time: " + String.format("%.2f", stromstotteTime) + " kr.");

        // Oppgave 1f)
        double stromstotteDag = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        System.out.println("Strømstøtte for dagen er: " + String.format("%.2f", stromstotteDag) + " kr");

        // Oppgave 1g)
        System.out.println("Pris for støm denne dagen med fastpris på 50 øre per kWh: " + DailyPower.computeNorgesPrice(powerusage_day) + " kr.");

        // Oppgave 1h)
        System.out.println("Største strømforbruk på en time: " + DailyPower.findPeakUsage(powerusage_day) + " kWh.");

        // Oppgave 1i)
        double gjennomsnitt = DailyPower.findAvgPower(powerusage_day);
        System.out.println("Gjennomsnittslig strømforbruk per time: " + String.format("%.2f", gjennomsnitt));
    }
}
