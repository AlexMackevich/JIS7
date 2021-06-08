package Service;
import Model.Product;

import java.util.List;
public interface ProductService {
    
    List<Product> findProductsWithSpecialPriceAndDiscount(List<Product> listOfProduct);

    Product findProductHighPriceMinDiscount(List<Product> productList);

    Product findProductLowPriceHighDiscount(List<Product> productList);
    
    void sortedProductListByDiscountAfterPrice(List<Product> productList);
}

