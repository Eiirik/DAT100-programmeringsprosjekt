package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave5.CustomerPowerUsageData;
import no.hvl.dat100.javel.oppgave5.Invoice;
import no.hvl.dat100.javel.oppgave5.InvoiceMain;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        // Oppgave 4a) Konstruktør
        Customers customersList = new Customers(5);

        // Lage ett Customer-objekter
        Customer c5 = new Customer("Eirik", "test@test.com", 1, PowerAgreementType.POWERSUPPORT);

        // Oppgave 4b) Telle antall kunder
        System.out.println("Det er " + customersList.countNonNull() + " kunder i tabellen.");

        // Oppgave 4d) Sette inn kunde
        System.out.println("Kunde ble lagt til: " + customersList.addCustomer(c5));

        System.out.println();
        // Oppgave 4c) Hente kunde
        System.out.println("Kundeinfo:\n" + customersList.getCustomer(1));

        System.out.println();
        // Oppgave 4e) Slette kunde
        System.out.println("Slettet kunde:\n" + customersList.removeCustomer(2));

        // Oppgave 4f) Kunde referansetabell
        Customer[] allCustomers = customersList.getCustomers();

        System.out.println();
        // Oppgave 5b) Beregne strømpris
        Invoice i1 = new Invoice(c5, "November", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);

        i1.computeAmount();
        i1.printInvoice();


    }
}
