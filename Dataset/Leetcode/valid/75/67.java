class Solution {
    public void XXX(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int p = 0;
        while(p<=right){
            if(nums[p]==0){
                nums[p] = nums[left];
                nums[left] = 0;
                left++;
            }
            if(nums[p]==2){
                nums[p] = nums[right];
                nums[right] = 2;
                //维持p在原地
                p--;
                right--;
            }
            p++;
        }
    }
}

