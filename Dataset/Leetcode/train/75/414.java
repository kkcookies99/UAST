 class Solution {
    public void XXX(int[] nums) {
        if(nums.length==0||nums.length==1) return;
        int first=0,last=nums.length-1;
        int i=0;
        while(i<=last){
            if(nums[i]==0){
                swap(nums,i,first++);
                if(first>i)
                    i=first;
            }
            else if(nums[i]==1) i++;
            else if(nums[i]==2){
                swap(nums,i,last--);
            }
        }
    }
    public void swap(int[] nums,int a,int b){
        int c=nums[a];
        nums[a]=nums[b];
        nums[b]=c;
    }
}

