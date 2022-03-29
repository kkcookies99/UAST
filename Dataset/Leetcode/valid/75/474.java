 class Solution {
    public void XXX(int[] nums) {
        int a = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                int tmp = nums[i];
                nums[i] = nums[a];
                nums[a++] = tmp;
            }
        }
        for(int i = a; i < nums.length; i++){
            if(nums[i] == 1){
                int tmp = nums[i];
                nums[i] = nums[a];
                nums[a++] = tmp;
            }
        }

    }
}

