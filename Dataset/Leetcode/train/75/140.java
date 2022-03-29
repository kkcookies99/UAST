class Solution {
    public void XXX(int[] nums) {
      int len = nums.length;
      int count0=0;
      int count1=0;
      int count2=0;
      for(int i=0;i<len;i++){
        if(nums[i]==0){
          nums[count2] = 2;
          nums[count1] = 1;
          nums[count0] = 0;
          count0++;
          count1++;
          count2++;
          continue;
        }
        if(nums[i]==1){
          nums[count2] = 2;
          nums[count1] = 1;
          count1++;
          count2++;
          continue;
        }
        if(nums[i]==2){
          nums[count2] = 2;
          count2++;
          continue;
        }
      }
    }
}

