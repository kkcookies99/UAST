class Solution {
public:
    // greedy O(n)
    bool XXX(vector<int>& nums) {
        auto len = nums.size();
        if(len < 2) return true;
        int max_reach = 0;
        for(int i = 0; i < len - 1; i++)
        {
            if(i > max_reach) return false;
            max_reach = max(i + nums[i], max_reach);
            if(max_reach >= (len - 1)) return true;
        }
        return max_reach >= (len - 1);
    }
};

