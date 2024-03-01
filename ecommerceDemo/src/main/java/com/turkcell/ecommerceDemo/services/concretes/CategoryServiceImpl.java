package com.turkcell.ecommerceDemo.services.concretes;

import com.turkcell.ecommerceDemo.entities.Category;
import com.turkcell.ecommerceDemo.repositories.abstracts.CategoryRepository;
import com.turkcell.ecommerceDemo.services.abstracts.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public String create(Category category)
    {
        categoryRepository.add(category);
        return category.getName() + " added";
    }

    @Override
    public List<Category> read()
    {
        return categoryRepository.getAll();
    }

    @Override
    public String update(Category category)
    {
        for (Category c: categoryRepository.getAll())
        {
            if (c.getId() == category.getId()){
                categoryRepository.update(category);
                return category.getId() + " updated";
            }
        }
        return category.getId() + " not found";
    }

    @Override
    public String delete(int id)
    {
        for (Category c: categoryRepository.getAll())
        {
            if (c.getId() == id){
                categoryRepository.delete(c);
                return id + " deleted";
            }
        }
        return id + " not found";
    }
}
