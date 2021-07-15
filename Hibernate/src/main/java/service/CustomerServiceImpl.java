package service;

import SessionFactoryConfig.Config;
import entity.Customer;

import java.sql.SQLException;
import java.util.Collection;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer create(String customerId, String companyName, String contactName, String contactTitle,
                           String address, String city, String region, String postalCode, String country, String phone, String fax) {
        var configure = new Config();
        var sessionFactory = configure.init();
        var session = sessionFactory.openSession();

        var transaction = session.beginTransaction();

        Customer customer = Customer.builder()
                .customerId(customerId)
                .companyName(companyName)
                .contactName(contactName)
                .contactTitle(contactTitle)
                .address(address)
                .city(city)
                .region(region)
                .postalCode(postalCode)
                .country(country)
                .phone(phone)
                .fax(fax)
                .build();

        session.save(customer);
        transaction.commit();
        session.close();
        System.out.println(customer);
        return customer;
    }

    @Override
    public Collection<Customer> findAll() throws SQLException, ClassNotFoundException {
        var configure = new Config();
        var sessionFactory = configure.init();
        var session = sessionFactory.openSession();

        var transaction = session.beginTransaction();

        Collection<Customer> customersList = session.createQuery("from Customer ").getResultList();
        customersList.forEach(System.out::println);

        transaction.commit();
        session.close();

        return customersList;
    }

    @Override
    public Customer findById(String customerId) throws SQLException, ClassNotFoundException {
        var configure = new Config();
        var sessionFactory = configure.init();
        var session = sessionFactory.openSession();

        var transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class, customerId);

        transaction.commit();
        session.close();
        System.out.println(customer);
        return customer;
    }

    @Override
    public void update(Customer customer) throws SQLException, ClassNotFoundException {
        var configure = new Config();
        var sessionFactory = configure.init();
        var session = sessionFactory.openSession();

        var transaction = session.beginTransaction();

        session.update(customer);

        transaction.commit();
        session.close();
        System.out.println("Customer was updated");
    }

    @Override
    public void deleteById(String customerId) throws SQLException, ClassNotFoundException {
        var configure = new Config();
        var sessionFactory = configure.init();
        var session = sessionFactory.openSession();

        var transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class, customerId);

        session.delete(customer);

        transaction.commit();
        session.close();
        System.out.println("Customer was deleted");
    }

    @Override
    public void deleteAll() throws SQLException, ClassNotFoundException {
        var configure = new Config();
        var sessionFactory = configure.init();
        var session = sessionFactory.openSession();

        var transaction = session.beginTransaction();

        session.createQuery("delete from Customer ").executeUpdate();

        transaction.commit();
        session.close();
        System.out.println("All Customers was deleted");
    }
}