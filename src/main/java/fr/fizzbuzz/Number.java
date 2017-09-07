package fr.fizzbuzz;

import java.util.stream.IntStream;

class Number {
  private final int value;

  Number(int value) {
    this.value = value;
  }

  boolean isMultipleOf(int... multiplicities) {
    return value!= 0 && IntStream.of(multiplicities)
            .allMatch(multiplicity -> value%multiplicity == 0);
  }
}
