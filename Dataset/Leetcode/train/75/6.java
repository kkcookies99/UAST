class Solution {
    public void XXX(int[] nums) {
        int[] count = new int[3];
        for (int num : nums) {
            count[num]++;
        }
        int index = 0;
        for (int i = 0; i != count[0]; ++i) {
            nums[index++] = 0;
        }
        for (int i = 0; i != count[1]; ++i) {
            nums[index++] = 1;
        }
        for (int i = 0; i != count[2]; ++i) {
            nums[index++] = 2;
        }
    }
}

