class Solution {
public:
    vector<vector<int>> res;
    vector<int> vi;
    vector<vector<int>> XXX(vector<int>& nums) {
        func(nums, 0, 0);
        return res;
    }
    
    void func(vector<int>& nums, int count, int k)
    {
        if (count <= nums.size())
        {
            res.push_back(vi);
        }
        if (count == nums.size())
            return;
        for (int i = k; i < nums.size(); ++i)
        {
            vi.push_back(nums[i]);
            func(nums, count + 1, ++k);
            vi.pop_back();
        }
    }
};

