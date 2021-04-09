package by.jrr.HomeWork.Lecture6ObjectsAndClasses.Product;

import java.util.Scanner;

public class ProductDemo {

    public static void main(String[] args) {

        Product product1 = new Product("Milk");
        product1.setRegularPrice(product1.regularPrice);
        product1.setDiscount(product1.discount);

        Product product2 = new Product("Bread");
        product2.setRegularPrice(product2.regularPrice);
        product2.setDiscount(product2.discount);

        Product product3 = new Product("Butter");
        product3.setRegularPrice(product3.regularPrice);
        product3.setDiscount(product3.discount);

        System.out.println("Product: " + product1 +
                ", regular price = "+ product1.regularPrice +
                " EUR, discount = "+ product1.discount +
                "%, actual price = " + product1.actualPrice()+" EUR");

        System.out.println("Product: " + product2 +
                ", regular price = "+ product2.regularPrice +
                " EUR, discount = "+ product2.discount +
                "%, actual price = " + product2.actualPrice()+" EUR");

        System.out.println("Product: " + product3 +
                ", regular price = "+ product3.regularPrice +
                " EUR, discount = "+ product3.discount +
                "%, actual price = " + product3.actualPrice()+" EUR");
    }
}
