 class Solution {
public:
    vector<vector<int>> ans;
    void dfs(vector<int>& path, vector<int>& visited,vector<int>& nums){
        if(path.size()==nums.size()){
            ans.push_back(path);
            return;
        }
        for(int i=0; i<nums.size(); ++i){
            if(visited[i]==1)
                continue;
            path.push_back(nums[i]);
            visited[i] = 1;
            dfs(path, visited, nums);
            visited[i] = 0;
            path.pop_back();
        }
    }

    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> visited(nums.size(),0);
        vector<int> path;
        dfs(path, visited, nums);
        return ans;
    }
};

