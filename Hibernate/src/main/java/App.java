import service.CustomerServiceImpl;

import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        CustomerServiceImpl customerService = new CustomerServiceImpl();

        var abbElectro = customerService.create("ABB","ABB Group Electric", "Fedor Sulsjits","Supplier Assistant",
                "Nahimovsky prospect, 58", "Moscow", null, "478963", "Russia",
                "+7 495 777 0013", "+7 495 777 222 1");

        customerService.findAll();
        customerService.findById("AROUT");
        customerService.update(abbElectro);
        customerService.deleteById("ABB");
    }
}
