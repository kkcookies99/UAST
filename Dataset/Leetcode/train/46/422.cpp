 class Solution {
public:
    vector<vector<int>> res;

    void dfs(vector<int> nums, int j, vector<int> vec)
    {   
        if(j >= 0)
            nums.erase(nums.begin() + j);
        if(nums.size() == 0)
        {
            res.push_back(vec);
            return;
        }
        for(int i = 0; i < nums.size(); i++)
        {
            vec.push_back(nums[i]);
            dfs(nums, i, vec);
            vec.pop_back();
        }
    }

    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(nums, -1, {});
        return res;
    }
};

