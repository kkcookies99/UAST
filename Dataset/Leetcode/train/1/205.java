 class Solution {
    public int[] XXX(int[] nums, int target) {
       
        Arrays.sort(nums);
         int left=0,right=nums.length-1;

        while(left<right){
            if(nums[left]+nums[right]<target) {
                left++;
            } 
            else if(nums[left]+nums[right]>target) {
                right--;
            }
            else {
             return new int[]{left,right};
            }
        }
    return new int[]{-1,-1};
    }
}```

