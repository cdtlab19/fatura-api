package com.example.faturaapi.controllers;

import com.example.faturaapi.dto.CreditCardDTO;
import com.example.faturaapi.services.CreditCardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/creditcard")
@Api(value="Credit Card", description="Credit card's Controller")
public class CreditCardController {

    @Autowired
    private CreditCardService service;

    @ApiOperation(value="Create a Credit card")
    @PostMapping(path="/")
    public ResponseEntity<?> create(@RequestBody CreditCardDTO objDto) {
        return ResponseEntity.ok().body(objDto);
    }
}
