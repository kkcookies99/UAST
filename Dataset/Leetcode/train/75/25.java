class Solution {
    public void XXX(int[] nums) {
        int n=nums.length;
        int l=0,index=0,r=n-1;
        while (index<=r){
            if(nums[index]==0){
                swap(nums,l,index);
                l++;
                index++;
            }else if(nums[index]==1){
                index++;
            }else {
                swap(nums,index,r);
                r--;
            }
        }
    }

    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

