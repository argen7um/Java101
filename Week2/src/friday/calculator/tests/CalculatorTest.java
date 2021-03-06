package friday.calculator.tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import friday.calculator.parser.Calculator;
import friday.calculator.parser.PostfixConvertor;
import friday.calculator.parser.PostfixHelperMethods;
import friday.calculator.token.Token;

public class CalculatorTest {

	PostfixConvertor converter = new PostfixConvertor();

	@Test
	public void isMinusTest() {
		assertTrue(Token.detectMinusSign("-2-2", 0));
		assertFalse(Token.detectMinusSign("-2-2", 2));
		assertFalse(Token.detectMinusSign("1+2(2+2-3)", 7));
	}

	@Test
	public void appenderTest() {
		assertEquals("23.45", PostfixHelperMethods.appendNumbers("-123+23.45", 5));
		assertEquals("-123", PostfixHelperMethods.appendMinus("-123+2345", 0));
	}

	@Test
	public void computePostFixTest() {
		assertEquals(1252.3391071135875, new Calculator("(3*9.2^(4/2.5)*4!-3.7)/2").start(), 0);
		assertEquals(5829.0, new Calculator("3*9^(4/2)*4!-3").start(), 0);
		assertEquals(4.0, new Calculator("2+2").start(), 0);
		assertEquals(-4.0, new Calculator("-2-2").start(), 0);
		assertEquals(8.0, new Calculator("2+2*3").start(), 0);
		assertEquals(30.0, new Calculator("4!+2*3").start(), 0);
		assertEquals(42.0, new Calculator("4!+(2*3)^2/2").start(), 0);
		assertEquals(1.0, new Calculator("90/3/30").start(), 0);
		assertEquals(8.0, new Calculator("2*3+4/2").start(), 0);
		assertEquals(726.0, new Calculator("(2+2 *(3+2)!)*3").start(), 0);
		assertEquals(4.8, new Calculator("2.5 + 2.3").start(), 0);
		assertEquals(-2468.0, new Calculator("-123+ -2345").start(), 0);
		assertEquals(5.1, new Calculator("2.5+2.6").start(), 0);
		assertEquals(-146.45, new Calculator("-123+ -23.45").start(), 0);
		assertEquals(189.0, new Calculator("2^3! + 5*((3+2!)^2)").start(), 0);
		assertEquals(-167.9, new Calculator("(-123+ 2)-(23.45 *2)").start(), 0);
		assertEquals(-26.0, new Calculator("2 + (3 * 8) - (4 + (48 / (4 + 2)) * 6)").start(), 0);
	}

	@Test
	public void postfixTest() {
		//assertEquals("3 9 4 2 / ^ * 4 ! * 3 -", converter.toPostfix("3*9^(4/2)*4!-3"));
		assertEquals("-123 -2345 +", converter.toPostfix("-123+ -2345"));
		assertEquals("-123 -2 2 ! ^ + -2345 *", converter.toPostfix("(-123 + -2^2!) *-2345"));
		assertEquals("2 3 ! ^ 5 3 2 ! + 2 ^ * +", converter.toPostfix("2^3! + 5*((3+2!)^2)"));
		assertEquals("-123 -2 2 ! ^ + 9 + -2345 *", converter.toPostfix("(-123 + -2^2!+9) * -2345"));
		assertEquals("2 3 8 * + 4 48 4 2 + / 6 * + -", converter.toPostfix("2 + (3 * 8) - (4 + (48 / (4 + 2)) * 6)"));
	}
}
