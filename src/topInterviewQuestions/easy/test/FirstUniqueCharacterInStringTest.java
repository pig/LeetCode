package topInterviewQuestions.easy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import topInterviewQuestions.easy.FirstUniqueCharacterInString;

class FirstUniqueCharacterInStringTest {

  @Test
  void test() {
    FirstUniqueCharacterInString question = new FirstUniqueCharacterInString();
    assertEquals(0, question.firstUniqChar("leetcode"));
//    assertEquals(2, question.firstUniqChar("loveleetcode"));
    assertEquals(-1, question.firstUniqChar("cc"));
  }

}
