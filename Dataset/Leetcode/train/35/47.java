 class Solution {
    public int XXX(int[] nums, int target) {
        int len = nums.length, index = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] < target){
                index = i + 1;
            }else if(nums[i] == target){
                return i;
            }else{
                break;
            }
        }
        
        return index;
    }
}

