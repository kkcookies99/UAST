class Solution {
public:
    //方法一：动态规划
    bool dynamicJump(vector<int> nums)
    {
        if(nums.size() == 1)
            return true;
        vector<int> dp(nums.size()); //dp[i]用来记录前i步最远能走多远
        dp[0] = nums[0];
        for(int i = 1; i < nums.size(); i++)
        {
            if(dp[i - 1] >= i) //这个判断条件很重要啊，如果前一步最远距离能到i才能走，否则后面能到的最远距离都是0
                dp[i] = max(dp[i - 1], i + nums[i]);
            if(dp[i] >= nums.size() - 1)
                return true;
        }
        return false;
    }

    //方法二：贪心
    bool greedyJump(vector<int> nums)
    {
        int curmaxdis = nums[0]; //当前位置能走到的最远距离
        int nextmaxdis = 0; //下一跳能走到的最远距离
        int i = 0;  //当前位置
        int nextstart = curmaxdis; //下一步要跳到的位置
        while(i < nums.size())
        {   
            //从当前位置到能跳到最远的位置区间内搜索下一跳的下一跳能跳到最远距离的位置
            for(int j = i; j <= curmaxdis; j++)
            {
                if(curmaxdis <= j + nums[j])
                {
                    nextmaxdis = max(nextmaxdis, j + nums[j]);
                    nextstart = j;
                    if(nextmaxdis >= nums.size() - 1)
                        return true;
                }
            }
            if(nextstart == i)
                return false;
            i = nextstart;
            curmaxdis = nextmaxdis;
        }
        return false;
    }
    bool XXX(vector<int>& nums) {
        // return dynamicJump(nums);
        return greedyJump(nums);
    }
};