package uni.pu.fmi.services;

import uni.pu.fmi.models.Gender;
import uni.pu.fmi.models.UserProfile;
import uni.pu.fmi.repo.UserProfileRepository;
import uni.pu.fmi.repo.UserProfileRepositoryImpl;

public class UserProfileServiceImpl implements UserProfileService {

	UserProfileRepository userProfileRepository = new UserProfileRepositoryImpl();

	@Override
	public UserProfile find(Long id) {
		return userProfileRepository.find(id);
	}

	@Override
	public void add(UserProfile userProfile) {
		userProfileRepository.add(userProfile);
	}

	@Override
	public void update(Long id, String firstName, String lastName, Integer age, Gender gender, Double height,
			Double weight, Double bodyFat) {
		userProfileRepository.update(id, firstName, lastName, age, gender, height, weight, bodyFat);
	}

	@Override
	public void delete(Long id) {
		userProfileRepository.delete(id);
	}

}
