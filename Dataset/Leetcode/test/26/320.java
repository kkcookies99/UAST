 class Solution {
    public int XXX(int[] nums) {
        //res为最终数组长度
        int res = nums.length;
        //考虑小于等于1的情况
        if(nums.length<=1)
            return res;
        res=1;
        //i为当前元素，比较当前元素与最终数组中目前最后的元素是否相同
        for(int i = 1;i<nums.length;i++){
            //若不同
            if(nums[i]!=nums[res-1]){
                //将当前元素值赋值给最终数组中下一个元素
              nums[res]=nums[i];
                //将最终数组中长度加一
              res++;
            }
            //若相同，遍历下一个元素即可
        }
        return res;
    }
}

