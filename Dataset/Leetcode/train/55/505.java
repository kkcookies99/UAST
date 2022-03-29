 class Solution {
    public boolean XXX(int[] nums) {
if(nums.length == 1){
            return true;
        }

        //index + nums[index] >= nums.length - 1


        int dynamicIndex = 0;
        int dynamicValue = dynamicIndex + nums[dynamicIndex];
        int max = dynamicIndex + nums[dynamicIndex];
        int maxIndex = 0;

        for(int i = dynamicIndex; i <= dynamicValue; i++){
            int value = i + nums[i];
            if (value >= nums.length - 1) {
                //优化速度
                return true;
            }
            if (value > max) {
                max = value;
                maxIndex = i;
            }

            if(i == dynamicValue){
                dynamicIndex = maxIndex;
                dynamicValue = max;
            }
        }

        return false;
    }
}

