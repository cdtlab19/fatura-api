package com.example.faturaapi.controllers;

import com.example.faturaapi.domain.CHolder;
import com.example.faturaapi.dto.CHolderDTO;
import com.example.faturaapi.dto.CHolderUpdateDTO;
import com.example.faturaapi.services.CHolderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/api/holder")
@Api(value="Card Holder", description="Card Holder's Controller")
public class CHolderController {

    @Autowired
    private CHolderService service;

    @ApiOperation(value="Create a card holder")
    @PostMapping(path="/")
    public ResponseEntity<?> create(@RequestBody CHolderDTO objDto) {
        return ResponseEntity.ok().body(objDto);
    }

    @ApiOperation(value="Update a card holder")
    @PutMapping(path="/{cpf}")
    public ResponseEntity<?> update(@PathVariable String cpf, @RequestBody CHolderUpdateDTO objDto) {
        return ResponseEntity.ok().body(objDto);
    }

    @ApiOperation(value="Delete a card holder")
    @DeleteMapping(path="/{cpf}")
    public ResponseEntity<?> delete(@PathVariable String cpf) {
        return ResponseEntity.ok().body(cpf);
    }

    @ApiOperation(value="Find a card holder")
    @GetMapping(path="/{cpf}")
    public ResponseEntity<?> find(@PathVariable String cpf) {
        return ResponseEntity.ok().body(cpf);
    }

    @ApiOperation(value="Find ALL card holder")
    @GetMapping(path="/")
    // public ResponseEntity<List<?>> findAll() {
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body("OI!");
    }
}
