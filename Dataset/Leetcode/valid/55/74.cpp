class Solution {
public:
    bool XXX(vector<int>& nums) {
        vector<int> b(nums.size());
        b[0] = nums[0];
        int n = nums.size();
        for (int i = 1 ; i<n;i++){
            if (b[i-1] ==0) return false;
            b[i] = max(b[i-1]-1,nums[i]);
        }
        return true;
    }
};```

