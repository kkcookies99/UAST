 class Solution {
    public int XXX(int[] nums) {
        int m = 0;
        if(nums.length == 0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[m++] = nums[i-1];
            }
        }
        nums[m] = nums[nums.length-1];
        return m+1;
    }
}

