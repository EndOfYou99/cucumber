package uni.pu.fmi.medicineview;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uni.pu.fmi.models.Food;
import uni.pu.fmi.services.FoodServiceImpl;

public class FoodStepDefinition {

	private FoodServiceImpl foodRepository = new FoodServiceImpl();

	@Given("хранилището е инициализирано")
	public void theRepositoryIsInitialized() {
		foodRepository = new FoodServiceImpl();
	}

	@When("добавям хранителен продукт с id {long}, име {string}, {double} калории, {double} протеин, {double} въглехидрати и {double} мазнини")
	public void iAddAFoodItem(Long id, String foodName, double calories, double protein, double carbohydrates,
			double fat) {
		Food food = new Food(id, foodName, calories, protein, carbohydrates, fat);
		foodRepository.add(food);
	}

	@Then("хранилището трябва да съдържа {int} хранителни продукта")
	public void theRepositoryShouldContainFoodItems(int count) {
		Set<Food> foods = foodRepository.findAll();
		Assertions.assertEquals(count, foods.size());
	}

	@When("търся хранителния продукт с id {long}")
	public void iSearchForTheFoodItemWithId(Long id) {
		Food food = foodRepository.find(id);
		testContext().setFood(food);
	}

	@Then("трябва да получа хранителен продукт с име {string}")
	public void iShouldGetAFoodItemWithName(String name) {
		Food food = testContext().getFood();
		Assertions.assertNotNull(food);
		Assertions.assertEquals(name, food.getFoodName());
	}

	@When("изтривам хранителния продукт с id {long}")
	public void iDeleteTheFoodItemWithId(Long id) {
		foodRepository.delete(id);
	}

	@When("получавам всички хранителни продукти")
	public void iGetAllFoodItems() {
		Set<Food> foods = foodRepository.findAll();
		testContext().setFoods(foods);
	}

	@Then("трябва да получа {int} хранителни продукта")
	public void iShouldGetFoodItems(int count) {
		Set<Food> foods = testContext().getFoods();
		Assertions.assertEquals(count, foods.size());
	}

	@Then("хранилището трябва да съдържа все още {int} хранителни продукта")
	public void хранилищетоТрябваДаСъдържаВсеОщеХранителниПродукта(int expectedSize) {
		assertEquals(expectedSize, testContext().getFoods().size());
	}

	public TestContext testContext() {
		return TestContext.getInstance();
	}
}
