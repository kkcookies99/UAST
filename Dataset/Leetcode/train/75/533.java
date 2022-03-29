 class Solution {
    public void XXX(int[] nums) {
        int z = 0, t =nums.length -1;
        for (int i =0; i<=t;){
            if (nums[i] == 1) i++;
            else if(nums[i] == 0) swap(nums, z++, i++);
            else swap(nums, t--, i);
        }
    }
    public void swap(int[]nums,int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

