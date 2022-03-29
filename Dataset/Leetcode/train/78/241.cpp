class Solution {
public:
    vector<vector<int>> res;
    int n;
    vector<vector<int>> XXX(vector<int>& nums) {
        n=nums.size();
        vector<int> tmp;
        dfs(nums,tmp,0);
        return res;
    }
    void dfs(vector<int>& nums, vector<int>& tmp, int cur){
        if(cur==n){
            res.push_back(tmp);
            return;
        }
        tmp.push_back(nums[cur]);
        dfs(nums,tmp,cur+1);
        tmp.pop_back();
        dfs(nums,tmp,cur+1);
    }
};

