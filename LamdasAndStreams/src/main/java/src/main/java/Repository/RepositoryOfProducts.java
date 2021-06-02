package Repository;

import Model.Product;

import java.util.ArrayList;
import java.util.List;

public class RepositoryOfProducts {
    List<Product> listOfProducts = new ArrayList<>();

    Product bread = new Product("bread", 1.25, 35);
    Product milk = new Product("milk", 1.5, 0);
    Product cheese = new Product("cheese", 3.4, 7);
    Product eggs = new Product("eggs", 2.9, 0);
    Product fish = new Product("fish", 6.7, 5);
    Product chicken = new Product("chicken", 7.5, 5);
    Product pork = new Product("pork", 11.25, 25);
    Product beef = new Product("beef", 13.5, 15);
    Product vegetables = new Product("vegetables", 5.55, 10);
    Product fruits = new Product("fruits", 8.5, 20);
    Product vine = new Product("vine", 18.67, 30);
    Product champagne = new Product("champagne", 25, 35);
    Product beer = new Product("beer", 17, 17);
    Product cognac = new Product("cognac", 40, 15);

    public void addProductsToList(){
        listOfProducts.add(bread);
        listOfProducts.add(milk);
        listOfProducts.add(cheese);
        listOfProducts.add(eggs);
        listOfProducts.add(fish);
        listOfProducts.add(chicken);
        listOfProducts.add(pork);
        listOfProducts.add(beef);
        listOfProducts.add(vegetables);
        listOfProducts.add(fruits);
        listOfProducts.add(vine);
        listOfProducts.add(champagne);
        listOfProducts.add(beer);
        listOfProducts.add(cognac);
    }

}
