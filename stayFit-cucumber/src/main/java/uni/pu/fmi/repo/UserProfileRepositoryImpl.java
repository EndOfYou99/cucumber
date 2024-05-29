package uni.pu.fmi.repo;

import java.util.HashSet;
import java.util.Set;

import uni.pu.fmi.models.Gender;
import uni.pu.fmi.models.UserProfile;

public class UserProfileRepositoryImpl implements UserProfileRepository {

	Set<UserProfile> repository = new HashSet<>();

	public UserProfileRepositoryImpl() {
		UserProfile user1 = new UserProfile(1L, "John", "Doe", 30, Gender.MALE, 180, 75, 15);
		UserProfile user2 = new UserProfile(2L, "Jane", "Smith", 28, Gender.FEMALE, 165, 60, 20);
		UserProfile user3 = new UserProfile(3L, "Alex", "Johnson", 35, Gender.OTHER, 170, 70, 18);

		repository.add(user1);
		repository.add(user2);
		repository.add(user3);
	}

	@Override
	public UserProfile find(Long id) {
		for (UserProfile user : repository) {
			return user;
		}
		return null;
	}

	@Override
	public void add(UserProfile userProfile) {
		repository.add(userProfile);

	}

	@Override
	public void delete(Long id) {
		UserProfile userToDelete = find(id);
		repository.remove(userToDelete);

	}

	@Override
	public void update(Long id, String firstName, String lastName, Integer age, Gender gender, Double height,
			Double weight, Double bodyFat) {
		UserProfile updatedUser = find(id);
		if (firstName != null) {
			updatedUser.setFirstName(firstName);
		}
		if (lastName != null) {
			updatedUser.setLastName(lastName);
		}
		if (age != null) {
			updatedUser.setAge(age);
		}
		if (gender != null) {
			updatedUser.setGender(gender);
		}
		if (height != null) {
			updatedUser.setHeight(height);

		}
		if (weight != null) {
			updatedUser.setWeight(weight);
		}
		if (bodyFat != null) {
			updatedUser.setBodyFat(bodyFat);

		}

	}

	public Set<UserProfile> getRepository() {
		return repository;
	}

	public void setRepository(Set<UserProfile> repository) {
		this.repository = repository;
	}

}
