 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result;
        result.push_back({});
        for(int i = 0; i < nums.size(); ++i){
            result.push_back({nums[i]});
            int t = result.size()-1;
            for(int k = 0; k < t; ++k){
                result.push_back(result[k]);
                result[result.size()-1].push_back(nums[i]);
            }
        }
        result.erase(unique(result.begin(),result.end()),result.end());
        return result;
    }
};

