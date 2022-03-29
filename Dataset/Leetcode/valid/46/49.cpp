class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>>res;
        vector<int>vis(nums.size(),0);
        dfs(res,{},nums,vis);
        return res;
    }
    void dfs(vector<vector<int>>& res,vector<int> path,vector<int>& nums,vector<int>& vis){
        if(path.size()==nums.size()){
            res.push_back(path);
            return;
        }
        for(int i=0;i<nums.size();i++){
            if(vis[i]) continue;
            vis[i]=1;
            path.push_back(nums[i]);
            dfs(res,path,nums,vis);
            path.pop_back();
            vis[i]=0;
        }
    }
};

