class Solution {
public:
    vector<vector<int>> ans;
    vector<int> depth;

    void backtrack(vector<int>&nums, vector<bool>&vis){
        if(depth.size() == nums.size()){
            ans.push_back(depth);
            return;
        }
        for(int i = 0; i < nums.size(); i++){
            if(vis[i] == 1) continue;
            vis[i] = 1;
            depth.push_back(nums[i]);
            backtrack(nums, vis);
            depth.pop_back();
            vis[i] = 0;
        }
    }

    vector<vector<int>> XXX(vector<int>& nums) {
        // ans.clear();
        // depth.clear();
        vector<bool> vis(nums.size(), 0);
        backtrack(nums,vis);

        return ans;
    }
};

