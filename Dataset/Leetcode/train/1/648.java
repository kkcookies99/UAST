 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0;i<nums.length;i++){
            int curNum = nums[i];
            int expt = target-curNum;
            for(int j = 1;j<nums.length;j++){
                int loopNum = nums[j];
                if(loopNum == expt && j!=i){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
   
}

