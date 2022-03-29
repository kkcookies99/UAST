class Solution {
    public void XXX(int[] nums) {
        int left=-1,right=nums.length-1,i=0;
        while(left<right && i<=right){
            if(nums[i]==0){
                nums[i]=nums[left+1];
                nums[left+1]=0;
                left++;
                i=left+1;
            }else if(nums[i]==1){
                i++;
            }else{
                nums[i]=nums[right];
                nums[right]=2;
                right--;
            }
        }        
    }
}

