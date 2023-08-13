package com.garantitech.gtbootcamp.controller;

import com.garantitech.gtbootcamp.entity.Customer;
import com.garantitech.gtbootcamp.service.entityService.CustomerEntityService;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/customers")             //path
public class CustomerController {

    private CustomerEntityService customerEntityService;

    public CustomerController(CustomerEntityService customerEntityService){
                                                                         //Costructor injection
        this.customerEntityService=customerEntityService;
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){            //give customer from table
        customer=customerEntityService.save(customer);

        return customer;
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        Customer customer=customerEntityService.findById(id);           //give customer by id number
        return customer;

    }
    @DeleteMapping("/{id}")
    public  void deleteCustomerById(@PathVariable Long id){               //delete
        System.out.println("Customer is deleted. id:"+id);

    }

    @GetMapping("/Value/{identityNo}")                                    //get customer object from identity no
    public Customer getCustomerByIdentityNo(@PathVariable Long identityNo){
       return customerEntityService.findById(identityNo);


    }






}


