 class Solution {
    public int XXX(int[] nums) {
        int point = 0;
        
        for(int i = 1; i < nums.length ;i++){
          if(nums[i]!=nums[point]){
              nums[++point] = nums[i];
          }
        }
        return point+1;
    }
}

