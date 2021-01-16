package com.beerproject.beerproject.services;

import com.beerproject.beerproject.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
