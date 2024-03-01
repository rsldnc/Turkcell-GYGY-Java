package com.turkcell.ecommerceDemo.controllers;

import com.turkcell.ecommerceDemo.entities.Category;
import com.turkcell.ecommerceDemo.repositories.abstracts.CategoryRepository;
import com.turkcell.ecommerceDemo.repositories.concretes.CategoryRepositoryImpl;
import com.turkcell.ecommerceDemo.services.abstracts.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public String create(@RequestBody Category category)
    {
        return categoryService.create(category);
    }

    @GetMapping
    public List<Category> read()
    {
        return categoryService.read();
    }

    @PutMapping
    public String update(@RequestBody Category category)
    {
        return categoryService.update(category);
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable int id)
    {
        return categoryService.delete(id);
    }
}
