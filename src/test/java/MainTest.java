import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование Main")
public class MainTest {

	@DisplayName("Тестирование на возврат пустой строки, если строка пустая")
	@Test
	public void emptyStringShouldReturnEmpty() {
		String inputEmpty = "";

		String result = Main.reverseLetters(inputEmpty);

		Assertions.assertEquals("", result, "Должен вернуть пустую строку");
	}

	@DisplayName("Тестирование на возврат пустой строки, если строка null")
	@Test
	public void nullStringShouldReturnEmpty() {
		String inputNull = null;

		String resultNull = Main.reverseLetters(inputNull);

		Assertions.assertEquals("", resultNull, "Должен вернуть пустую строку");
	}

	@DisplayName("Проверяем, развернулась ли строка")
	@Test
	public void stringShouldReturn() {
		String input = "te$t $tr1hg 123Q!";

		String result = Main.reverseLetters(input);

		Assertions.assertEquals("Qg$h $rt1te 123t!", result);
	}
}