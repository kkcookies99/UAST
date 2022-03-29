class Solution {
public:
    bool XXX(vector<int>& nums) {
        int maxlen = 0, len = nums.size();
        for(int i = 0; i < len; i++)
        {
            if(maxlen < i) return false;
            maxlen = max(maxlen, i + nums[i]);
        }
        return maxlen >= len - 1;
    }
};

