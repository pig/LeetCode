package topInterviewQuestions.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import topInterviewQuestions.easy.MergeTwoSortedLists;
import topInterviewQuestions.easy.MergeTwoSortedLists.ListNode;

class MergeTwoSortedListsTest {

  @Test
  void test() {
    MergeTwoSortedLists question = new MergeTwoSortedLists();
    MergeTwoSortedLists.ListNode l1 = question.createList(new int[] {1, 2, 4});
    MergeTwoSortedLists.ListNode l2 = question.createList(new int[] {1, 3, 4});
    
    MergeTwoSortedLists.ListNode result = question.mergeTwoLists(l1, l2);
    
    assertEquals(1, compare(question.createList(new int[] {1, 1, 2, 3, 4, 4}), result));
  }

  private int compare(ListNode expected, ListNode result) {
    Integer flag = 0;
    
    
    return flag;
  }

}
