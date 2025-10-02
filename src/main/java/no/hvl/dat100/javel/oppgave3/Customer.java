package no.hvl.dat100.javel.oppgave3;

public class Customer {

    // Oppgave 3a) Klassen Customer
    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;

    // Oppgave 3b) Konstruktør
    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;
    }
        // Oppgave 3c) GET-metoder & SET-metoder
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getCustomer_id(){
        return customer_id;
    }
    public PowerAgreementType getAgreement(){
        return agreement;
    }

    // SET-metoder

    public void setName(String nyName){
        name = nyName;
    }
    public void setEmail(String nyEmail){
        email = nyEmail;
    }
    public void setCustomer_id(int nyCustomer_id){
        customer_id = nyCustomer_id;
    }
    public void setAgreement(PowerAgreementType nyAgreement){
        agreement = nyAgreement;
    }
    // Oppgave 3d) toString metode
    public  String toString(){
        return "Customer number " + customer_id + "\nName " + name + "\nEmail " + email + "\nAgreement " + agreement;
    }


}
