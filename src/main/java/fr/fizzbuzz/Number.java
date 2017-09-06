package fr.fizzbuzz;

public class Number {
  private int value;

  public Number() {
  }

  public Number(int value) {
    this.value = value;
  }

  public boolean isMultipleOfThree(int numberToTest) {
    if (numberToTest != 0 && numberToTest%3 == 0)
      return true;
    return false;
  }

  public boolean isMultipleOfFive(int numberToTest) {
    if (numberToTest != 0 && numberToTest%5 == 0)
      return true;
    return false;
  }

  public boolean isMultipleOf(int multiplicityToTest) {
    return false;
  }
}
