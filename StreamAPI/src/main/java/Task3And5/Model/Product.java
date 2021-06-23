package Task3And5.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String nameOfProduct;
    private double priceOfProduct;
    private double discountOnProduct;
}
