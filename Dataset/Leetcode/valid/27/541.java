 class Solution {
    public int XXX(int[] nums, int val) {
        int flagIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;
            //从后往前找到可以替换的位置
            for (j = nums.length-1; j > i; j--) {
                if(nums[j] != val){
                    flagIndex = j;
                    break;
                }
            }
            if(i >= j){
                break;
            }
            //从前往后找到target值 ，进行替换
            if(nums[i] == val){
                nums[i] = nums[flagIndex];
                nums[flagIndex] = val;
            }
        }
        int count = 0;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            if(nums[i] == val){
                ++count;
            }
        }
        return nums.length - count;
    }
}

