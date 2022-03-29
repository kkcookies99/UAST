 class Solution {
    public int XXX(int[] nums, int val) {
        int k = 0;
        for(int i = 0 ; i< nums.length; i ++){
            //判断不为val就赋值
            if(nums[i] != val)nums[k++] = nums[i];
        }
        return k;
    }
}

