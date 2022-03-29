class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
    vector<vector<int>> res;
    vector<int> tmp;
    help(res,nums,tmp,0);
    return res;
    }
    void help(vector<vector<int>>&res,vector<int>& nums,vector<int>&tmp,int start)
    {
        res.push_back(tmp);
        for(int i = start;i<nums.size();++i)
        {
            tmp.push_back(nums[i]);
            help(res,nums,tmp,i+1);
            tmp.pop_back();
        }
        return;
    }
};```

