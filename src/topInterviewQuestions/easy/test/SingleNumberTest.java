package topInterviewQuestions.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import topInterviewQuestions.easy.SingleNumber;

class SingleNumberTest {

  @Test
  void test() {
    SingleNumber question = new SingleNumber();
    assertEquals(1, question.singleNumber(new int[] {2, 2, 1, 3, 3}));
    assertEquals(4, question.singleNumber(new int[] {4, 1, 2, 1, 2}));
  }

}
