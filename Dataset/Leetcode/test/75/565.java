 class Solution {
    public void XXX(int[] nums) {
        int left = 0, right = nums.length;
        int sum1 = 0;
        while(left!=right){
            if(nums[left] == 0){
                left++;
                continue;
            }
            if(nums[left] == 1){
                nums[left] = 0;
                sum1++;
                left++;
                continue;
            }
            if(nums[left] == 2){
                //如果是2 则与右指针的数字替换 右指针始终指向排好的2的最前一位
                int t = nums[left];
                nums[left] = nums[right-1];
                nums[right-1] = t;
                right--;
            }
        }
        while(sum1 != 0){
            nums[--right] = 1;
            sum1--;
        }
    }
}

