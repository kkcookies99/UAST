class Solution {
    public void XXX(int[] nums) {
         int[] bucket = new int[3];
        for (int num : nums) {
            bucket[num]++;
        }
        for (int i = 0, j = 0; i < 3; i++) {
            while(bucket[i] > 0) {
                nums[j++] = i;
                bucket[i]--;
            }
        }

    }
}

