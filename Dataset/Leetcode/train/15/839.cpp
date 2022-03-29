 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        sort(nums.begin(), nums.end());
        int k = nums.size() - 1;
        for(int i = 0; i < nums.size(); i++) {
            k = nums.size() - 1;
            if(i>0&&nums[i]==nums[i-1])continue;
            for(int j = i+1; j < nums.size(); j++) {
                if(j>i+1&&nums[j]==nums[j-1])continue;
                while(k > j && nums[k] > -nums[i]-nums[j]) k--;
                if(k <= j) break;
                if(nums[k] + nums[i] + nums[j] == 0) {
                    ans.push_back(vector<int>{nums[i],nums[j],nums[k]});
                }
            }
        }
        return ans;
    }
};

