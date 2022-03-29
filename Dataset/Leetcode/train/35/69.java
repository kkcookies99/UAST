 class Solution {
    public int XXX(int[] nums, int target) {
        int length = nums.length;
        int position = 0;
        for (int i = 0 ; i < length; i++ ){
            if (nums[i] != target && nums[i] <= target){
                position++;
            }
        }
        return position;
    }
}

