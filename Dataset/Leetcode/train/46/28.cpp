class Solution {

    vector<vector<int>> res; //所有可能的结果态
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> oneResult;//状态
        backTrace(oneResult, nums);
        return res;

    }

    void backTrace(vector<int>& oneResult, vector<int>& nums)
    {
        if (oneResult.size() == nums.size())
        {//到达结果态
            res.emplace_back(oneResult);
            return ;
        }

        int i = oneResult.size();//在状态的第几层

        for (int k = i; k < nums.size(); k++)
        {
            swap(nums[i], nums[k]);
            oneResult.emplace_back(nums[i]);
            backTrace(oneResult, nums);
            swap(nums[i], nums[k]);
            oneResult.pop_back();
        }


    }
};

