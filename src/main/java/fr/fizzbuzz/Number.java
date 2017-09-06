package fr.fizzbuzz;

import java.util.stream.IntStream;

public class Number {
  private int value;

  public Number(int value) {
    this.value = value;
  }

  public boolean isMultipleOf(int... multiplicities) {
    return value!= 0 && IntStream.of(multiplicities)
            .allMatch(multiplicity -> value%multiplicity == 0);
  }
}
