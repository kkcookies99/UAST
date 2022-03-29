 class Solution {
    public int XXX(int[] nums) {
    int len = nums.length;
    int repeatNum = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i-1] == nums[i]){
        repeatNum++;
        len--;
      }else{
        nums[i-repeatNum] = nums[i];
      }
    }
    return len;
    }
}

