package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category, Integer>{
	
}
