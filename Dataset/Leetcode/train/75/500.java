 class Solution {
    public void XXX(int[] nums) {
        int len = nums.length;
        int p=0,q=len-1;
        int i=0;
        while(i<=q){
            if(nums[i]==0)
                swap(nums,i++,p++);
            else if(nums[i]==2)
                swap(nums,i,q--);
            else
                i++;
        }
    }

    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

