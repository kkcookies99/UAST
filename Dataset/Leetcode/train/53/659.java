 class Solution {
    public int XXX(int[] nums) {
        int resultIndex = 0;
        int resultLen = 0;
        int maxValue = Integer.MIN_VALUE;
        for(int i = nums.length; i > 0; i--) {
            
            for(int j = 0, len= nums.length - i + 1; j < len; j++) {
                int value = 0;
                for(int k = 0, len1 = i; k < len1; k++) {
                    value+= nums[k + j];
                }
                if (value > maxValue) {
                    maxValue = value;
                }
            }
        }
        return maxValue;
    }
}

