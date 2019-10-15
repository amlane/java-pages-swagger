package com.lambdaschool.restaurants.repos;

import com.lambdaschool.restaurants.model.Restaurant;
import org.springframework.data.repository.PagingAndSortingRepository;

// CrudRepository - first choice
// PagingAndSortingRepository = CrudRepo + Paging&Sorting features
// JPA Respository
public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, Long>
{
    Restaurant findByName(String name);
}
