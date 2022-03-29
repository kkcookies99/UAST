 class Solution {
public:
    vector<vector<int>> ans;
    void dfs(vector<int>& nums, int n, int x){
        if(x == n){
            ans.push_back(nums);
            return;
        }
        for(int i = x; i < n; i++){
            swap(nums[i], nums[x]);
            dfs(nums, n, x + 1);
            swap(nums[i], nums[x]);
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(nums, nums.size(), 0);
        return ans;
    }
};

