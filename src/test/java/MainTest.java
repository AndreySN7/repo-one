import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
	@Test
	public void emptyStringShouldReturnEmpty() {
		String input = "";

		String result = Main.reverseLetters(input);

		Assertions.assertEquals("", result);
	}
}
