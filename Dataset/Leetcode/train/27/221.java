 class Solution {
    public int XXX(int[] nums, int val) {
        int sign = 0;
        for (int i = 0;i < nums.length;i++){
            if (nums[i] != val){
                nums[sign++] = nums[i];
            }
        }
        return sign;
    }
}

