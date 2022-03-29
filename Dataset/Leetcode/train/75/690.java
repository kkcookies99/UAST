 class Solution {
    public void XXX(int[] nums) {
        int len=nums.length;
        if(len<2){
            return;
        }
        int start=0,end=len-1,i=0;
        while(i<=end ){
           if(nums[i]==0){
                int temp=nums[start];
                nums[start]=0;
                nums[i]=temp;
               i++;
               start++;
               
            }
           else if(nums[i]==2){
                int temp=nums[end];
                nums[end]=2;
                nums[i]=temp;
               end--;
            }
            else{
                i++;
            }
        }
        return;
        
    }
}

