import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование Main")
public class MainTest {

	@DisplayName("Пустая строка возвращает пустую строку")
	@Test
	public void emptyStringShouldReturnEmpty() {
		String inputEmpty = "";

		String result = Main.reverseLetters(inputEmpty);

		Assertions.assertEquals("", result, "Должен вернуть пустую строку");
	}

	@DisplayName("null возвращает пустую строку")
	@Test
	public void nullStringShouldReturnEmpty() {
		String inputNull = null;

		String resultNull = Main.reverseLetters(inputNull);

		Assertions.assertEquals("", resultNull, "Должен вернуть пустую строку");
	}

	@DisplayName("Буквы в строке разворачиваются")
	@Test
	public void lettersShouldReturn() {
		String input = "te$t $tr1hg 123Q!";

		String result = Main.reverseLetters(input);

		Assertions.assertEquals("Qg$h $rt1te 123t!", result);
	}

	@DisplayName("Строка из одних символов не разворачивается")
	@Test
	public void onlyNonLettersDontShouldReverse() {
		String input = "@#$2345#$^%#";

		String result = Main.reverseLetters(input);

		Assertions.assertEquals(input, result);
	}

	@DisplayName("Одна буква возвращается без изменений")
	@Test
	public void oneLetterShouldReturnUnchanged(){
		String input = "a";

		String result = Main.reverseLetters(input);

		Assertions.assertEquals(input, result);
	}

	@DisplayName("Строка с символами перевода строки и табуляцией разворачивается корректно")
	@Test
	public void StringWithNewlineAndTabShouldReverse() {
		String input =  "sdfq\n sdfw\t ds-2!!!";

		String result = Main.reverseLetters(input);

		Assertions.assertEquals("sdwf\n dsqf\t ds-2!!!", result);
	}
}