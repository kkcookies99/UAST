class Solution {
    vector<vector<int>> res;

    void dfs(int index, const vector<int>& nums, vector<int>& vec) {
        res.push_back(vec);

        for (int i = index; i < nums.size(); i++) {
            vec.push_back(nums[i]);
            dfs(i + 1, nums, vec);
            vec.pop_back();
        }
    }

public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> vec;
        dfs(0, nums, vec);

        return res;
    }
};

