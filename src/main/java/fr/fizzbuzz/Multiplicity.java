package fr.fizzbuzz;

public enum Multiplicity {
  THREE(new int[] {3}, "Fizz"),
  FIVE(new int[] {5}, "Buzz");

  public final int[] value;
  public final String word;

  Multiplicity(int[] value, String word) {
    this.value = value;
    this.word = word;
  }
}
