package ThirdTaskOfStreamFromArtemiy;

import ThirdTaskOfStreamFromArtemiy.Service.CalculationProductImpl;
import ThirdTaskOfStreamFromArtemiy.Service.CalculationProductService;
import ThirdTaskOfStreamFromArtemiy.model.Product;

import java.util.ArrayList;
import java.util.List;


import static ThirdTaskOfStreamFromArtemiy.Service.CalculationProductImpl.*;

public class App {

    public static void main(String[] args) {

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

        System.out.println("");
        CalculationProductService calculationProductService = new CalculationProductImpl();

        findProductWithPriceLessTenPointFiveAndDiscountMoreThanThirty(listOfProducts);

        System.out.println("");

        findProductWithLowPriceAndHighDiscount(listOfProducts, calculationProductService);

        System.out.println("");

        findProductWithHighPriceAndLowDiscount(listOfProducts, calculationProductService);

        System.out.println("");

        listOfProducts.parallelStream()
                .filter(it -> it.getPriceOfProduct() < 10.5)
                .filter(it -> it.getDiscountOnProduct() > 30)
                .sequential()
                .forEach(System.out::println);
    }
}
