 class Solution {
    public int[] XXX(int[] nums, int target) {
        int result[] =  new int[2]; 
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j< nums.length; j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    result[0] = i;
                    result[1] = j;                    
                }
            }
        }
        return result;
    }
}

