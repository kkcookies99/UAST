class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> re;
        vector<int> used(nums.size(), 0);
        dfs(res, re, used, nums);
        return res;
    }

    void dfs(vector<vector<int>>& res, vector<int>& re, vector<int>& used, vector<int>& nums)
    {
        if(re.size() == nums.size()) {
            res.push_back(re);
            return;
        }
        for(int i = 0; i < nums.size(); i++) {
            if(used[i] != 0)  continue;
            else {
                re.push_back(nums[i]);
                used[i] = 1;

                dfs(res, re, used, nums);

                re.pop_back();
                used[i] = 0;
            }
        }
    }
};

