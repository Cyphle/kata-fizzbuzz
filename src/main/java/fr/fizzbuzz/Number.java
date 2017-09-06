package fr.fizzbuzz;

import java.util.stream.IntStream;

public class Number {
  private int value;

  public Number() {
  }

  public Number(int value) {
    this.value = value;
  }

  @Deprecated
  public boolean isMultipleOfThree(int numberToTest) {
    if (numberToTest != 0 && numberToTest%3 == 0)
      return true;
    return false;
  }

  @Deprecated
  public boolean isMultipleOfFive(int numberToTest) {
    if (numberToTest != 0 && numberToTest%5 == 0)
      return true;
    return false;
  }

  @Deprecated
  public boolean isMultipleOfMultiplicity(int multiplicityToTest) {
    return isMultipleOf(multiplicityToTest);
  }

  public boolean isMultipleOf(int... multiplicities) {
    return value!= 0 && IntStream.of(multiplicities)
            .allMatch(multiplicity -> value%multiplicity == 0);
  }
}
