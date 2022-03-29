 class Solution {
public:
    vector<vector<int>> res;
    vector<int> temp;
    
    void backTracing(vector<int> & nums, int begin)
    {
        if(temp.size() <= nums.size()){
            res.push_back(temp);
        }
        for(int i=begin; i<nums.size(); i++)
        {
            temp.push_back(nums[i]);
            backTracing(nums, i+1);
            temp.pop_back();
        }
    }
    
    vector<vector<int>> XXX(vector<int>& nums) {
        res.clear();
        temp.clear();
        backTracing(nums, 0);
        return res;
    }
};

