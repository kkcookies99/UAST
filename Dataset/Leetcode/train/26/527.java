 class Solution {
    public int XXX(int[] nums) {
        int n=nums.length;
        if(n<2) return n;
        int pre=nums[0],index=1;
        for(int i=1;i<n;i++){
            if(nums[i]==pre) continue;
            else{
                nums[index++]=nums[i];
                pre=nums[i];
            }
        }
        return index;
    }
}

