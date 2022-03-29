 class Solution {
    public int XXX(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        int x = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[x]){
            }else{
                nums[x+1]=nums[i];
                x=x+1;
            }
        }
        return x+1;
    }
}

