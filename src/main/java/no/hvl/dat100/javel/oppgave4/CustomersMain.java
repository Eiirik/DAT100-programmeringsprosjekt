package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave5.CustomerPowerUsageData;
import no.hvl.dat100.javel.oppgave5.Invoice;
import no.hvl.dat100.javel.oppgave5.InvoiceMain;
import no.hvl.dat100.javel.oppgave5.Invoices;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        // Oppgave 4a) Konstruktør
        Customers customersList = new Customers(5);

        // Lage ett Customer-objekter
        Customer c1 = new Customer("Eirik", "test@test.com", 1, PowerAgreementType.POWERSUPPORT);
        Customer c2 = new Customer("Alfred", "gunnar@monkey.com", 2, PowerAgreementType.SPOTPRICE);
        Customer c3 = new Customer("Gunnar", "heymann@hotmail.com", 3, PowerAgreementType.NORGESPRICE);

        // Oppgave 4b) Telle antall kunder
        System.out.println("Det er " + customersList.countNonNull() + " kunder i tabellen.");

        // Oppgave 4d) Sette inn kunde
        System.out.println("Kunde ble lagt til: " + customersList.addCustomer(c1));

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
        Invoice[] invoiceTab = new Invoice[3];
        invoiceTab[0] = new Invoice(c1, "November", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        invoiceTab[1] = new Invoice(c2, "Desember", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        invoiceTab[2] = new Invoice(c3, "Januar", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);


        // Oppgave 5c) Generere faktura
        invoiceTab[0].computeAmount();
        invoiceTab[0].printInvoice();

        // Oppgave 5d) Flere fakturaer
        Invoices.processInvoices(invoiceTab);



    }
}
