package uni.pu.fmi.repo;

import java.util.HashSet;
import java.util.Set;

import uni.pu.fmi.models.Food;

public class FoodRepositoryImpl implements FoodRepository {

	Set<Food> repository = new HashSet<>();

	public FoodRepositoryImpl() {
		Food food1 = new Food(1L, "pizza", 10.0, 50.0, 12.5, 7.5);
		Food food2 = new Food(2L, "burger", 10.0, 50.0, 12.5, 7.5);
		Food food3 = new Food(3L, "taco", 10.0, 50.0, 12.5, 7.5);

		repository.add(food1);
		repository.add(food2);
		repository.add(food3);
	}

	@Override
	public Set<Food> findAll() {
		return repository;
	}

	@Override
	public Food find(Long id) {
		for (Food food : repository) {
			if (food.getId() == id) {
				return food;
			}
		}
		return null;
	}

	@Override
	public void add(Food food) {
		repository.add(food);

	}

	@Override
	public void delete(Long id) {
		Food deletedFood = find(id);
		repository.remove(deletedFood);

	}

	public Set<Food> getRepository() {
		return repository;
	}

	public void setRepository(Set<Food> repository) {
		this.repository = repository;
	}

}
