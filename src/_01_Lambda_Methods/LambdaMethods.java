package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed int String 10 times.
		printCustomMessage(s -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage(s -> {
			for (int i = s.length(); i > 0; i--) {
				System.out.println(s.substring(i - 1, i));
			}
		}, "hello");
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage(s -> {
			for (int i = 0; i < s.length(); i++) {
				String x = s.substring(i, i + 1);
				if (i % 2 == 0) {
					System.out.print(x.toUpperCase());
				} else {
					System.out.print(x);
				}
			}
		}, "Wazzzzzzzup");

		System.out.println("\n");

		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage(s -> {
			for (int i = 0; i < s.length(); i++) {
				System.out.print(s.substring(i, i + 1) + ".");
			}
		}, "Super");

		System.out.println("");

		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage(s -> {
			String letter = "";
			for (int i = 0; i < s.length(); i++) {
				letter = s.substring(i, i + 1);
				if (!letter.equals("a") && !letter.equals("e") && !letter.equals("i") && !letter.equals("o")
						&& !letter.equals("u")) {
					System.out.print(letter);
				}
			}
		}, "Halloween");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
