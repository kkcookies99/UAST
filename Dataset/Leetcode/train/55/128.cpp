class Solution {
public:
    bool XXX(vector<int>& nums) {
        int target = nums.size() - 1; //设置初始终点
        for(int i = nums.size() - 1; i >= 0; i--)//倒序遍历
        {
            if(nums[i] >= target - i) target = i;//更新终点
        }
        return target == 0; //若回到了起点则代表可以跳跃
    }
};

