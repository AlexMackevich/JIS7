package Service;
import Model.Product;

import java.util.List;
public interface ProductService {
    double findAveragePriceOfProduct(List<Product> productList);
    double findAverageDiscountOnProduct(List<Product> productList);
}

