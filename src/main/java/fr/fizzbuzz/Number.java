package fr.fizzbuzz;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

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
    if (value != 0 && value%multiplicityToTest == 0)
      return true;
    return false;
  }

  public boolean isMultipleOf(int... multiplicities) {
    return value!= 0 && IntStream.of(multiplicities)
            .allMatch(multiplicity -> value%multiplicity == 0);
  }
}
