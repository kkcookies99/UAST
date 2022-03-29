 class Solution {
    public int XXX(int[] nums) {
        int left=0,right=0;
        int len=nums.length;
        while(right<len){
            while(right<len&&nums[right]==nums[left]){
                right++;
            }
            if(right<len&&nums[right]!=nums[left]){
                nums[++left]=nums[right];
            }
        }
        return left+1;
    }
}

