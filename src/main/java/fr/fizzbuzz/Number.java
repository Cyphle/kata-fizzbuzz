package fr.fizzbuzz;

public class Number {
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
}
