 class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            //记录出现次数
            int number = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    number++;
                }
            }
            if (number == 1){
                return nums[i];
            }
        }
        return 0;
    }
}

