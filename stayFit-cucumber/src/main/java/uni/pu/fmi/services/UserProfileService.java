package uni.pu.fmi.services;

import uni.pu.fmi.models.Gender;
import uni.pu.fmi.models.UserProfile;

public interface UserProfileService {

	UserProfile find(Long id);

	void add(UserProfile userProfile);

	void update(Long id, String firstName, String lastName, Integer age, Gender gender, Double height, Double weight,
			Double bodyFat);

	void delete(Long id);
}
