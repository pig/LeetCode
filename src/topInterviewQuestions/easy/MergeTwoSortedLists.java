package topInterviewQuestions.easy;

public class MergeTwoSortedLists {
  // Input: 1->2->4, 1->3->4
  // Output: 1->1->2->3->4->4

  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode l2ptr = l2;
    while(l2ptr != null) {
      ListNode node = l2ptr;
      l2ptr = l2ptr.next;
      
      boolean connected = false;
      ListNode l1ptr = l1;
      
      while(l1ptr != null) {
        if(l1ptr.val == node.val) {
          node.next = l1ptr.next;
          l1ptr.next = node;
          connected = true;
          
          break;
        }
        
        l1ptr = l1ptr.next;
      }
      
      if(!connected) {
        l1ptr.next = node;
      }
    }
    
    return l1;
  }
  
  public ListNode createList(int nums[]) {
    ListNode head = null;
    
    if(nums != null && nums.length > 0) {
      ListNode ptr = null;
      
      for(int i = 0; i < nums.length; i++) {
        if(head == null) {
          head = new ListNode(nums[i]);
          ptr = head;
        } else {
          ptr.next = new ListNode(nums[i]);
          ptr = ptr.next;
        }
      }
    }
    
    return head;
  }
}
