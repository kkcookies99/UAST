class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n = (int)nums.size(), max_distance = 0;
        for(int i=0;i<n && i<=max_distance;i++){
            max_distance = max(max_distance, i+nums[i]);
            if(max_distance>=n-1) return true;
        }
        return false;
    }
};

