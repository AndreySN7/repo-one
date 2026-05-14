/**
 * @author Andrey_SN7
 * 13.05.2026
 */
public class Main {
	static void main() {
		String input = "J@va the be$t!123";

		System.out.println(reverseLetters(input));
	}

	private static String reverseLetters(String input) {
		if (input == null || input.isEmpty()) {
			return "";
		}

		int start = 0;
		int end = input.length() - 1;
		char[] result = input.toCharArray();
		while (start <= end) {
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
}

