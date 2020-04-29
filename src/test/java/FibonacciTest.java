import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

  @ParameterizedTest
  @CsvSource({
      "1, 1",
      "1, 2",
      "2, 3",
      "3, 4",
      "5, 5"
  })
  void should_return_result_when_calculate_given_number(int result, int number) {
    Fibonacci fibonacci = new Fibonacci();

    assertEquals(result, fibonacci.calculate(number));
  }
}