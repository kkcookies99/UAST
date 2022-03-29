 class Solution {
    public int XXX(int[] nums) {
        if(nums == null || nums.length == 0) return 0; 
        int point = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[point-1] != nums[i]) nums[point++] = nums[i];
        }
        return point;
    }
}

