 class Solution {
    public int XXX(int[] nums, int val) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(val == nums[i]){
                // 防止重复替换
                nums[i] = val + 1;
                for(int j = i; j < nums.length - 1; j++){
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
                result++;
                i--;
            }

        }
        return nums.length - result;
    }
}

