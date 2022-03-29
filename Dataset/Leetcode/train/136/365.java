 class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
            //首先对数组排序
        Arrays.sort(nums);
        if(nums[0] != nums[1]){
           return nums[0]; 
        }
        for(int i = 1 ; i < nums.length ; i ++){
            if(i == nums.length-1){
                if(nums[i] != nums[i-1]){
                    return nums[i];
                }
            }else{
                    if(nums[i] != nums[i+1] && nums[i] != nums[i-1]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}

