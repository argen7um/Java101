package wednesday.cryptoanalysis.util;

public class InglishLettersStatistic {
	public static final char[] LETTERS = { 'e', 't', 'a', 'o', 'i', 'n', 's',
			'h', 'r', 'd', 'l', 'c', 'u', 'm', 'w', 'f', 'g', 'y', 'p', 'b',
			'v', 'k', 'j', 'x', 'q', 'z' };
	public static final char[] PAIRS = { 'o', 'i', 'e', 'o', 'i', 'n', 's',
		'h', 'r', 'd', 'l', 'c', 'u', 'm', 'w', 'f', 'g', 'y', 'p', 'b'};

	public static char map(char letter) {
		if (Character.isLowerCase(letter)) {
			switch (letter) {
			case 'a':
				return 'c';
			case 'b':
				return 'd';
			case 'c':
				return 'g';
			case 'd':
				return 'b';
			case 'e':
				return 'a';
			case 'f':
				return 'e';
			case 'g':
				return 'f';
			case 'h':
				return 'm';
			case 'i':
				return 'p';
			case 'j':
				return 'n';
			case 'k':
				return 'o';
			case 'l':
				return 'm';
			case 'm':
				return 'k';
			case 'n':
				return 'h';
			case 'o':
				return 'i';
			case 'p':
				return 'q';
			case 'q':
				return 's';
			case 'r':
				return 'w';
			case 's':
				return 'r';
			case 't':
				return 'j';
			case 'u':
				return 'u';
			case 'v':
				return 't';
			case 'w':
				return 'l';
			case 'x':
				return 'v';
			case 'y':
				return 'z';
			case 'z':
				return 'y';
			}
		}
		return letter;
	}
}
