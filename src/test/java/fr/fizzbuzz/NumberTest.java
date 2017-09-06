package fr.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberTest {
  private Number number;

  @Before
  public void setUp() throws Exception {
    number = new Number();
  }

  @Test
  public void should_return_false_if_0_given_is_not_a_multiple_of_three() throws Exception {
    assertThat(number.isMultipleOfThree(0)).isFalse();
  }

  @Test
  public void should_return_true_when_3_is_given_as_a_multiple_of_3() throws Exception {
    assertThat(number.isMultipleOfThree(3)).isTrue();
  }

  @Test
  public void should_return_true_when_a_multiple_of_3_other_than_3_is_given() throws Exception {
    assertThat(number.isMultipleOfThree(9)).isTrue();
  }

  @Test
  public void should_return_false_if_0_is_given_as_a_multiple_of_5() throws Exception {
    assertThat(number.isMultipleOfFive(0)).isFalse();
  }

  @Test
  public void should_return_true_when_5_is_given_as_a_multiple_of_5() throws Exception {
    assertThat(number.isMultipleOfFive(5)).isTrue();
  }

  @Test
  public void should_return_true_when_a_multiple_of_5_other_than_5_is_given() throws Exception {
    assertThat(number.isMultipleOfFive(20)).isTrue();
  }
}
