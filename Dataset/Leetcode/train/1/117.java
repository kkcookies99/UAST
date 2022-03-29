 class Solution {
    public int[] XXX(int[] nums, int target) {
        int i;
        int j;
        for(i = 0; i < nums.length; i++){
            for(j = i+1; j < nums.length; j++){
                if((nums[i] + nums[j]) == target){
                    //return new int[]{i,j};
                    break;
                }
            }
        }
        //return new int[0];
        return new int[]{i,j};
    }
}

