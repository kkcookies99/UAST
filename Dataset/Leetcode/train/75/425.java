 class Solution {
    public void XXX(int[] nums) {
        if(nums==null || nums.length<=1)
            return ;
        int i=0;
        int j=0;
        int k=0;
        for(int idx=0;idx<nums.length;idx++){
            if(nums[idx]==2){
                nums[k++]=2;
            }else if(nums[idx]==1){
                nums[k++]=2;
                nums[j++]=1;
            }else{
                nums[k++]=2;
                nums[j++]=1;
                nums[i++]=0;
            }
        }
    }
}

