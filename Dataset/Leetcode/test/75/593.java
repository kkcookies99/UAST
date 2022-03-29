 class Solution {
    public void XXX(int[] nums) {
        if(nums == null || nums.length < 2)
            return ;
        int index0 = 0;
        int index2 = nums.length - 1;
        for(int i = 0 ; i <= index2 ; i ++)
        {
            if(nums[i] == 0)
                swap(nums,i,index0++);
            else if(nums[i] == 2)
                swap(nums,i--,index2--);
        }
    }        
    public void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}


