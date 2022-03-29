class Solution {
public:
    int XXX(vector<int>& nums) {
        int n = nums.size();
        for(int i = 1; i < n; i++){
            if(nums[i - 1] > 0) nums[i] += nums[i - 1];
        }
        return *max_element(nums.begin(), nums.end());
    }
};

