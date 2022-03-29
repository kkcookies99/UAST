class Solution {
public:
    vector<vector<int>> res;
    vector<int> tmp;
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.size()==0)
            return {};
        res.push_back({});
        dfs(res,nums,tmp,0);
        return res;
    }

    void dfs(vector<vector<int>>& res,vector<int>& nums,vector<int>& tmp,int deep){
        if(deep==nums.size())
            return;

        for(int i=deep;i<nums.size();++i){
            tmp.push_back(nums[i]);
            res.push_back(tmp);
            dfs(res,nums,tmp,i+1);
            tmp.pop_back();
        }
    }
};

