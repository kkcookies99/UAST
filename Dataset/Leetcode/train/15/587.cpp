 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        sort(nums.begin(), nums.end());
        for(int i=0; i<nums.size(); i++) {
            if(i&&nums[i] == nums[i-1]) continue;
            for(int j=i+1, k= nums.size()- 1; j<k; j++) {
                if(j >i+1 && nums[j] == nums[j-1]) continue;
                while(j < k && nums[i] + nums[j] + nums[k] > 0) k--;
                if(j == k) continue;
                if(nums[i] + nums[j] + nums[k] == 0) {
                    res.push_back({nums[i], nums[j], nums[k]});
                }
            }
        }
        return res;
    }
};

