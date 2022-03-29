 class Solution {
    public int XXX(int[] nums, int val) {
        int i=0,j=0;
        while(j<nums.length){
            while(nums[j]==val){
                if(j==nums.length-1){
                    return i;
                }
                j++;
            }
            nums[i]=nums[j];
            i++;
            j++;
        }
        return i;
    }
}

