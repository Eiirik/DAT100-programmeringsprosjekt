package no.hvl.dat100.javel.oppgave5;

public class Invoices {


    public static void processInvoices(Invoice[] invoices) {
        for (Invoice i : invoices) {
            System.out.println("========================");
            i.computeAmount();
            i.printInvoice();
            System.out.println("========================");
        }
    }
}
