package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer c1 = new Customer("Eirik", "test@test.com", 1001, PowerAgreementType.NORGESPRICE);

        // Oppgave 3e) Test metodene i klassen.

        // Printer ut alle verdiene via GET-metoder.
        System.out.println(c1.getName());
        System.out.println(c1.getEmail());
        System.out.println(c1.getCustomer_id());
        System.out.println(c1.getAgreement());

        // Endrer alle verdiene via SET-metoder
        c1.setName("John Olsen");
        c1.setEmail("test123123@test123.com");
        c1.setCustomer_id(5020);
        c1.setAgreement(PowerAgreementType.SPOTPRICE);

        System.out.println();

        // Printer ut de nye verdiene med toString metoden.
        System.out.println(c1.toString());
    }
}
