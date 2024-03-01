package com.turkcell.ecommerceDemo.repositories.concretes;

import com.turkcell.ecommerceDemo.entities.Address;
import com.turkcell.ecommerceDemo.repositories.abstracts.AddressRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressRepositoryImpl implements AddressRepository {
    private List<Address> addressList = new ArrayList<>();
    @Override
    public void add(Address address) {
        addressList.add(address);
    }

    @Override
    public List<Address> getAll() {
        return addressList;
    }

    @Override
    public void delete(Address address) {
        addressList.remove(address);
    }

    @Override
    public void update(Address address) {
        for (Address a: addressList)
        {
            if (a.getId() == address.getId()){
               a.setUserId(address.getUserId());
               a.setAddress(address.getAddress());
            }
        }
    }
}
