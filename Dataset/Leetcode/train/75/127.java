class Solution {
    public void XXX(int[] nums) {
        if(nums==null|nums.length<=1){
            return;
        }
        int i=0,j=0,k=0;
        for(int m=0;m<nums.length;m++){
            int temp=nums[m];
            if(temp==0){
                nums[k++]=2;
                nums[j++]=1;
                nums[i++]=0;
            }else if(temp==1){
                nums[k++]=2;
                nums[j++]=1;
            }else{
                nums[k++]=2;
            }
        }
        
    }
}

