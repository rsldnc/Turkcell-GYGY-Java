package com.turkcell.ecommerceDemo.repositories.abstracts;

import com.turkcell.ecommerceDemo.entities.Address;
import com.turkcell.ecommerceDemo.entities.Product;

import java.util.List;

public interface AddressRepository {
    void add(Address address);
    List<Address> getAll();
    public void delete(Address address);
    public void update(Address address);
}
