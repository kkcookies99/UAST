 class Solution {
    public int XXX(int[] nums) {
      int count=0;
      for(int i = 0; i<nums.length; i++){
          if(nums[count]!=nums[i]){
              nums[count+1] = nums[i];
              count++;
          }
      }
        return count+1;
    }
}

