package wednesday.brackets;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class ValidateBrackets {
	public static boolean isOpenBracket(char a) {
		return a == '(' || a == '{' || a == '[';
	}

	public static boolean isPairOfBrackets(char openBracket, char closingBracket) {
		return openBracket == '(' && closingBracket == ')'
				|| openBracket == '{' && closingBracket == '}'
				|| openBracket == '[' && closingBracket == ']';
	}

	public static boolean areStacksEmpty(Stack<Character> s1,
			Stack<Character> s2) {
		return s1.isEmpty() || s2.isEmpty();
	}

	public static boolean validateBrackets(String str) {
		Stack<Character> openBracketsStack = new Stack<>();
		Stack<Character> closingBracketsStack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char bracket = str.charAt(i);
			if (isOpenBracket(bracket)) {
				openBracketsStack.push(bracket);
			} else {
				closingBracketsStack.push(bracket);
				if (!areStacksEmpty(openBracketsStack, closingBracketsStack)
						&& !isPairOfBrackets(openBracketsStack.pop(),
								closingBracketsStack.pop())) {
					return false;
				}
			}
		}
		return openBracketsStack.isEmpty() && closingBracketsStack.isEmpty();
	}

	@Test
	public void testBrackets() {
		assertFalse(validateBrackets("()()())))((())("));
		assertTrue(validateBrackets("()()(((())))((()))()"));
		assertFalse(validateBrackets("())(()"));
		assertFalse(validateBrackets("())(())"));
		assertTrue(validateBrackets("(())(())"));
	}
}
