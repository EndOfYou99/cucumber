package uni.pu.fmi.models;

public class UserProfile {

	private Long id;

	private String firstName;

	private String lastName;

	private int age;

	private Gender gender;

	private double height;

	private double weight;

	private double bodyFat;

	public UserProfile() {
	}

	public UserProfile(Long id, String firstName, String lastName, int age, Gender gender, double height, double weight,
			double bodyFat) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.bodyFat = bodyFat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBodyFat() {
		return bodyFat;
	}

	public void setBodyFat(double bodyFat) {
		this.bodyFat = bodyFat;
	}

	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", height=" + height + ", weight=" + weight + ", bodyFat=" + bodyFat + "]";
	}

}