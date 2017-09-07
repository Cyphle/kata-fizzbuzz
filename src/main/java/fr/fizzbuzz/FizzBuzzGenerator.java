package fr.fizzbuzz;

import java.util.StringJoiner;
import java.util.stream.IntStream;

class FizzBuzzGenerator {
  private StringJoiner fizzBuzzSuite;

  FizzBuzzGenerator() {
    fizzBuzzSuite = new StringJoiner(" ");
  }

  String generate(int suiteEnd) {
    IntStream
            .range(1, suiteEnd + 1)
            .forEach(this::getWordForPosition);

    return fizzBuzzSuite.toString();
  }

  private void getWordForPosition(int suitePosition) {
    fizzBuzzSuite.add(Multiplicity.getOrderedValues()
            .stream()
            .filter(multiplicity -> new Number(suitePosition).isMultipleOf(multiplicity.value))
            .map(Multiplicity::getWord)
            .findAny()
            .orElse(Integer.toString(suitePosition)));
  }
}
