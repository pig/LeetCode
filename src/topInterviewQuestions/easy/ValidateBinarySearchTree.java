package topInterviewQuestions.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidateBinarySearchTree {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  private List<Integer> list = new ArrayList<>();

  public boolean isValidBST(TreeNode root) {
    return validWithMaxMin(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }

  public boolean validWithMaxMin(TreeNode root, long minVal, long maxVal) {
    if (root == null) {
      return true;
    }
    
    if (root.val >= maxVal || root.val <= minVal) {
      return false;
    }
    
    return validWithMaxMin(root.left, minVal, root.val) && validWithMaxMin(root.right, root.val, maxVal);
  }

  @SuppressWarnings("unused")
  private boolean traversalAndValid(TreeNode node) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode previous = null;
    while (node != null || !stack.isEmpty()) {
      while (node != null) {
        stack.push(node);
        node = node.left;
      }

      node = stack.pop();

      if (previous != null && (node.val <= previous.val)) {
        return false;
      }

      previous = node;
      node = node.right;
    }

    return true;
  }

  @SuppressWarnings("unused")
  private boolean validBySortedArray(TreeNode node) {
    if (node == null) {
      return true;
    }

    traversal(node);

    boolean isValid = true;
    Integer previous = list.get(0);

    for (int i = 1; i < list.size(); i++) {
      Integer current = list.get(i);

      if (current > previous) {
        previous = current;
      } else {
        isValid = false;
        break;
      }
    }

    return isValid;
  }

  private void traversal(TreeNode node) {
    if (node != null) {
      traversal(node.left);
      list.add(node.val);
      traversal(node.right);
    }
  }
}
