package uni.pu.fmi.repo;

import java.util.Set;

import uni.pu.fmi.models.Food;

public interface FoodRepository {

	Set<Food> findAll();

	Food find(Long id);

	void add(Food food);

	void delete(Long id);

}