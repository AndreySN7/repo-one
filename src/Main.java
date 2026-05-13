/**
 * @author Andrey_SN7
 * 13.05.2026
 */
public class Main {
	static void main() {
		String input = "J@va the be$t!123";

		System.out.println(reversalStringWithoutCharacters(input));
	}

	private static String reversalStringWithoutCharacters(String input) {
		StringBuilder result = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				result.append(c);
			}
		}
		result.reverse();
		for (int i = 0; i < input.length(); ++i) {
			if (!Character.isLetter(input.charAt(i))) {
				result.insert(i, input.charAt(i));
			}
		}
		return result.toString();
	}
}

