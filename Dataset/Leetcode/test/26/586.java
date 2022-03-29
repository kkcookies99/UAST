 class Solution {
    public int XXX(int[] nums) {
        int i=0,k=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i=k;
                nums[k++]=nums[j];
            }
        }
        return k;
    }
}

