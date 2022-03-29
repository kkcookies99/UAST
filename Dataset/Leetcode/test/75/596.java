 class Solution {
    public void XXX(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int[] colors = {0, 0, 0};
        for (int i : nums) {
            colors[i] ++;
        }
        int index = 0;
        for(int i = 0; i < colors.length; i++) {
            while (colors[i] > 0) {
                nums[index++] = i;
                colors[i] --;
            }
        }
    }
}

