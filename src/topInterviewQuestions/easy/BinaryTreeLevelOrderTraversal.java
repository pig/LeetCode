package topInterviewQuestions.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new LinkedList<>();
    
    if(root == null) return result;
    
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    
    while(queue != null && !queue.isEmpty()) {
      List<Integer> level = new LinkedList<>();
      int limit = queue.size();
      
      for(int i = 0; i < limit; i++) {
        TreeNode node = queue.poll();
        if(node.left != null) queue.offer(node.left);
        if(node.right != null) queue.offer(node.right);
        
        level.add(node.val);
      }
      
      result.add(level);
    }
    
    return result;
  }
}
