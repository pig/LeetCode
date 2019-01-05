package topInterviewQuestions.easy;

public class RotateArray {
  public void rotate(int[] nums, int k) {
    k = k % nums.length;
    int fromPtr = nums.length - k;
    int toPtr = 0;

    for (int i = 0; i < k; i++) {
      for (int j = toPtr; j < fromPtr; j++) {
        int temp = nums[j];
        nums[j] = nums[fromPtr];
        nums[fromPtr] = temp;
      }

      fromPtr++;
      toPtr++;
    }
  }
}
