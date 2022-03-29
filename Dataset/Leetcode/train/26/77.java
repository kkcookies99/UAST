 class Solution {
    public int XXX(int[] nums) {
        // 校验长度为0或1的情况
        if(nums.length < 2){
            return nums.length;
        }

        int nextIndex = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i+1]){
               nums[nextIndex] = nums[i+1];
               nextIndex++;
            }
        }

        return nextIndex;
    }
}

