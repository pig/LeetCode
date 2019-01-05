package topInterviewQuestions.easy;

public class SingleNumber {
  // XXX # HINT: XOR
  // https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/

  public int singleNumber(int[] nums) {
    return singleNumber(nums, nums.length);
  }

  int singleNumber(int A[], int n) {
    int result = 0;
    for (int i = 0; i < n; i++) {
      System.out.println("r: " + result + ", t: " + A[i]);
      result ^= A[i];
    }
    return result;
  }
}
