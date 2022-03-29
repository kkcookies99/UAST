class Solution {
    public void XXX(int[] nums) {
        int num0 = 0, num1 = 0, num2 = 0;
        for (int num : nums) {
            if(num == 0) num0++;
            else if(num == 1) num1++;
            else num2++;
        }
        for (int i = 0; i < nums.length; i++) {
            if(i < num0) nums[i] = 0;
            else if(i<num0+num1 && i >= num0) nums[i] = 1;
            else nums[i] = 2;
        }
    }
}

