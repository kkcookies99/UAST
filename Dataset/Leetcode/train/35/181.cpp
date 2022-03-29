 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int position = lower_bound(nums.begin(),nums.end(),target)-nums.begin();
        return position;
    }
};

