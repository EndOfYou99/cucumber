package uni.pu.fmi.models;

public enum Gender {
	MALE, FEMALE, OTHER;

	@Override
	public String toString() {
		switch (this) {
		case MALE:
			return "Male";
		case FEMALE:
			return "Female";
		case OTHER:
			return "Other";
		default:
			return super.toString();
		}
	}
}