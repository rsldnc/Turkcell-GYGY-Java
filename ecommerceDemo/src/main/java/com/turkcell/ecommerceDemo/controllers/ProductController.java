package com.turkcell.ecommerceDemo.controllers;

import com.turkcell.ecommerceDemo.entities.Product;
import com.turkcell.ecommerceDemo.repositories.abstracts.ProductRepository;
import com.turkcell.ecommerceDemo.repositories.concretes.ProductRepositoryImpl;
import com.turkcell.ecommerceDemo.services.abstracts.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public String create(@RequestBody Product product)
    {
        return productService.create(product);
    }

    @GetMapping
    public List<Product> read()
    {
        return productService.read();
    }

    @PutMapping
    public String update(@RequestBody Product product)
    {
        return productService.update(product);
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable int id)
    {
        return productService.delete(id);
    }
}
