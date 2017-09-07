package fr.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzGeneratorTest {

  private FizzBuzzGenerator generator;

  @Before
  public void setUp() throws Exception {
    generator = new FizzBuzzGenerator();
  }

  @Test
  public void should_print_fizzbuzz_suite_from_1_to_2() throws Exception {
    assertThat(generator.generate(2)).isEqualTo("1 2");
  }

  @Test
  public void should_print_fizzbuzz_from_1_to_4() throws Exception {
    assertThat(generator.generate(4)).isEqualTo("1 2 Fizz 4");
  }

  @Test
  public void should_print_fizzbuzz_from_1_to_10() throws Exception {
    assertThat(generator.generate(10)).isEqualTo("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz");
  }

  @Test
  public void should_print_fizzbuzz_from_1_to_20() throws Exception {
    assertThat(generator.generate(20)).isEqualTo("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz");
  }
}
