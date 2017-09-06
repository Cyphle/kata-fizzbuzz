package fr.fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class FizzBuzzGenerator {
  private List<Number> numbers;

  public FizzBuzzGenerator() {
    numbers = new ArrayList<>();
  }

  public String generate(int suiteStart, int suiteEnd) {
    for (int i = suiteStart; i <= suiteEnd; ++i) {
      numbers.add(new Number(i));
    }

    StringJoiner fizzBuzzSuite = new StringJoiner(" ");

    numbers.forEach(number -> {
              for (Multiplicity multiplicity : Multiplicity.values()) {
                if (number.isMultipleOf(multiplicity.value))
                  fizzBuzzSuite.add(multiplicity.word);
                else
                  fizzBuzzSuite.add(Integer.toString(number.getValue()));
              }
            });

    return fizzBuzzSuite.toString();
  }
}
