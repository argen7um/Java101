package week5.wednesday.userinputchecker;

import java.util.regex.Pattern;

public class UserInputChecker {
	private interface Validator {
		public boolean validate(String input);
	}

	public class PersonNameValidator implements Validator {

		@Override
		public boolean validate(String input) {
			return input.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$");
		}

	}

	public class BulgarianPhoneNumberValidator implements Validator {

		@Override
		public boolean validate(String input) {
			return Pattern.compile("\\d{3}-\\d{7}").matcher(input).matches();
		}

	}

	public class PersonAgeValidator implements Validator {

		@Override
		public boolean validate(String input) {
			boolean flag = input.matches("^-?\\d+$");
			int age = -1;
			if (flag) {
				age = Integer.parseInt(input);
			}
			return age < 0 ? false : age > 150 ? false : true;
		}

	}

	public class IpVersion4Validator implements Validator {

		@Override
		public boolean validate(String input) {
			return input
					.matches("^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$");
		}

	}

	public class IpVersion6Validator implements Validator {

		@Override
		public boolean validate(String input) {
			return Pattern
					.compile(
							"^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$")
					.matcher(input).matches();
		}
	}

	public class MacAddressValidator implements Validator {

		@Override
		public boolean validate(String input) {
			return Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$")
					.matcher(input).matches();
		}

	}

	public static void main(String[] args) {
		System.out
				.println(new UserInputChecker().new BulgarianPhoneNumberValidator()
						.validate("359-8888888"));
	}
}
