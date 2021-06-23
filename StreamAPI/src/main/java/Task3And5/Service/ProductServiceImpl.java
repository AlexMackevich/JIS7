package Task3And5.Service;

import Task3And5.Model.Product;
import Task3And5.Repository.RepositoryOfProducts;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {
    static {
        RepositoryOfProducts.initProductsToList();
    }

    @Override
    public List<Product> findProductsWithSpecialPriceAndDiscount(List<Product> listOfProduct) {
        return listOfProduct.stream()
                .filter(it -> it.getPriceOfProduct() < 10.5 & it.getDiscountOnProduct() > 30)
                .collect(Collectors.toList());
    }

    @Override
    public Product findProductHighPriceMinDiscount(List<Product> productList) {
        return productList.stream()
                .filter(it -> it.getDiscountOnProduct() == findMinDiscount(productList))
                .max(Comparator.comparing(Product::getPriceOfProduct))
                .orElseThrow(IllegalAccessError::new);
    }

    @Override
    public Product findProductLowPriceHighDiscount(List<Product> productList) {
        return productList.stream()
                .filter(it -> it.getDiscountOnProduct() == findMaxDiscount(productList))
                .min(Comparator.comparing(Product::getPriceOfProduct))
                .orElseThrow(IllegalAccessError::new);
    }

    @Override
    public void sortedProductListByDiscountAfterPrice(List<Product> productList) {
        productList.stream()
                .sorted(Comparator.comparing(Product::getDiscountOnProduct).thenComparing(Product::getPriceOfProduct))
                .forEach(System.out::println);
    }

    private double findMinDiscount(List<Product> productList) {
        return productList.stream()
                .mapToDouble(it -> it.getDiscountOnProduct())
                .reduce(0, Double::min);
    }

    private double findMaxDiscount(List<Product> productList) {
        return productList.stream()
                .mapToDouble(it -> it.getDiscountOnProduct())
                .reduce(0, Double::max);
    }
}
