package fr.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

class FizzBuzzGenerator {
  private final List<Number> numbers;
  private StringJoiner fizzBuzzSuite;

  FizzBuzzGenerator() {
    numbers = new ArrayList<>();
    fizzBuzzSuite = new StringJoiner(" ");
  }

  String generate(int suiteEnd) {
    createNumbers(suiteEnd);

    numbers.forEach(number -> getWordToPrint(fizzBuzzSuite, number));

    return fizzBuzzSuite.toString();
  }

  private void createNumbers(int suiteEnd) {
    for (int i = 1; i <= suiteEnd; ++i) {
      numbers.add(new Number(i));
    }
  }

  private void getWordToPrint(StringJoiner fizzBuzzSuite, Number number) {
    String word = Integer.toString(number.getValue());

    for (Multiplicity multiplicity : Multiplicity.values()) {
      if (number.isMultipleOf(multiplicity.value)) word = multiplicity.word;
    }

    fizzBuzzSuite.add(word);
  }
}
