package service;

import entity.Customer;

import java.sql.SQLException;
import java.util.Collection;

public interface CustomerService {
    Customer create (String customerId, String companyName, String contactName, String contactTitle, String address,
                     String city, String region, String postalCode,
                     String country, String phone, String fax);

    Collection<Customer> findAll() throws SQLException, ClassNotFoundException;

    Customer findById (String customerId) throws SQLException, ClassNotFoundException;

    void update (Customer customer) throws SQLException, ClassNotFoundException;

    void deleteById(String customerId) throws SQLException, ClassNotFoundException;

    void deleteAll() throws SQLException, ClassNotFoundException;
}
