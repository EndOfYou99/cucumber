package uni.pu.fmi.models;

public class Food {

	private Long id;

	private String foodName;

	private double calories;

	private double protein;

	private double Carbohydrates;

	private double fat;

	public Food() {
	}

	public Long getId() {
		return id;
	}

	public Food(Long id, String foodName, double calories, double protein, double carbohydrates, double fat) {
		super();
		this.id = id;
		this.foodName = foodName;
		this.calories = calories;
		this.protein = protein;
		Carbohydrates = carbohydrates;
		this.fat = fat;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getCarbohydrates() {
		return Carbohydrates;
	}

	public void setCarbohydrates(double carbohydrates) {
		Carbohydrates = carbohydrates;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", foodName=" + foodName + ", calories=" + calories + ", protein=" + protein
				+ ", Carbohydrates=" + Carbohydrates + ", fat=" + fat + "]";
	}

}
