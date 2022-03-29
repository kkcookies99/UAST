 class Solution {
    public int XXX(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        int all = nums[0];
        int max = nums[0];
        int maxNum = nums[0];
        for (int i = 0 ; i< nums.length; i++ ){
            if (maxNum < nums[i]){
                maxNum = nums[i];
            }
            if (i == nums.length-1){
                if (maxNum <= 0){
                    return maxNum;
                }
            }
            if (i == 0){
                max = nums[0];
                maxNum = nums[0];
            }else {
                // 所有数 大于 当前数
                if ((max + nums[i]) > nums[i]){
                    // 所有数 大于 0
                    if ((max + nums[i]) > 0){
                        max = max + nums[i];
                    }else {
                        max = 0;
                    }
                }else {
                    max = nums[i];
                }
            }
            if (max > all) {
                all = max;
            }
        }
        return all;
    }
}

