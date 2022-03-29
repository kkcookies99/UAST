class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length == 1)
            return true;
        return dp(nums, nums.length - 1);
    }
    public boolean dp(int[] nums, int n){
        if(nums[0] == 0)
            return false;
        boolean[] result = new boolean[nums.length];
        result[0] = true;//初始化
        for(int i = 1; i < nums.length; i++){
            int count = 1;
            for(int j = i - 1; j >= 0; j--)
                if(nums[j] - (count++) >= 0)
                    result[i] = (result[j]) ? true : false;
        }
        return result[n];
    }
}

