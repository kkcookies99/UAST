 class Solution {
    public int[] XXX(int[] nums, int target) {
    int [] n= new int[2];
        if(nums.length==1){
            n[0] = nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    n[0] = i;n[1] = j;
                    return n;
                }
            }

        }
        return n;


    }
}

