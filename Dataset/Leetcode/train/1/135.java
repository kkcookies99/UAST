 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] b = new int[2];
        for (int i = 0;i<nums.length;i++){
                for(int j = nums.length - 1; j > i; j --){
                    if((nums[i]+nums[j]) == target){
                        b[0] = i;
                        b[1] = j;
                     return b;
                    }
            }
        }
         return b;
    }
   
}

