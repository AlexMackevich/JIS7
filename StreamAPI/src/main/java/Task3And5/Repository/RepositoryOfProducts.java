package Task3And5.Repository;

import Task3And5.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class RepositoryOfProducts {
    public static final List<Product> productList = new ArrayList<>();

    public static void initProductsToList() {
        productList.add(new Product("bread", 1.25, 35));
        productList.add(new Product("milk", 1.5, 0));
        productList.add(new Product("cheese", 3.4, 7));
        productList.add(new Product("eggs", 2.9, 0));
        productList.add(new Product("fish", 6.7, 5));
        productList.add(new Product("chicken", 7.5, 5));
        productList.add(new Product("pork", 11.25, 35));
        productList.add(new Product("beef", 13.5, 15));
        productList.add(new Product("vegetables", 5.55, 40));
        productList.add(new Product("fruits", 8.5, 20));
        productList.add(new Product("vine", 18.67, 70));
        productList.add(new Product("champagne", 25, 35));
        productList.add(new Product("beer", 17, 25));
        productList.add(new Product("cognac", 40, 15));
    }
}