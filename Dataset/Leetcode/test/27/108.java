 class Solution {
    public int XXX(int[] nums, int val) {
        if(nums==null||nums.length==0) return 0;
        int length=nums.length;
        int last=nums.length-1;
        for(int i=0;i<length;){
            if(nums[i]==val){
                nums[i]=nums[last];
                last--;
                length--;
            }
            if(nums[i]!=val) i++; 
        }
        return length;
    }
}

