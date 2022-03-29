 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int res = 0;
        for(int i=0; i<=res&&i<nums.size(); i++)   res=max(res, i+nums[i]);
        return res>=(nums.size()-1)?true:false;
    }
};

