class Solution {
public:
    vector<vector<int>> rets;

    void backtrack(vector<int>& nums,int index)
    {
        if(index == nums.size())
        {
            rets.push_back(nums);
            return;
        }

        for(int i = index;i < nums.size();i++)
        {
            swap(nums[i],nums[index]);
            backtrack(nums,index+1);
            swap(nums[i],nums[index]);
        }
    }

    vector<vector<int>> XXX(vector<int>& nums) {
        backtrack(nums,0);
        return rets;
    }
};

