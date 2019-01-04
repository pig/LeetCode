package topInterviewQuestions.easy;

public class ReverseLinkedList {
  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public ListNode reverseList(ListNode head) {
    ListNode newHead = null;
    
    while(head != null) {
      ListNode nodePtr = head;
      head = head.next;
      
      nodePtr.next = newHead;
      newHead = nodePtr;
    }
    
    return newHead;
  }
}
