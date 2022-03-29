 class Solution {
    public int[] XXX(int[] nums, int target) {
        if (nums.length < 1){
            return null;
        }
        int total = nums.length;
        int[] returnData = new int[2];
        for (int i=0; i<total; i++){
            for (int j=i+1; j<total; j++){
                if ( (nums[i] + nums[j]) == target){
                    returnData[0] = i;
                    returnData[1] = j;
                }
            }
        }
        return returnData;
    }
}

