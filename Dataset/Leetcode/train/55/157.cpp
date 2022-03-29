class Solution {
public:
    int n;
    vector<bool> v;
    int ans = false;
    bool XXX(vector<int>& nums) {
        if(nums.size() == 1) return true;
        n = nums.size() - 1;
        v = vector<bool>(n, true);
        dfs(nums, 0);
        return ans;
    }

    void dfs(vector<int>& nums, int idx){
        if(!v[idx] || ans) return;
        if(idx == n){
            ans = true;
            return;
        }
        for(int i = 1; i <= nums[idx]; i ++)
            dfs(nums, idx + i);
        if(!ans) v[idx] = false;
    }
};

