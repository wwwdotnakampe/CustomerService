package com.razaractor.impl;

import com.razaractor.CustomerService;
import com.razaractor.entity.Customer;
import java.util.List;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author nakampe
 */
@WebService(targetNamespace = "api.razaractor.com")
//@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class CustomerSoapApi {

    @Inject
    private CustomerService customerService;

    @WebMethod
    public void addCustomer(@WebParam Customer customer) {
        customerService.addCustomer(customer);
    }

    @WebMethod
    public Customer getCustomer(@WebParam Long id) {
        return customerService.getCustomer(id);
    }

    @WebMethod
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @WebMethod
    public void removeCustomer(@WebParam Long id) {
        customerService.removeCustomer(id);
    }

    @WebMethod
    public void updateCustomer(@WebParam Customer customer) {
        customerService.updateCustomer(customer);
    }
}
