package ua.foxminded.anagram.reversers;

public class Reverser {
	public String reverse(String input) {
		StringBuilder allWords = new StringBuilder();
		String[] inputWords = input.split(" ");
		for (String s : inputWords) {
			allWords.append(reverseWord(s));
		}
		for (int i = 0; i < input.length(); i++) {
			if (Character.isWhitespace(input.charAt(i))) {
				allWords.insert(i, " ");
			}
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
