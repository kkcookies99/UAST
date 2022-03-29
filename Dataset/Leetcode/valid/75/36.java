class Solution {
    public void XXX(int[] nums) {   
        int left = 0,right = nums.length-1,index = 0;
        while(index<=right){
            switch(nums[index]){
                case 0:
                    swap(nums,index,left);
                    left++;
                case 1:
                    index++;
                break;
                default:
                    swap(nums,index,right);
                    right--;
            }
        }
    }
    void swap(int[]nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

