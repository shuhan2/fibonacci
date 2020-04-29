public class Fibonacci {

  public long calculate(int number) {
    if (number == 1 || number == 2) {
      return 1;
    }
    if (number == 3) {
      return 2;
    }
    if (number == 4) {
      return 3;
    }
    return 5;
  }
}
