 class Solution {
    public int XXX(int[] nums, int val) {
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                n=n-1;
            }
        }
        return n;
    }
}

