package Service;

import DBConfig.PostgreConnector;
import Model.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer create(String customerId, String companyName, String contactName, String contactTitle,
                           String address, String city, String region, String postalCode, String country, String phone, String fax) throws SQLException, ClassNotFoundException {
        var connection = PostgreConnector.getConnection();

        String sql = "INSERT INTO \"customers\" (customer_id, company_name, contact_name, contact_title, address, city, region, postal_code, country, phone, fax) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, customerId);
        statement.setString(2, companyName);
        statement.setString(3, contactName);
        statement.setString(4, contactTitle);
        statement.setString(5, address);
        statement.setString(6, city);
        statement.setString(7, region);
        statement.setString(8, postalCode);
        statement.setString(9, country);
        statement.setString(10, phone);
        statement.setString(11, fax);

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new customer was inserted successfully");
        }

        statement.close();
        connection.close();
        return new Customer(customerId, companyName, contactName, contactTitle, address, city, region, postalCode, country, phone, fax);
    }

    @Override
    public Collection<Customer> findAll() throws SQLException, ClassNotFoundException {
        var statement = PostgreConnector.getStatement();

        String sql = "SELECT *FROM \"customers\"";

        Collection<Customer> customersList = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            Customer customer = new Customer();
            customer.setCustomerId(resultSet.getString(1));
            customer.setCompanyName(resultSet.getString(2));
            customer.setContactName(resultSet.getString(3));
            customer.setContactTitle(resultSet.getString(4));
            customer.setAddress(resultSet.getString(5));
            customer.setCity(resultSet.getString(6));
            customer.setRegion(resultSet.getString(7));
            customer.setPostalCode(resultSet.getString(8));
            customer.setCountry(resultSet.getString(9));
            customer.setPhone(resultSet.getString(10));
            customer.setFax(resultSet.getString(11));
            customersList.add(customer);
        }
        customersList.forEach(System.out::println);

        resultSet.close();
        statement.close();
        statement.getConnection().close();
        return customersList;
    }

    @Override
    public Customer findById(String customerId) throws SQLException, ClassNotFoundException {
        var connection = PostgreConnector.getConnection();

        String sql = "SELECT *FROM \"customers\" WHERE customer_id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, customerId);

        ResultSet resultSet = statement.executeQuery();
        Customer customer = new Customer();

        while (resultSet.next()) {
            customer.setCustomerId(resultSet.getString(1));
            customer.setCompanyName(resultSet.getString(2));
            customer.setContactName(resultSet.getString(3));
            customer.setContactTitle(resultSet.getString(4));
            customer.setAddress(resultSet.getString(5));
            customer.setCity(resultSet.getString(6));
            customer.setRegion(resultSet.getString(7));
            customer.setPostalCode(resultSet.getString(8));
            customer.setCountry(resultSet.getString(9));
            customer.setPhone(resultSet.getString(10));
            customer.setFax(resultSet.getString(11));
        }
        statement.close();
        connection.close();

        return customer;
    }

    @Override
    public Customer findByLetters(String firstLetter, String lastLetter) throws SQLException, ClassNotFoundException {
        var connection = PostgreConnector.getConnection();

        String sql = "SELECT *FROM \"customers\" WHERE company_name LIKE ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, firstLetter + "%" + lastLetter);

        ResultSet resultSet = statement.executeQuery();

        Customer customer = new Customer();

        while (resultSet.next()) {
            customer.setCustomerId(resultSet.getString(1));
            customer.setCompanyName(resultSet.getString(2));
            customer.setContactName(resultSet.getString(3));
            customer.setContactTitle(resultSet.getString(4));
            customer.setAddress(resultSet.getString(5));
            customer.setCity(resultSet.getString(6));
            customer.setRegion(resultSet.getString(7));
            customer.setPostalCode(resultSet.getString(8));
            customer.setCountry(resultSet.getString(9));
            customer.setPhone(resultSet.getString(10));
            customer.setFax(resultSet.getString(11));
        }
        statement.close();
        statement.getConnection().close();

        return customer;
    }

    @Override
    public void update(Customer customer) throws SQLException, ClassNotFoundException {
        var connection = PostgreConnector.getConnection();

        String sql = "UPDATE \"customers\" SET customer_id = ?, company_name = ? , contact_name = ?, contact_title = ?, address = ?, city = ?, region = ?, postal_code = ?, country = ?, phone = ?, fax = ? WHERE customer_id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, customer.getCustomerId());
        statement.setString(2, customer.getCompanyName());
        statement.setString(3, customer.getContactName());
        statement.setString(4, customer.getContactTitle());
        statement.setString(5, customer.getAddress());
        statement.setString(6, customer.getCity());
        statement.setString(7, customer.getRegion());
        statement.setString(8, customer.getPostalCode());
        statement.setString(9, customer.getCountry());
        statement.setString(10, customer.getPhone());
        statement.setString(11, customer.getFax());
        statement.setString(12, customer.getCustomerId());

        int row = statement.executeUpdate();
        if (row > 0) {
            System.out.println("A customer was updated successfully");
        }
        statement.close();
        connection.close();
    }

    @Override
    public void deleteById(String customerId) throws SQLException, ClassNotFoundException {
        var connection = PostgreConnector.getConnection();

        String sql = "DELETE FROM \"customers\" WHERE customer_id = ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, customerId);
        System.out.println("A customer was deleted successfully");

        statement.executeUpdate();
        statement.close();
        connection.close();
    }

    @Override
    public void delete() throws SQLException, ClassNotFoundException {
        var connection = PostgreConnector.getConnection();

        String sql = "DELETE FROM \"customers\"";

        PreparedStatement statement = connection.prepareStatement(sql);
        System.out.println("All customers was deleted successfully");
        statement.executeUpdate();
        statement.close();
        connection.close();
    }
}