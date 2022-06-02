package ua.foxminded.anagram.reversers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverserTest {
	
	public static final Reverser revers = new Reverser();

	@Test
	void testNullException_ShouldThrowNullException_WhenArgumentIsNull() {
		assertThrows(IllegalArgumentException.class,() -> revers.reverse(null));
	}
	
	@Test
	void testEmptyString_ShouldReturnEmptyString_WhenArgumentIsEmptyString() {
		assertEquals("", revers.reverse(""));
	}

	
	@Test
	void testSingleSpace_ShouldReturnSingleSpace_WhenArgumentIsSingleSpace() {
		assertEquals(" ", revers.reverse(" "));
	}
	
	
	@Test
	void testSeveralSpaces_ShouldReturnSameString_WhenArgumentsAreSeveralSpaces() {
		assertEquals("   ", revers.reverse("   "));
	}
	
	
	
	@Test
	void testSingleCharacterInput_ShouldReturnSameCharacter_WhenArgumentIsOneCharacter() {
		assertEquals("a", revers.reverse("a"));
	}
	
	
	
	@Test
	void testMultipleSameLetterInput_ShouldReturnSameLetters_WhenArgumentsAreMultipleSameLetter() {
		assertEquals("aaaa", revers.reverse("aaaa"));
	}
	
	
	
	@Test
	void testSameCharacterInLowerandUpperCase_ShouldReturnReversedSameCharactersInLowerAndUpperCase_WhenArgumentsAreSameCharactersInLowerAndUpperCase() {
		assertEquals("aAAaaAA", revers.reverse("AAaaAAa"));
	}
	
	
	
	@Test
	void testWordWithDifferentLetters_ShouldReturnReversedWordWithDifferentLetters_WhenArgumentIsWordWithDifferentLetters() {
		assertEquals("dlroW", revers.reverse("World"));
	}

	
	
	@Test
	void testOnlySymbols_ShouldReturnSameString_WhenArgumentsAreOnlySymbols() {
		assertEquals("!&%#", revers.reverse("!&%#"));
	}
	
	
	
	@Test
	void testSeveralWords_ShouldReturnReversedWords_WhenArgumentsAreSeveralWords() {
		assertEquals("olleH dlroW!", revers.reverse("Hello World!"));
	}
}
