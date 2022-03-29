 class Solution {
public:
    int XXX(vector<int>& nums) {
        int sum = 0;//sum是待选的连续子数组，这个sum只能大于等于0才对求解有意义
        int ans = INT_MIN;//ans保存当前已遍历过的最大连续子数组和
        if (nums.size() == 1) 
            return nums[0];
        for (auto a : nums) {
            sum = sum + a >= 0 ? sum + a : 0;//sum>=0,更新；<0，归零
            ans = a >= 0 ? max(ans,sum) : max(ans,a);
            //a>=0，判断更新后的sum是不是最大的和
            //a<0，更新后的sum必不可能最大；考虑全负数情况a也要加入判断
        }
        return ans;
    }
};

