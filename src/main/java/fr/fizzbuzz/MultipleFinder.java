package fr.fizzbuzz;

public class MultipleFinder {
  public boolean isMultipleOfThree(int numberToTest) {
    if (numberToTest != 0 && numberToTest%3 == 0)
      return true;
    return false;
  }

  public boolean isMultipleOfFive(int numberToTest) {
    if (numberToTest == 5)
      return true;
    return false;
  }
}
