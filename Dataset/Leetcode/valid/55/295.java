class Solution {
    public boolean XXX(int[] nums) {
        int maxMatch = 0;
        for(int i = 0; i < nums.length; i++){
            if(i <= maxMatch){
                int curMax = nums[i] + i;
                if(curMax > maxMatch){maxMatch = curMax;}
                if(maxMatch >= nums.length - 1){return true;}
            }
        }
        return false;
    }
}

