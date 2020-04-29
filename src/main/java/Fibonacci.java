public class Fibonacci {

  public long calculate(int number) {
    if (number == 1 || number == 2) {
      return 1;
    }
    int previousTwoNumber = 1;
    int previousNumber = 1;
    int result = 1;
    for(int index = 3; index <= number; index ++) {
      result = previousTwoNumber + previousNumber;
      previousTwoNumber = previousNumber;
      previousNumber = result;
    }
    return result;
  }
}
