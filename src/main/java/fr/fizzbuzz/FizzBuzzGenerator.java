package fr.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

class FizzBuzzGenerator {
  private final List<Number> numbers;

  FizzBuzzGenerator() {
    numbers = new ArrayList<>();
  }

  String generate(int suiteStart, int suiteEnd) {
    createNumbers(suiteStart, suiteEnd);

    StringJoiner fizzBuzzSuite = new StringJoiner(" ");

    numbers.forEach(number -> getWordToPrint(fizzBuzzSuite, number));

    return fizzBuzzSuite.toString();
  }

  private void createNumbers(int suiteStart, int suiteEnd) {
    for (int i = suiteStart; i <= suiteEnd; ++i) {
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
