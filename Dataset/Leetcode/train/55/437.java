 class Solution {
    public boolean XXX(int[] nums) {
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            if(i <= max){
                max = Math.max(max, i + nums[i]);
            }
        }

        if(max >= nums.length - 1){
            return true;
        }
        
        return false;
    }
}

