package Service;

import Model.Product;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {

    double averagePriceOfProducts;
    double averageDiscountOnProducts;

    @Override
    public double findAveragePriceOfProduct(List<Product> productList) {
        return averagePriceOfProducts = productList.stream()
                .mapToDouble(it -> it.getPriceOfProduct())
                .average()
                .orElseThrow();
    }
    @Override
    public double findAverageDiscountOnProduct(List<Product> productList) {
        return averageDiscountOnProducts = productList.stream()
                .mapToDouble(it -> it.getDiscountOnProduct())
                .average()
                .orElseThrow();
    }

    public void findProductWithHighPriceAndLowDiscount(List<Product> productList) {
        var listOfProductWithHighPrice = productList.stream()
                .filter(it -> it.getPriceOfProduct() > averagePriceOfProducts)
                .collect(Collectors.toList());

        listOfProductWithHighPrice.stream()
                .filter(it -> it.getDiscountOnProduct() < averageDiscountOnProducts)
                .forEach(System.out::println);
    }
    public void findProductWithLowPriceAndHighDiscount(List<Product> productList) {
        var listOfProductWithLowPrice = productList.stream()
                .filter(it -> it.getPriceOfProduct() < averagePriceOfProducts)
                .collect(Collectors.toList());

        listOfProductWithLowPrice.stream()
                .filter(it -> it.getDiscountOnProduct() > averageDiscountOnProducts)
                .forEach(System.out::println);
    }
}
