 class Solution {
    public int XXX(int[] nums) {
        if(nums.length ==1) return nums[0];
        int start =0;
        int res =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            res += nums[i];      
            max = Math.max(res,max);        
            if(res<=0){
                start = i;
                res =0;
            }

        }
        return max;

    }
}

