 class Solution {
    public int XXX(int[] nums, int val) {
        int len=nums.length;
        int p=0;//慢指针
        for(int i=0;i<len;i++){
            //i变量可以看成一个快指针
            if(nums[i]!=val){
                nums[p]=nums[i];
                p++;
            }
        }
        return p;
    }
}

