 class Solution {
    public boolean XXX(int[] nums) {
        int max = 0;
        for(int i = 0;i < nums.length - 1;i++){
            if(i <= max){
                max = Math.max(max,i + nums[i]);
            }
        }
        return max >= nums.length - 1;
    }
}

