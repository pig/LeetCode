package topInterviewQuestions.easy;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {
  public class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
      val = x;
    }
  }

  public int maxDepth(TreeNode root) {
    return maxDepthByDFS(root);
  }
  
  private int maxDepthByDFS(TreeNode node) {
    if (node == null) return 0;
    
    int left = maxDepthByDFS(node.left);
    int right = maxDepthByDFS(node.right);
    
    return (Math.max(left, right)) + 1;
  }
  
  @SuppressWarnings("unused")
  private int maxDepthByBFS(TreeNode root) {
    if (root == null) return 0;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    int level = 0;

    while (!queue.isEmpty()) {
      Queue<TreeNode> temp = new LinkedList<>();

      while (!queue.isEmpty()) {
        TreeNode node = queue.poll();
        if (node.left != null) temp.add(node.left);
        if (node.right != null) temp.add(node.right);
      }

      level++;
      queue = temp;
    }

    System.out.println("max depth: " + level);
    return level;
  }
  
  public TreeNode buildTestTree() {
    TreeNode root = new TreeNode(3);
    TreeNode node = root;

    node.left = new TreeNode(9);
    node.right = new TreeNode(20);

    node = node.right;
    node.left = new TreeNode(15);
    node.right = new TreeNode(7);
    
    return root;
  }
}
