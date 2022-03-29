class Solution {
    public void XXX(int[] nums) {
        int[] count = new int[3];
        for (int num : nums) {
            count[num] += 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (count[0] > 0) {
                nums[i] = 0;
                count[0] -= 1;
            } else if (count[1] > 0) {
                nums[i] = 1;
                count[1] -= 1;
            } else if (count[2] > 0) {
                nums[i] = 2;
                count[2] -= 1;
            }
        }
    }
}

