package monday.makeitmoregeneric;

import wednesday.cryptoanalysis.util.Histogram;

public class Palindrome {

	public static boolean isPalindrome(String str) {
		for (int i = 0, a = str.length() - 1; i < str.length() / 2; i++, a--) {
			if (str.charAt(i) != str.charAt(a)) {
				return false;
			}
		}
		return true;
	}

	public static <T> boolean palindrome(T t) {
		return isPalindrome(t.toString() + "");

	}

	public static <T> void main(String[] args) {
		System.out.println(palindrome(new Histogram()));
	}
}
