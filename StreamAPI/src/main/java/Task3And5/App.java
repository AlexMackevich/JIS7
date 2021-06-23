package Task3And5;

import Task3And5.Service.ProductServiceImpl;

import static Task3And5.Repository.RepositoryOfProducts.productList;

public class App {
    public static void main(String[] args) {

        var productService = new ProductServiceImpl();
        System.out.println(productService.findProductsWithSpecialPriceAndDiscount(productList));
        System.out.println("____________________");

        System.out.println(productService.findProductHighPriceMinDiscount(productList));
        System.out.println("____________________");

        System.out.println(productService.findProductLowPriceHighDiscount(productList));
        System.out.println("____________________");

        productService.sortedProductListByDiscountAfterPrice(productList);
    }
}
