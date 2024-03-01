package com.turkcell.ecommerceDemo.repositories.concretes;

import com.turkcell.ecommerceDemo.entities.Product;
import com.turkcell.ecommerceDemo.repositories.abstracts.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private List<Product> productList = new ArrayList<>();
    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    public void delete(Product product)
    {
        productList.remove(product);
    }
    public void update(Product product)
    {
        for (Product p: productList)
        {
            if (p.getId() == product.getId()){
                p.setName(product.getName());
                p.setDescription(product.getDescription());
                p.setStock(product.getStock());
                p.setUnitPrice(product.getUnitPrice());
            }
        }
    }
}
