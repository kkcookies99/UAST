 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> item;
        res.push_back(item);
        generate(0, nums, item, res);
        return res;        
    }
private:
    void generate(int i, vector<int> &nums, vector<int> &item, vector<vector<int>> &res)
    {
        if(i >= nums.size())  return;
        item.push_back(nums[i]);
        res.push_back(item);
        generate(i + 1, nums, item, res);
        item.pop_back();
        generate(i + 1, nums, item, res);
    }
};

