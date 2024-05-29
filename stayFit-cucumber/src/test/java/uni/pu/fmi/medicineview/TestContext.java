package uni.pu.fmi.medicineview;

import java.util.Set;

import uni.pu.fmi.models.Food;

public class TestContext {

	private static TestContext instance;
	private Food food;
	private Set<Food> foods;

	private TestContext() {
	}

	public static TestContext getInstance() {
		if (instance == null) {
			instance = new TestContext();
		}
		return instance;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Set<Food> getFoods() {
		return foods;
	}

	public void setFoods(Set<Food> foods) {
		this.foods = foods;
	}
}
