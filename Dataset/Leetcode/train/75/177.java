class Solution {
    public void XXX(int[] nums) {
        int[] counts = new int[3];
        for (int num: nums) {
            ++counts[num];
        }
        int index = 0;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                nums[index++] = i;
                --counts[i];
            }
        }
    }
}

