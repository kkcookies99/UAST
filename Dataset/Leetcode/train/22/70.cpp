 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> ans;
        string s;
        dfs(ans, n, 0, 0, s);
        return ans;
    }

    void dfs(vector<string>& nums, int n,int left, int right, string s) {
        if (left > n || right > n || right > left)
            return;
        if (right == n ) {
            nums.push_back(s);
            return;
        }
       
        dfs(nums, n, left+1, right, s+'(');
        dfs(nums, n, left, right+1, s+')');
    }
};

