package com.turkcell.ecommerceDemo.controllers;

import com.turkcell.ecommerceDemo.entities.Address;
import com.turkcell.ecommerceDemo.services.abstracts.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {
    private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public String create(@RequestBody Address address)
    {
        return addressService.create(address);
    }

    @GetMapping
    public List<Address> read()
    {
        return addressService.read();
    }

    @PutMapping
    public String update(@RequestBody Address address)
    {
        return addressService.update(address);
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable int id)
    {
        return addressService.delete(id);
    }
}
