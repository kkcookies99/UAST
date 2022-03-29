class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        const int n = nums.size();
        vector<vector<int>> res;
        auto dfs = [&]() -> void
        {
            vector<int> temp;
            auto realDfs = [&](int usedNums, auto& func) -> void
            {
                if(temp.size() == n)
                {
                    res.push_back(temp);
                }

                for(int i = 0; i < n; ++i)
                {
                    if(usedNums& (1 << i)) continue;

                    temp.push_back(nums[i]);
                    func(usedNums | (1 << i), func);
                    temp.pop_back();
                }
            };

            realDfs(0, realDfs);
        };

        dfs();

        return res;
    }
};

