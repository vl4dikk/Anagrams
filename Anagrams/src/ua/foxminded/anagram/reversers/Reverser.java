package ua.foxminded.anagram.reversers;

import java.util.StringJoiner;

public class Reverser {
	public String reverse(String input) {
		StringJoiner allWords = new StringJoiner(" ");
		String[] inputWords = input.split(" ");
		for (String s : inputWords) {
			allWords.add(reverseWord(s));
		}
		return allWords.toString();
	}

	private String reverseWord(String input) {
		String letters = input.replaceAll("[\\d\\W]", "");
		StringBuilder result = new StringBuilder(letters);
		result.reverse();
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isLetter(input.charAt(i))) {
				result.insert(i, input.charAt(i));
			}
		}
		return result.toString();
	}

}
