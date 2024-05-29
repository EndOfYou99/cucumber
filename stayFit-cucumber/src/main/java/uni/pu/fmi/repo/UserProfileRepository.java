package uni.pu.fmi.repo;

import uni.pu.fmi.models.Gender;
import uni.pu.fmi.models.UserProfile;

public interface UserProfileRepository {

	UserProfile find(Long id);

	void add(UserProfile userProfile);

	void update(Long id, String firstName, String lastName, Integer age, Gender gender, Double height, Double weight,
			Double bodyFat);

	void delete(Long id);

}
