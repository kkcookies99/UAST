 class Solution {
    public int XXX(int[] nums, int val) {
        int length = nums.length;
        int before = 0;
        int count = 0;
        int see = 0;
        for(int i = 0; i < length; i++){
            if(nums[i] == val){
                count++;
                for(int j = i+1; j < length; j++){
                    if(nums[j] != val){
                        nums[i] = nums[j];
                        nums[j] = val;
                        see += 1;
                        break;
                    }
                }
            }
        }
        return length-(count-see);
    }
}

