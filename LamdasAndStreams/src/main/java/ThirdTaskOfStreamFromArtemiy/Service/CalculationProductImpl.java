package ThirdTaskOfStreamFromArtemiy.Service;

import ThirdTaskOfStreamFromArtemiy.model.Product;

import java.util.List;
import java.util.stream.Collectors;

public class CalculationProductImpl implements CalculationProductService{
    @Override
    public Double findAveragePriceOfProduct(List<Product> listOfProducts) {
        return listOfProducts.stream()
                .mapToDouble(it -> it.getPriceOfProduct())
                .average()
                .orElseThrow();
    }

    @Override
    public Double findAverageDiscountOnProduct(List<Product> listOfProduct) {
        return listOfProduct.stream()
                .mapToDouble(it -> it.getDiscountOnProduct())
                .average()
                .orElseThrow();
    }

    public static void findProductWithHighPriceAndLowDiscount(List<Product> listOfProducts, CalculationProductService calculationProductService) {
        var listOfProductWithHighPrice = listOfProducts.stream()
                .filter(it -> it.getPriceOfProduct() > calculationProductService.findAveragePriceOfProduct(listOfProducts))
                .collect(Collectors.toList());

        listOfProductWithHighPrice.stream()
                .filter(it -> it.getDiscountOnProduct() < calculationProductService.findAverageDiscountOnProduct(listOfProductWithHighPrice))
                .forEach(System.out::println);
    }

    public static void findProductWithPriceLessTenPointFiveAndDiscountMoreThanThirty(List<Product> listOfProducts) {
        var listOfProductLessThanTenPointFive = listOfProducts.stream()
                .filter(it -> it.getPriceOfProduct() < 10.5)
                .collect(Collectors.toList());

        listOfProductLessThanTenPointFive.stream()
                .filter(it -> it.getDiscountOnProduct() > 30)
                .forEach(System.out::println);
    }

    public static void findProductWithLowPriceAndHighDiscount(List<Product> listOfProducts, CalculationProductService calculationProductService) {
        var listOfProductWithLowPrice = listOfProducts.stream()
                .filter(it -> it.getPriceOfProduct() < calculationProductService.findAveragePriceOfProduct(listOfProducts))
                .collect(Collectors.toList());


        listOfProductWithLowPrice.stream()
                .filter(it -> it.getDiscountOnProduct() > calculationProductService.findAverageDiscountOnProduct(listOfProductWithLowPrice))
                .forEach(System.out::println);
    }

}
