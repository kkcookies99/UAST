 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        sort(nums.begin(), nums.end());
        for(int i = 0; i < nums.size(); ++i) {
            if(i && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;
            int l = i + 1, r = nums.size() - 1;
            while(l < r) {
                int val = nums[l] + nums[r] + nums[i];
                if(val == 0) {
                    ans.push_back({nums[l], nums[r], nums[i]});
                    while(l < r && nums[l+1] == nums[l]) l++;
                    l++;
                }
                else if(val < 0) l++;
                else r--;
            }
        }
        return ans;
    }
};

