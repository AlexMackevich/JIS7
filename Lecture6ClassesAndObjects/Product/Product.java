package by.jrr.HomeWork.Lecture6ObjectsAndClasses.Product;

import java.util.Scanner;

public class Product {

Scanner scanner = new Scanner(System.in);

    String name;
    double regularPrice = scanner.nextDouble();
    double discount = scanner.nextDouble();

    public double  actualPrice(){
        double actualPrice = getRegularPrice() - (getRegularPrice() * getDiscount()/100);
        scanner.close();
        return actualPrice;
    }

    public void printInformation(){
        System.out.println(regularPrice);
    }


    //TODO Getter & Setter block

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
