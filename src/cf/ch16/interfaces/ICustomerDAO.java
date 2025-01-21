package cf.ch16.interfaces;

import cf.ch16.interfaces.model.Customer;

public interface ICustomerDAO {

    void addCustomer(Customer customer);

    void updateCustomer(Long id, Customer customer);

    boolean removeCustomer(Long id);

    Customer getCustomerById(Long id);

    Customer getCustomerByPhone(String phoneNumber);

    Customer[] getCustomerByRegion(String region);

    Customer getCustomerByVat(String vat);
}
