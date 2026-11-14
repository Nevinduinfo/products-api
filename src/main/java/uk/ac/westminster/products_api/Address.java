package uk.ac.westminster.products_api;

public class Address {
    private String street; //instance variables
    private String city;
    private String postalcode;

    public Address() {}  //no-arg constructor
    public Address(String street, String city, String postalcode){ //Full constructor
        this.street = street;
        this.city = city;
        this.postalcode = postalcode;
    }

    //Getters
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getPostalcode() {
        return postalcode;
    }

}
