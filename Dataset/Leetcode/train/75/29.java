class Solution {
    public void XXX(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            while(i<j&&nums[j]!=0)j--;
            while(i<j&&nums[i]!=2)i++;
            swap(nums,i,j);
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

