 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int res = 0;
        for(int i=0;i<nums.size();i++)
        {
            if(i > res && i < nums.size()) return false;
            if(i <= res) res = max(res,i + nums[i]);
            if(res >= nums.size() - 1) return true;
        }
        return false;
    }
};

