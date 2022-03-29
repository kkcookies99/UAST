class Solution {
    public boolean XXX(int[] nums) {
        int next=0;
        for(int i=0;i<nums.length;i++){
            if(next>=nums.length-1) return true;
            if(i==next) {
                if(nums[i]==0) return false;
                next=nums[i];
            }
            if(i+nums[i]>next) next=i+nums[i];
        }
        return true;
    }
}

