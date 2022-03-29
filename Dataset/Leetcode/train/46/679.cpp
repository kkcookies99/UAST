 class Solution {
public:
    vector<vector<int>> res;
    vector<int> visited;
    vector<int> v;
    vector<vector<int>> XXX(vector<int>& nums) {
        visited = vector<int> (nums.size(),0);
        dfs(nums);
        return res;
    }
    void dfs(vector<int>& nums){
        if(v.size() == nums.size()){
            res.push_back(v);
            return;
        }

        for(int i=0;i<nums.size();i++){
            if(visited[i]) continue;
            v.push_back(nums[i]);
            visited[i] = true;
            dfs(nums);
            visited[i] = false;
            v.pop_back();
        }
    }
};

