package com.Ecommerce.Web.repository;

import com.Ecommerce.Web.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Categoryrepository extends JpaRepository<Category, Integer> {

    Category findByCategoryName(String categoryName);
}
