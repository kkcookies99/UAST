class Solution {
    public void XXX(int[] nums) {
        int num0 = 0, num1 = 0, num2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                nums[num2++] = 2;
                nums[num1++] = 1;
                nums[num0++] = 0;
            }else if(nums[i] == 1) {
                nums[num2++] = 2;
                nums[num1++] = 1;
            }else {
                nums[num2++] = 2;
            }
        }
    }
}

