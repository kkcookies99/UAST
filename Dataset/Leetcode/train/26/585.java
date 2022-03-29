 class Solution {
    public int XXX(int[] nums) {
        int pos = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[pos] < nums[j]){
                nums[++pos] = nums[j];
            }
        }
        return pos + 1;
    }
}

