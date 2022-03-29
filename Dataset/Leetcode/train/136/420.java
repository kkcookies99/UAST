 class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        if(nums[0] != nums[1]){
            return nums[0];
        }
        //总个数肯定为奇数，一次处理1对
        for(int i = 0;i<nums.length - 1;i++){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
            else{
                i++;
            }

        }
        return nums[nums.length - 1];

    }
}

