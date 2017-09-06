package fr.fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberTest {
  @Test
  public void should_return_false_if_number_is_0_when_testing_if_multiple_of_3() throws Exception {
    Number zeroNumber = new Number(0);

    assertThat(zeroNumber.isMultipleOf(3)).isFalse();
  }

  @Test
  public void should_return_true_if_number_is_3_when_testing_if_multiple_of_3() throws Exception {
    Number numberThree = new Number(3);

    assertThat(numberThree.isMultipleOf(3)).isTrue();
  }

  @Test
  public void should_return_true_if_number_is_an_int_multiple_of_3_when_testing_if_multiple_of_3() throws Exception {
    Number anyNumber = new Number(9);
    Number anotherAnyNumber = new Number(12);

    assertThat(anyNumber.isMultipleOf(3)).isTrue();
    assertThat(anotherAnyNumber.isMultipleOf(3)).isTrue();
  }

  @Test
  public void should_return_false_if_number_is_0_when_testing_if_multiple_of_5() throws Exception {
    Number zeroNumber = new Number(0);

    assertThat(zeroNumber.isMultipleOf(5)).isFalse();
  }

  @Test
  public void should_return_true_if_number_is_5_when_testing_if_multiple_of_5() throws Exception {
    Number numberFive = new Number(5);

    assertThat(numberFive.isMultipleOf(5)).isTrue();
  }

  @Test
  public void should_return_true_if_number_is_a_multiple_of_5_when_testing_if_multiple_of_5() throws Exception {
    Number anyNumber = new Number(20);
    Number anotherAnyNumber = new Number(25);

    assertThat(anyNumber.isMultipleOf(5)).isTrue();
    assertThat(anotherAnyNumber.isMultipleOf(5)).isTrue();
  }

  @Test
  public void should_return_true_when_number_is_multiple_of_3_and_5() throws Exception {
    Number multipleNumber = new Number(15);
    Number otherMultipleNumber = new Number(30);

    assertThat(multipleNumber.isMultipleOf(3, 5)).isTrue();
    assertThat(otherMultipleNumber.isMultipleOf(3, 5)).isTrue();
  }

  @Test
  public void should_return_false_when_a_number_is_tested_for_multiple_of_3_and_5_and_is_not() throws Exception {
    Number zeroNumber = new Number(0);
    Number numberTwo = new Number(2);
    Number numberEleven = new Number(11);

    assertThat(zeroNumber.isMultipleOf(3, 5)).isFalse();
    assertThat(numberTwo.isMultipleOf(3, 5)).isFalse();
    assertThat(numberEleven.isMultipleOf(3, 5)).isFalse();
  }
}
