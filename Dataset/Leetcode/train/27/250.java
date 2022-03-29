 class Solution {
    public int XXX(int[] nums, int val) {
        //结果用res表示
        int res=0;
        //循环遍历整个数组
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                //若值不等于val，将值移到对应位置
                nums[res]=nums[i];
                //目标数组长度加一
                res++;
            }
        }
        return res;
    }
}

