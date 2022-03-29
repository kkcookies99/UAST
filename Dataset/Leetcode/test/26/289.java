 class Solution {
  public int XXX(int[] nums) {
    int counter = 1;
    for (int i = 0; i < nums.length - 1; i ++) {
      if (nums[i] != nums[i + 1]) {
        nums[counter] = nums[i + 1];
        counter ++;
      }
    }
    return counter;
  }
}

