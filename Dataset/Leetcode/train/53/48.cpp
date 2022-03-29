class Solution {
public:
//2.动态规划：若前一个元素大于0，则将其加到当前元素上改变当前元素的值。
//时间复杂度：O(N);
    int XXX(vector<int>& nums) {
        int ans = nums[0];//初始值不能为0；
        int len = nums.size();
        if(len == 1) return nums[0];
        for(int i = 0; i < len; i++) {
            if(i > 0 && nums[i - 1] > 0) {
                nums[i] = nums[i] + nums[i - 1];
            }
            ans =  max(ans, nums[i]);
        }
        return ans;
    }
};

