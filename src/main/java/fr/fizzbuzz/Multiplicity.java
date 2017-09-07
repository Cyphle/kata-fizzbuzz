package fr.fizzbuzz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Multiplicity {
  THREE(new int[] {3}, "Fizz"),
  FIVE(new int[] {5}, "Buzz"),
  THREE_FIVE(new int[] {3, 5}, "FizzBuzz");

  public final int[] value;
  private final String word;

  Multiplicity(int[] value, String word) {
    this.value = value;
    this.word = word;
  }

  public String getWord() {
    return this.word;
  }

  public static List<Multiplicity> getOrderedValues() {
    return Arrays.stream(values())
            .sorted((firstValue, secondValue) -> secondValue.value.length - firstValue.value.length)
            .collect(Collectors.toList());
  }
}
