 class Solution {
    public int XXX(int[] nums) {
        int maxSeq = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (temp > maxSeq) maxSeq = temp;
            for (int j = i+1; j < nums.length; j++) {
                temp += nums[j];
                if (temp > maxSeq) {
                    maxSeq = temp;
                }
            }
        }
        return maxSeq;

    }
}

