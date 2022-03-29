class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n = nums.size();

        int loc = nums[0];
        for(int i = 0; i < n; ++i){
            if(i > loc) return false;
            if(i+nums[i] > loc) loc = i+nums[i];
            if(loc >= n-1)    return true;
        }
        return false;
    }
};

