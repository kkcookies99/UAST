 class Solution {
    public void XXX(int[] nums) {
        //快速排序(分成三部分)
        int begin=0;
        int end=nums.length-1;
        int current=0;
        while(current<=end){
            if(nums[current]==0){
                swap(nums,current,begin);
                current++;
                begin++;
            }else if(nums[current]==2){
                swap(nums,current,end);
                end--;
            }else{
                current++;
            }
        }
        
        
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    
}

