package com.beerproject.beerproject.services;

import com.beerproject.beerproject.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
}
