package com.turkcell.ecommerceDemo.services.concretes;

import com.turkcell.ecommerceDemo.entities.Address;
import com.turkcell.ecommerceDemo.repositories.abstracts.AddressRepository;
import com.turkcell.ecommerceDemo.services.abstracts.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public String create(Address address)
    {
        addressRepository.add(address);
        return address.getAddress() + " added";
    }

    @Override
    public List<Address> read()
    {
        return addressRepository.getAll();
    }

    @Override
    public String update(Address address)
    {
        for (Address a: addressRepository.getAll())
        {
            if (a.getId() == address.getId()){
                addressRepository.update(address);
                return address.getId() + " updated";
            }
        }
        return address.getId() + " not found";
    }

    @Override
    public String delete(int id)
    {
        for (Address a: addressRepository.getAll())
        {
            if (a.getId() == id){
                addressRepository.delete(a);
                return id + " deleted";
            }
        }
        return id + " not found";
    }
}
