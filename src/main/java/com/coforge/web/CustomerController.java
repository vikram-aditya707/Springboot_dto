package com.coforge.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.coforge.model.Customer;
import com.coforge.model.CustomerDTO;
import com.coforge.model.CustomerMapper;
import com.coforge.repository.CustomerRepository;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @Autowired
    private CustomerMapper mapper;

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody CustomerDTO dto) {

        return repository.save(mapper.dtoToEntity(dto));
    }

    @GetMapping("/customer")
    public List<CustomerDTO> showAllCustomers() {

        return repository.findAll()
                .stream()
                .map(mapper::entityToDto)
                .collect(Collectors.toList());
    }

}