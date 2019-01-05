package topInterviewQuestions.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import topInterviewQuestions.easy.IntersectionOfTwoArraysII;

class IntersectionOfTwoArraysIITest {

  @Test
  void test() {
    IntersectionOfTwoArraysII question = new IntersectionOfTwoArraysII();
    int[] num11 = new int[] { 4, 9, 5 };
    int[] num12 = new int[] { 9, 4, 9, 8, 4 };
    assertEquals(true, numCompare(new int[] { 4, 9 }, question.intersect(num11, num12)));
    
    int[] num21 = new int[] { 2, 1 };
    int[] num22 = new int[] { 1, 1 };
    assertEquals(true, numCompare(new int[] { 4, 9 }, question.intersect(num21, num22)));
    
    int[] num31 = new int[] { 1 };
    int[] num32 = new int[] { 1 };
    assertEquals(true, numCompare(new int[] { 4, 9 }, question.intersect(num31, num32)));
    
  }

  private boolean numCompare(int[] is, int[] intersect) {
    if (is == null && intersect == null) {
      return true;
    } else if (is == null || intersect == null) {
      return false;
    } else {
      if (is.length != intersect.length) {
        return false;
      } else {
        boolean matched = true;

        for (int i = 0; i < is.length; i++) {
          if (is[i] != intersect[i]) {
            matched = false;
            break;
          }
        }

        return matched;
      }
    }
  }

}
