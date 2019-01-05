package topInterviewQuestions.medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new LinkedList<>();

    if (root == null) return result;

    Stack<TreeNode> stack = new Stack<>();
    stack.add(root);

    boolean direct = true; // 0: left first, 1: right first;
    while (stack != null && !stack.isEmpty()) {
      List<Integer> level = new LinkedList<>();
      int limit = stack.size();

      Stack<TreeNode> temp = new Stack<>();
      
      for (int i = 0; i < limit; i++) {
        TreeNode node = stack.pop();
        
        if(direct) {
          if (node.left != null) temp.push(node.left);
          if (node.right != null) temp.push(node.right);
        } else {
          if (node.right != null) temp.push(node.right);
          if (node.left != null) temp.push(node.left);
        }
        
        level.add(node.val);
      }

      direct = !direct;
      result.add(level);
      stack = temp;
    }

    return result;
  }
}
