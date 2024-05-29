package uni.pu.fmi.services;

import java.util.Set;

import uni.pu.fmi.models.Food;

public interface FoodService {

	Set<Food> findAll();

	Food find(Long id);

	void add(Food food);

	void delete(Long id);
}