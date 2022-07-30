package com.resttemplateapplication;

import com.resttemplateapplication.models.Beer;
import com.resttemplateapplication.services.BeerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class ApplicationTests {

    @Autowired
    BeerService beerService;

    @Test
    void getBeerById() {
        Beer actualOutcome = beerService.getBeerById("1");
        Beer expectedOutcome = new Beer(1,"Buzz","A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.");
        assertEquals(actualOutcome,expectedOutcome);

    }
    @Test
    void getBeerByName() {
        List<Beer> actualOutcome =beerService.getBeersByName("Buzz");
        List<Beer> expectedOutcome = new ArrayList<>();
        Beer data = new Beer(1,"Buzz","A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.");
        expectedOutcome.add(data);
        assertEquals(actualOutcome,expectedOutcome);
    }

}
