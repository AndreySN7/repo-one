/**
 * @author Andrey_SN7
 * 13.05.2026
 */
public class Main {
	static void main() {
		String input = "J@va the be$t!123";

		System.out.println(reversalStringWithoutCharacters(input));
		System.out.println(reversalStringWithoutCharactersBest(input));
	}

	private static String reversalStringWithoutCharactersBest(String input) {
		if (input == null || input.isEmpty()) {
			return "";
		}

		int start = 0;
		int end = input.length() - 1;
		char[] result = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if (start >= end) {
				break;
			}
			if (!Character.isLetter(input.charAt(start))) {
				start++;
				continue;
			}
			if (!Character.isLetter(input.charAt(end))) {
				end--;
				continue;
			}
			char temp = result[start];
			result[start++] = result[end];
			result[end--] = temp;
		}
		return new String(result);
	}

	private static String reversalStringWithoutCharacters(String input) {
		if (input == null || input.isEmpty()) {
			return "";
		}

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

