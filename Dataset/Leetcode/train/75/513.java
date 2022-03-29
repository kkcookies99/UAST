 class Solution {
    public void XXX(int[] nums) {
        int len = nums.length;
        if(len == 0) return;
        int i0 = -1,i2 = len,i = 0;
        while(i<i2){
            if(nums[i] == 0){
                swap(nums,i,++i0);
                i = i0+1;
            }else if(nums[i] == 2){
                swap(nums,i,--i2);
            }else{
                 i++;
            }
        }
    }
    public void swap(int[] nums, int x, int y){
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}

