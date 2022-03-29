class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.empty()) return {};
        vector<vector<int>> ans;
        vector<int> tmp;
        function<void(int)> dfs = [&](int start){
            ans.push_back(tmp);
            for(int i = start; i < nums.size(); ++i) {
                tmp.push_back(nums[i]);
                dfs(i+1);
                tmp.pop_back();
            }
        };
        dfs(0);
        return ans;
    }
};

