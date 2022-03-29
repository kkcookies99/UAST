 class Solution {
    public int XXX(int[] nums) {
        int i=0,j=0;
        while(j<nums.length){
            if(nums[i]!=nums[j]) nums[++i]=nums[j];
            j++;
        }
        return i+1;
    }
}

