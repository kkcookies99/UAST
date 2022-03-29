 class Solution {
    public int XXX(int[] nums, int target) {
        if (nums != null && nums.length == 0){
            return 0;
        }
        int index = 0;
        for (int i=0; i<nums.length; i++) {
            if (target == nums[i]) {
                index = i;
            } else if(target >nums[i]) {
                index = i+1;
            }
        }
        return index;
    }
}

