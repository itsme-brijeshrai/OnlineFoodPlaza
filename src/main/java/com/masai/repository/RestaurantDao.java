package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.Restaurant;
@Repository
public interface RestaurantDao extends JpaRepository<Restaurant, Integer>{

}
