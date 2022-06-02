package ua.foxminded.anagram;

import java.util.Scanner;

import ua.foxminded.anagram.reversers.Reverser;

public class AnagramApplication {

	public static void main(String[] args) {
		Reverser revers = new Reverser();
		Scanner scan = new Scanner(System.in);

		System.out.println(revers.reverse(scan.nextLine()));
		scan.close();
	}

}
