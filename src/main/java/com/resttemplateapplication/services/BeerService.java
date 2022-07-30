package com.resttemplateapplication.services;

import com.resttemplateapplication.models.Beer;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class BeerService {
    RestTemplate restTemplate = new RestTemplate();

    public Beer getBeerById(String id) {
        final String baseUrl = "https://api.punkapi.com/v2/beers/"+id;

        ResponseEntity<List<Beer>> response = restTemplate.exchange(
                baseUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Beer>>(){});

        return Objects.requireNonNull(response.getBody()).get(0);
    }

    public List<Beer> getAllBeers(){
        final String baseUrl = "https://api.punkapi.com/v2/beers";

        ResponseEntity<List<Beer>> response = restTemplate.exchange(
                baseUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Beer>>(){});

        return response.getBody();
    }

    public List<Beer> getBeersByName(String name){
        final String baseUrl = "https://api.punkapi.com/v2/beers?beer_name="+name;

        ResponseEntity<List<Beer>> response = restTemplate.exchange(
                baseUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Beer>>(){});

        return response.getBody();
    }
}
