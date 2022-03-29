 class Solution {
    public int XXX(int[] nums) {
        if(nums.length == 1) return nums[0];
        int temp = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(temp < 0){
                temp = nums[i];
            }else{
                temp = temp + nums[i];
            }           
            if(temp > max){
                max = temp;
            }
        }
        return max;
    }
}

