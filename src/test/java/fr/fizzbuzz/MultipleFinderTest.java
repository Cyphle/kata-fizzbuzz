package fr.fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultipleFinderTest {
  @Test
  public void should_return_false_if_0_given_is_not_a_multiple_of_three() throws Exception {
    MultipleFinder multipleFinder = new MultipleFinder();
    assertThat(multipleFinder.isMultipleOfThree(0)).isFalse();
  }
}
