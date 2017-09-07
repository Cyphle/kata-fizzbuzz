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
    String word = Integer.toString(suitePosition);

    for (Multiplicity multiplicity : Multiplicity.values()) {
      Number suitePositionInNumber = new Number(suitePosition);
      if (suitePositionInNumber.isMultipleOf(multiplicity.value))
        word = multiplicity.word;
    }

    fizzBuzzSuite.add(word);
  }
}
