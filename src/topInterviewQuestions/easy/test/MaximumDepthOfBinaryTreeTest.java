package topInterviewQuestions.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import topInterviewQuestions.easy.MaximumDepthOfBinaryTree;
import topInterviewQuestions.easy.MaximumDepthOfBinaryTree.TreeNode;

class MaximumDepthOfBinaryTreeTest {

  /**
   * Given binary tree [3,9,20,null,null,15,7] return its depth = 3
   */
  @Test
  void test() {
    MaximumDepthOfBinaryTree question = new MaximumDepthOfBinaryTree();
    TreeNode root = question.buildTestTree();
    
    assertEquals(3, question.maxDepth(root));
  }

  

}
