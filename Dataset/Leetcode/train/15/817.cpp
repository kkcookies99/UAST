 class Solution {
public:
    vector<vector<int>> res;
    vector<int> vec;
    void dfs(vector<int> nums, int i)
    {
        if(accumulate(vec.begin(), vec.end(), 0) == 0 && vec.size() == 3)
        {
            res.push_back(vec);
            return;
        }
        if(vec.size() == 3 || i == nums.size())
            return;

        vec.push_back(nums[i]);
        dfs(nums, i + 1);

        vec.pop_back();
        dfs(nums, i + 1);
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        
        sort(nums.begin(), nums.end());
        dfs(nums, 0);
        set<vector<int>> s;
        for(auto a : res)
            s.insert(a);
        res.clear();
        for(auto a : s)
            res.push_back(a); 
        return res;
    }
};

