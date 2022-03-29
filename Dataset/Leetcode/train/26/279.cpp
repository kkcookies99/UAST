 class Solution {
public:
    int XXX(vector<int>& nums) {
        nums.erase(unique(nums.begin(),nums.end()),nums.end());
        return nums.size();
    }
};

