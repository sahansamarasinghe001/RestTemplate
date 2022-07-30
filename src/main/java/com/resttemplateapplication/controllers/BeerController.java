package com.resttemplateapplication.controllers;

import com.resttemplateapplication.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/restTemplate")
public class BeerController {

    @Autowired
    private BeerService beerService;

    @GetMapping("getBeerById/{id}")
    public ResponseEntity<?> getBeerById(@PathVariable String id) {
        return ResponseEntity.ok(beerService.getBeerById(id));
    }

    @GetMapping("getAllBeers")
    public ResponseEntity<?> getAllBeers(){
        return ResponseEntity.ok(beerService.getAllBeers());
    }

    @GetMapping("getBeersByName/{name}")
    public ResponseEntity<?> getBeersByName(@PathVariable String name){
        return ResponseEntity.ok(beerService.getBeersByName(name));
    }
}
