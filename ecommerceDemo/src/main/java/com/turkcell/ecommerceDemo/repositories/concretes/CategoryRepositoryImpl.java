package com.turkcell.ecommerceDemo.repositories.concretes;

import com.turkcell.ecommerceDemo.entities.Category;
import com.turkcell.ecommerceDemo.repositories.abstracts.CategoryRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {
    private List<Category> categoryList = new ArrayList<>();
    @Override
    public void add(Category category) {
        categoryList.add(category);
    }

    @Override
    public List<Category> getAll() {
        return categoryList;
    }

    @Override
    public void delete(Category category) {
        categoryList.remove(category);
    }

    @Override
    public void update(Category category) {
        for (Category c: categoryList)
        {
            if (c.getId() == category.getId()){
                c.setName(category.getName());
            }
        }
    }
}
