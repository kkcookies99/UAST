 class Solution {
public:
    bool XXX(vector<int>& nums) {
        // greedy algorithm
        int reachable = nums[0];
        for(int  i = 0; i < nums.size(); i++){
            if(i > reachable) return false;
            reachable = max(nums[i]+i,reachable);
        }
        return true;
    }
};

