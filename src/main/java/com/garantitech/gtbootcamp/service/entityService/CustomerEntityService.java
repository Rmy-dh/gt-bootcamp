package com.garantitech.gtbootcamp.service.entityService;

import com.garantitech.gtbootcamp.entity.Customer;
import com.garantitech.gtbootcamp.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CustomerEntityService {

    private CustomerRepository customerRepository;           //injection

    public CustomerEntityService (CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }

    public Customer save(Customer customer){
        customer=customerRepository.save(customer);
        return customer;
    }
    public Customer findById(Long id){
        Optional<Customer> customerOptional=customerRepository.findById(id);
        return  customerOptional.get();
    }


    /*public List<Customer> findByIdentity(Long identityNo){
        List<Customer> customerList=customerRepository.findByIdentity(identityNo);
        return customerList;    :(

    }
    */

}
