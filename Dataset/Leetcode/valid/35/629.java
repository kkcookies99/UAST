 class Solution {
    public int XXX(int[] nums, int target) {
        if (nums == null || nums.length == 0 || target <= nums[0]){
            return 0;
        }
        if (target >= nums[nums.length -1]){
            return target == nums[nums.length -1] ? nums.length - 1 : nums.length;
        }

        int retcode = -1;

        for (int i = 1; i < nums.length; i++) {
            if (target == nums[i] || (target >= nums[i -1] && target <= nums[i])){
                return i;
            }
        }
        return retcode;
    }
}

