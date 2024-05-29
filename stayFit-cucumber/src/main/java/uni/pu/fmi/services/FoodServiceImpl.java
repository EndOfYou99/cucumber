package uni.pu.fmi.services;

import java.util.Set;

import uni.pu.fmi.models.Food;
import uni.pu.fmi.repo.FoodRepository;
import uni.pu.fmi.repo.FoodRepositoryImpl;

public class FoodServiceImpl implements FoodService {

	FoodRepository foodRepository = new FoodRepositoryImpl();

	@Override
	public Set<Food> findAll() {
		return foodRepository.findAll();
	}

	@Override
	public Food find(Long id) {
		return foodRepository.find(id);
	}

	@Override
	public void add(Food food) {
		foodRepository.add(food);

	}

	@Override
	public void delete(Long id) {
		foodRepository.delete(id);
	}

}
