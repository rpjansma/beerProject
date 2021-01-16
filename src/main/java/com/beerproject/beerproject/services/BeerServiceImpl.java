package com.beerproject.beerproject.services;

import com.beerproject.beerproject.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Brejolinha Glaxiosa")
                .beerType("Pale Ale")
                .build();
    }
}
