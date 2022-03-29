class Solution {
public:
    vector<vector<int>> rets;
    vector<int> ret;

    void backtrack(vector<int>& nums,int index)
    {
        if(index == nums.size())
        {
            rets.push_back(ret);
            return;
        }

        for(int i = 0;i < nums.size();i++)
        {
            if(find(ret.begin(),ret.end(),nums[i]) != ret.end()) continue;
            ret.push_back(nums[i]);
            backtrack(nums,index+1);
            ret.pop_back();
            
        }
    }

    vector<vector<int>> XXX(vector<int>& nums) {
        backtrack(nums,0);
        return rets;
    }
};

