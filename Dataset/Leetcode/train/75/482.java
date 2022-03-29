 class Solution {
    public void XXX(int[] nums) {
           int left = -1;
           int right = nums.length;
           int index = 0;
           while(index < right){
                if(nums[index] < 1){
                    swap(nums, ++left, index++);
                }else if(nums[index] > 1){
                    swap(nums, --right, index);
                }else{
                    index++;
                }
           }
    }
    public void swap(int[] nums, int i, int j){
           int temp = nums[i];
           nums[i] = nums[j];
           nums[j] = temp;
    }
}

