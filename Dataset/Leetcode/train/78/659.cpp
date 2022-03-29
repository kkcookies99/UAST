 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> tmp;
        ans.push_back({});
        dfs(ans,tmp,nums,0);
        return ans;
    }
    void dfs(vector<vector<int>> &ans, vector<int> &tmp, vector<int>& nums, int begin){
        if(begin==nums.size()){
            return;
        }        
            vector<int> t = tmp;
            dfs(ans,t,nums,begin+1);
            t.push_back(nums[begin]);
            ans.push_back(t);
            dfs(ans,t,nums,begin+1);
        return;
    }
};

