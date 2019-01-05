package topInterviewQuestions.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import topInterviewQuestions.easy.ReverseString;

class ReverseStringTest {

  @Test
  void test() {
    ReverseString rs = new ReverseString();
    String ns = rs.reverseString("hello");
    assertEquals("olleh", ns);
  }

}
