package com.igorcastelo.dreamshops.service.category;

import com.igorcastelo.dreamshops.model.Category;

import java.util.List;

public interface ICategoreService {
    Category getCategoryById(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category updateCategory(Category category, Long id);

    void deleteCategoryById(Long id);


}
