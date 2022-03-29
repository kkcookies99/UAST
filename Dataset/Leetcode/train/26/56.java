 class Solution {
    public int XXX(int[] nums) {
        int point = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > point && nums[i] != nums[point]) {
                point++;
                nums[point] = nums[i];
            }
        }
        return point+1;
    }
}

