package com.turkcell.ecommerceDemo.services.abstracts;

import com.turkcell.ecommerceDemo.entities.Address;

import java.util.List;

public interface AddressService {
    String create(Address address);
    List<Address> read();
    String update(Address address);
    String delete(int id);
}
