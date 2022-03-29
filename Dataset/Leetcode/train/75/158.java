class Solution {
    public void XXX(int[] nums) {
        int p0 = 0;
        int p2 = nums.length - 1;
        for(int i = 0; i <= p2; i++){
            while(nums[i] == 2 && i <= p2){
                int temp = nums[i];
                nums[i] = nums[p2];
                nums[p2--] = temp;
            }
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[p0];
                nums[p0++] = temp;
            }
        }
    }
}

