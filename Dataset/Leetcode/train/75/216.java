class Solution {
    public void XXX(int[] nums) {
        int p1 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count1++;
            } else if (nums[i] == 1) {
                count2++;
            } else if (nums[i] == 2) {
                count3++;
            }
        }
        for(int i = 0; i < count1; i++) {
            nums[i] = 0;
        }
        for(int i = count1; i < count1 + count2; i++) {
            nums[i] = 1;
        }
        for(int i = count1 + count2; i < count1 + count2 + count3; i++) {
            nums[i] = 2;
        }
    }
}

