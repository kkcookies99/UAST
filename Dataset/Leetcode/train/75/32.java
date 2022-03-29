class Solution {
    public void XXX(int[] nums) {
        int p0=0,p1=0,p2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[p2++]=2;
                nums[p1++]=1;
                nums[p0++]=0;
            }else if(nums[i]==1){
                nums[p2++]=2;
                nums[p1++]=1;
            }else nums[p2++]=2;
        }
    }
}

