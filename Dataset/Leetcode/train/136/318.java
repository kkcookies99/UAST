 class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1) return nums[0];
        int cur=nums[0];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1]){
                 return nums[i];     
            }
        }
        return nums[0]==nums[1]?nums[nums.length-1]:nums[0];
    }
}

