 class Solution {
    public int XXX(int[] nums, int val) {
        int n=nums.length,index=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}

