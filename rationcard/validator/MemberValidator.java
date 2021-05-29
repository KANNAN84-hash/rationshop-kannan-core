package rationcard.validator;

public class MemberValidator {
	private MemberValidator() {
		super();
	}

	public static boolean isAlphabet(String name) {
		boolean isValid = false;

		if (name != null) {
			isValid = true;

			if (name.trim().equals("")) {
				isValid = false;
			}

			String exceptions = "!@#$%^&*()_+},=-`~{:1234567890?/><";

			for (int i = 0; i < name.trim().length(); i++) {
				char c = name.trim().charAt(i);
				for (int j = 0; j < exceptions.length(); j++) {
					char d = exceptions.charAt(j);
					if (c == d) {
						isValid = false;
					}
				}
			}

		}
		return isValid;

	}

	public static boolean isNumber(int num) {
		boolean isValid = false;
		if (num > 0 && num < 100) {
			isValid = true;
		}
		return isValid;

	}

	public static boolean isPhoneNum(long phNo) {
		boolean isValid = false;
		if (Long.toString(phNo).length() == 10) {
			isValid = true;
		}
		return isValid;
	}
}
