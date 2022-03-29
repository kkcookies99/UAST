class Solution {
    public void XXX(int[] nums) {
        int lo = 0, i = 0, hi = nums.length - 1;
        while(i <= hi){
            if(nums[i] == 0){
                swap(nums, lo++, i++);
            }else if(nums[i] == 2){
                swap(nums, i, hi--);
            }else{
                i++;
            }
        }
    }
    public void swap(int[] nums, int i, int j){
        int t   = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

