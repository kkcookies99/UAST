class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> ele;
        dfs(0,nums,res,ele);
        return res;
    }
    
    void dfs(int i,vector<int>& nums,vector<vector<int>> & res,vector<int> ele)
    {
        int len=nums.size();
        if(i>=len)
        {
            res.push_back(ele);
            return ;
        }
        dfs(i+1,nums,res,ele);
        ele.push_back(nums[i]);
        dfs(i+1,nums,res,ele);
    }
};

