class Solution {
    public int XXX(int[] nums) {
          int pre = 0;
          int res = nums[0];
          for(int i=0;i<nums.length;i++){
              pre = Math.max(pre+nums[i],nums[i]);
              res =Math.max(res,pre);
          } 

          return res; 
    }
}

