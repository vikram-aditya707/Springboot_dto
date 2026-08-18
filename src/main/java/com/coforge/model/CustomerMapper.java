package com.coforge.model;

import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public CustomerDTO entityToDto(Customer customer) {

        CustomerDTO dto = new CustomerDTO();

        dto.setCustomerName(customer.getCustomerName());
        dto.setCustomerAge(customer.getCustomerAge());

        return dto;
    }

    public Customer dtoToEntity(CustomerDTO dto) {

        Customer customer = new Customer();

        customer.setCustomerName(dto.getCustomerName());
        customer.setCustomerAge(dto.getCustomerAge());

        return customer;
    }

}