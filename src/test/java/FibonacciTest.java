import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

  @Test
  void should_return_1_when_calculate_given_1() {
    Fibonacci fibonacci = new Fibonacci();
    long result = fibonacci.calculate(1);

    assertEquals(1, result);
  }
}