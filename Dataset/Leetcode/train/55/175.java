class Solution {
    public boolean XXX(int[] nums) {
        
        int distToNumsEnd = nums.length;
        int stepsLast = 0;

        for(int i = 0;i<nums.length;i++){
            distToNumsEnd = nums.length-1 - i;
            stepsLast = Math.max(nums[i], stepsLast);
            //未到达最后一个元素时，stepsLast已经为0
            if(stepsLast == 0 && i != nums.length-1)
                return false;
            
            stepsLast--;
        }

        return true;
    }
}

