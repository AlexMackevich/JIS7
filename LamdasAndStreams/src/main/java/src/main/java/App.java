import Model.Product;
import Service.ProductServiceImpl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

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

        productList. add(bread);
        productList. add(milk);
        productList. add(cheese);
        productList. add(eggs);
        productList. add(fish);
        productList. add(chicken);
        productList. add(pork);
        productList. add(beef);
        productList. add(vegetables);
        productList. add(fruits);
        productList. add(vine);
        productList. add(champagne);
        productList. add(beer);
        productList. add(cognac);

        var productService = new ProductServiceImpl();
        productService.findAveragePriceOfProduct(productList);
        productService.findAverageDiscountOnProduct(productList);
        System.out.println("__________");
        productService.findProductWithHighPriceAndLowDiscount(productList);
        System.out.println("__________");
        productService.findProductWithLowPriceAndHighDiscount(productList);
        System.out.println("__________");

        productList.stream()
                .sorted(Comparator.comparing(it -> it.getPriceOfProduct()))
                .sorted(Comparator.comparing(Product::getDiscountOnProduct))
                .forEach(System.out::println);
    }
}
