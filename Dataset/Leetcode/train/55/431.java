 class Solution {
    public boolean XXX(int[] nums) {
        //因为我们只需要前面一次的结果 所以不需要数组 只需要一个变量就可以解决这个问题
        int dp = 0;//保存当前i的情况下最远能到的地方
        for(int i = 0;i<nums.length-1;i++){
            dp = Math.max(dp,i+nums[i]);
            if(dp<=i){//如果不是最后一个位置 并且只能到当前位置 那么肯定到不了最后
                return false;
            }
            if(dp>=nums.length-1){//中间任意一步可以到末尾 就直接return true
                return true;
            }
        }
        return true;
    }
}

