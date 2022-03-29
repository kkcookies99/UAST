 class Solution {
    public int XXX(int[] nums, int val) {
        int slow=0;
        for(int fast=0;fast<nums.length;fast++){
            if(nums[fast]!=val){ //如果不等的话，就把它存储在下一个元素
                nums[slow++]=nums[fast];
            }
        }
        //你不需要考虑数组中超出新长度后面的元素->所以我这样也对
        return slow;
    }
}

