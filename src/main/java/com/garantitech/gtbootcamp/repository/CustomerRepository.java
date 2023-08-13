package com.garantitech.gtbootcamp.repository;

import com.garantitech.gtbootcamp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;




public interface CustomerRepository extends JpaRepository<Customer,Long> {



    //@Query("select customer from Customer  customer where customer.ibanNo  =:ibanNo");
    // List<Customer> findByIbanNo(Long ibanNo);


}
