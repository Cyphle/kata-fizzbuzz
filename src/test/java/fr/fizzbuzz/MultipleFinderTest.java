package fr.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultipleFinderTest {

  private MultipleFinder multipleFinder;

  @Before
  public void setUp() throws Exception {
    multipleFinder = new MultipleFinder();
  }

  @Test
  public void should_return_false_if_0_given_is_not_a_multiple_of_three() throws Exception {
    assertThat(multipleFinder.isMultipleOfThree(0)).isFalse();
  }

  @Test
  public void should_return_true_when_3_is_given_as_a_multiple_of_3() throws Exception {
    assertThat(multipleFinder.isMultipleOfThree(3)).isTrue();
  }

  @Test
  public void should_return_true_when_a_multiple_of_3_other_than_3_is_given() throws Exception {
    assertThat(multipleFinder.isMultipleOfThree(9)).isTrue();
  }

  @Test
  public void should_return_false_if_0_is_given_as_a_multiple_of_5() throws Exception {
    assertThat(multipleFinder.isMultipleOfFive(0)).isFalse();
  }
}
