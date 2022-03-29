class Solution {
    public void XXX(int[] nums) {
        //双指针
        int low = 0, high = nums.length - 1;
        int i = 0;
        while(i <= high){
            if(nums[i] == 0){
                int tmp = nums[i];
                nums[i] = nums[low];
                nums[low] = tmp;
                ++low; ++i;
            }else if(nums[i] == 1){
                ++i;
            }else if(i <= high && nums[i] == 2){
                int tmp = nums[i];
                nums[i] = nums[high];
                nums[high] = tmp;
                --high;
            }
        }
    }
}

