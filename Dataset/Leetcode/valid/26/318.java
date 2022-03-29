 class Solution {
    public int XXX(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int dif = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[dif] != nums[i]){
                dif++;
                nums[dif] = nums[i];
            }
        }
        return dif+1;
    }
}

