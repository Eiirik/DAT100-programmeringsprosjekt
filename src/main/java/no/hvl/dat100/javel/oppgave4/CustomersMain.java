package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        // Oppgave 4a) Konstruktør
        Customers cTab = new Customers(5);

        // Oppgave 4b) Telle antall kunder
        System.out.println(cTab.countNonNull());


    }
}
