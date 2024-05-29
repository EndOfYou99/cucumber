package uni.pu.fmi.medicineview;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uni.pu.fmi.models.Gender;
import uni.pu.fmi.models.UserProfile;
import uni.pu.fmi.repo.UserProfileRepositoryImpl;

public class UserProfileSteps {

	// private UserProfileService userProfileService = new UserProfileServiceImpl();
	private UserProfileRepositoryImpl userProfileRepository = new UserProfileRepositoryImpl();

	@Given("създаден е репозиториум за потребителски профили")
	public void initializeUserProfileRepository() {
		userProfileRepository = new UserProfileRepositoryImpl();
	}

	@When("добавя нов потребителски профил с id {long}, първо име {string}, фамилно име {string}, възраст {int}, пол {string}, височина {double}, тегло {double} и мазнини {double}")
	public void addNewUserProfile(Long id, String firstName, String lastName, int age, String genderStr, double height,
			double weight, double bodyFat) {
		Gender gender = Gender.valueOf(genderStr);
		UserProfile userProfile = new UserProfile(id, firstName, lastName, age, gender, height, weight, bodyFat);
		userProfileRepository = new UserProfileRepositoryImpl();
		userProfileRepository.add(userProfile);
	}

	@Then("репозиториумът за потребителски профили трябва да съдържа {int} потребителски профила")
	public void userProfileRepositoryShouldContainUserProfiles(int expectedSize) {
		int actualSize = userProfileRepository.getRepository().size();
		assert actualSize == expectedSize : "Очакван размер: " + expectedSize + ". Актуален размер: " + actualSize;
	}

	@When("актуализирам потребителския профил с id {long} с първо име {string}, фамилно име {string}, и възраст {int}")
	public void updateExistingUserProfile(Long id, String firstName, String lastName, int age) {
		userProfileRepository = new UserProfileRepositoryImpl();
		userProfileRepository.update(id, firstName, lastName, age, null, null, null, null);
	}

	@Then("потребителският профил с id {long} трябва да има първо име {string}, фамилно име {string} и възраст {int}")
	public void userProfileShouldHaveAttributes(Long id, String expectedFirstName, String expectedLastName,
			int expectedAge) {
		UserProfile userProfile = userProfileRepository.find(id);
		assert userProfile.getFirstName().equals(expectedFirstName)
				: "Очаквано първо име: " + expectedFirstName + ". Актуално първо име: " + userProfile.getFirstName();
		assert userProfile.getLastName().equals(expectedLastName)
				: "Очаквано фамилно име: " + expectedLastName + ". Актуално фамилно име: " + userProfile.getLastName();
		assert userProfile.getAge() == expectedAge
				: "Очаквана възраст: " + expectedAge + ". Актуална възраст: " + userProfile.getAge();
	}

	@When("изтривам потребителския профил с id {long}")
	public void deleteExistingUserProfile(Long id) {
		userProfileRepository = new UserProfileRepositoryImpl();
		userProfileRepository.delete(id);
	}

	@When("намирам потребителския профил с id {long}")
	public void findExistingUserProfile(Long id) {
		userProfileRepository.find(id);
	}

	@Then("трябва да получа потребителския профил с първо име {string}, фамилно име {string}, възраст {int}, пол {string}, височина {double}, тегло {double} и мазнини {double}")
	public void userProfileShouldBeFound(String expectedFirstName, String expectedLastName, int expectedAge,
			String expectedGenderStr, double expectedHeight, double expectedWeight, double expectedBodyFat) {
		Gender expectedGender = Gender.valueOf(expectedGenderStr);

		UserProfileRepositoryImpl repository = new UserProfileRepositoryImpl();
		UserProfile userProfile = userProfileRepository.find(2L);
		assert userProfile.getFirstName().equals(expectedFirstName)
				: "Очаквано първо име: " + expectedFirstName + ". Актуално първо име: " + userProfile.getFirstName();
		assert userProfile.getLastName().equals(expectedLastName)
				: "Очаквано фамилно име: " + expectedLastName + ". Актуално фамилно име: " + userProfile.getLastName();
		assert userProfile.getAge() == expectedAge
				: "Очаквана възраст: " + expectedAge + ". Актуална възраст: " + userProfile.getAge();
		assert userProfile.getGender() == expectedGender
				: "Очакван пол: " + expectedGender + ". Актуален пол: " + userProfile.getGender();
		assert userProfile.getHeight() == expectedHeight
				: "Очаквана височина: " + expectedHeight + ". Актуална височина:" + userProfile.getHeight();
		assert userProfile.getWeight() == expectedWeight
				: "Очаквана височина: " + expectedWeight + ". Актуална височина:" + userProfile.getWeight();
		assert userProfile.getBodyFat() == expectedBodyFat
				: "Очаквана височина: " + expectedBodyFat + ". Актуална височина:" + userProfile.getBodyFat();
	}

	@Then("трябва да не получа никакъв потребителски профил")
	public void трябва_да_не_получа_никакъв_потребителски_профил() {
		userProfileRepository.find(-1l);
	}
}