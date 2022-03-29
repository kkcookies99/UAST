class Solution {
public:
    bool XXX(vector<int>& nums) {
        // 方法2. 反向遍历 + 贪心算法
        int n = nums.size(), end = n - 1;
        for(int i = n -2; i>=0; --i){
            if(nums[i] >= end - i) end = i;
        }
        if(end > 0) return false;
        else return true;

        // 方法1. 暴力枚举(回溯法)+ 剪枝 【超时】
        helper(nums, 0);
        return is_reach;
    }
private:
    void helper(vector<int>& nums, int start){
        if(start >= nums.size() || nums[start] == 0 || is_reach){
            return;
        }else if(nums[start] >= (nums.size() - start)){
            is_reach = true; 
        }else{
            for(int i = nums[start]; i>=1; --i){
                helper(nums, start + i);
            }
        }
    }
private:
    bool is_reach = false;
};

