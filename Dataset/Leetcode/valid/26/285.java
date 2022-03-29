 class Solution {
    public int XXX(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int p = nums[0];//不妨设数组是升序的，那么p就 标记 当前得到的不重复的最后一个数字
        int j = 0;  // j用来记录当前已经得到的最后一个不重复数字的下标 
        for(int i=1; i<nums.length; i++){ // i 用来遍历数组
            if(nums[i]!=p){ // 不重复，就移动，重复就什么也做，直接下一个
                j++;
                nums[j] = nums[i];
                p = nums[j];
            }
        }
        return j+1;
    }
}

