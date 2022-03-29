 class Solution {
    public int XXX(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int left = 0;
        int right = 0;
        int res = Integer.MIN_VALUE;
        int val = 0;
        while(right < nums.length){
            val += nums[right];
            if(val > 0){
                res = Math.max(res,val);
            }else{
                res = Math.max(res,val);
                val = 0;
                left = right;
               
            }
            right++;
        }
        return res;
    }
}

