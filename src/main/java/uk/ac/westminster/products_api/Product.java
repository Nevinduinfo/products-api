package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product(){

    }
    public Product(Long id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //Getters
    public Long getId(){
        return id;
    }
    //Setter
    public void setId(Long id){
        this.id = id;
    }
    //Getters
    public String getName(){
        return name;
    }
    //Setter
    public void setName(String name){
        this.name = name;
    }
    //Getter
    public double getPrice(){
        return price;
    }
    //Setter
    public void setPrice(double price){
        this.price = price;
    }
}
