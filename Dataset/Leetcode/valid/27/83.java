 class Solution {
    public int XXX(int[] nums, int val) {
        int temp = 0;
        int end = nums.length;
        for(int i=0; i<end; i++){
            if(i==nums.length-1 && nums[i]==val) return nums.length-1;
            if(nums[i]==val && i<nums.length-1){
                temp++;
                nums[i--]=nums[end---1];
            }
        }
        return end;
    }
}

