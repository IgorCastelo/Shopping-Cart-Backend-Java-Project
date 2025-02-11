package com.igorcastelo.dreamshops.repository;

import com.igorcastelo.dreamshops.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);

    boolean existingByName(String name);
}
