package com.turkcell.ecommerceDemo.services.concretes;

import com.turkcell.ecommerceDemo.entities.Product;
import com.turkcell.ecommerceDemo.repositories.abstracts.ProductRepository;
import com.turkcell.ecommerceDemo.services.abstracts.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public String create(Product product)
    {
        productRepository.add(product);
        return product.getName() + " added";
    }

    @Override
    public List<Product> read()
    {
        return productRepository.getAll();
    }

    @Override
    public String update(Product product)
    {
        for (Product p: productRepository.getAll())
        {
            if (p.getId() == product.getId()){
                productRepository.update(product);
                return product.getId() + " updated";
            }
        }
        return product.getId() + " not found";
    }

    @Override
    public String delete(int id)
    {
        for (Product p: productRepository.getAll())
        {
            if (p.getId() == id){
                productRepository.delete(p);
                return id + " deleted";
            }
        }
        return id + " not found";
    }
}
