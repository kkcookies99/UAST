 class Solution {
    public void XXX(int[] nums) {
        int str = 0;
        int end = nums.length - 1;
        for(int i = 0; i <= end; i ++){
            while(end >= 1 && nums[end] == 2){
                end --;
            } 
            if(nums[i] == 2){
                sweap(nums,i,end--);
                i --;
            }  else if(nums[i] == 0){
                sweap(nums,i,str++);
            }           
        }      
    }

    public void sweap(int[] nums,int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
    }
}

