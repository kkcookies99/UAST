class Solution {
    public void XXX(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] sortedNums = new int[nums.length];
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;

        for(int i = 0; i < nums.length; i++) {
            if( nums[i] == 0 ) {
                redCount++;
            } else if(nums[i] == 1) {
                whiteCount++;
            } else {
                blueCount++;
            }
        }

        for(int i = 0; i < redCount; i++){
            nums[i] = 0;
        }
        for(int i = redCount; i < redCount + whiteCount; i++) {
            nums[i] = 1;
        }
        for(int i = redCount + whiteCount; i < nums.length; i++) {
            nums[i] = 2;
        }
      
    }
}
