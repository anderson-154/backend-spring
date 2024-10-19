package com.backend.crud_fullstack_angular.controller;

import com.backend.crud_fullstack_angular.entity.Customer;
import com.backend.crud_fullstack_angular.service.CustomerSeviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
    @Autowired
    private CustomerSeviceImpl customerSeviceImpl;

    @PostMapping("/create")
    public Customer save(@RequestBody Customer customer){
        return customerSeviceImpl.save(customer);
    }

    @GetMapping
    public List<Customer> findAll(){
        return  customerSeviceImpl.findAll();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable Integer id){
        return customerSeviceImpl.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        customerSeviceImpl.deleteById(id);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        Customer customerBD = customerSeviceImpl.findById(customer.getId());
        customerBD.setName(customer.getName());
        customerBD.setLastname(customer.getLastname());
        customerBD.setEmail(customer.getEmail());
        return customerSeviceImpl.update(customerBD);
    }
}
