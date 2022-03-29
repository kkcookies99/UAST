 class Solution {
    public int[] XXX(int[] nums, int target) {
        int i=0;
        int numsSize=nums.length;
        int[] a=new int[2];
    for(i=0;i<numsSize-1;i++){
        for(int j=i+1;j<numsSize;j++){
            if(nums[i]+nums[j]==target){
                a[0]=i;
                a[1]=j;
                return a;
            }
        }
    }
    return a;
    }
}

