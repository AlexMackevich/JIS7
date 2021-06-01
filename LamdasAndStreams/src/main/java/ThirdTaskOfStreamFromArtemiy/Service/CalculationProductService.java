package ThirdTaskOfStreamFromArtemiy.Service;

import ThirdTaskOfStreamFromArtemiy.model.Product;

import java.util.List;

public interface CalculationProductService {

    Double findAveragePriceOfProduct(List<Product> listOfProducts);
    Double findAverageDiscountOnProduct(List<Product> listOfProduct);

}
