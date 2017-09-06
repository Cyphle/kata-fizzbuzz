package fr.fizzbuzz;

import java.util.stream.IntStream;

public class Number {
  private int value;

  public Number(int value) {
    this.value = value;
  }

  @Deprecated
  public boolean isMultipleOfThree(int numberToTest) {
    return new Number(numberToTest).isMultipleOf(3);
  }

  @Deprecated
  public boolean isMultipleOfFive(int numberToTest) {
    return new Number(numberToTest).isMultipleOf(5);
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
