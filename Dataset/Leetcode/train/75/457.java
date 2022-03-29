 class Solution {
    public void XXX(int[] nums) {
        int zeroNum = 0, oneNum = 0, twoNum=0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                zeroNum++;
            } else if (nums[i] == 1) {
                oneNum++;
            } else {
                twoNum++;
            }
        }
        for (int i = 0; i < zeroNum; i++) {
            nums[i] = 0;
        }
        for (int i = zeroNum; i < zeroNum + oneNum; i++) {
            nums[i] = 1;
        }
        for (int i = zeroNum + oneNum; i < zeroNum + oneNum + twoNum; i++) {
            nums[i] = 2;
        }
        
    }
}

