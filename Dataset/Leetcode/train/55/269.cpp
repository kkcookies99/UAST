class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n = nums.size();
        int end = 0;
        for(int i = 0; i<n; i++){
            if(end < i) return false;
            end = max(end,i + nums[i]);
        }
        return true;
    }
};

