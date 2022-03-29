class Solution {
public:
    int ans = INT_MAX;
    int XXX(TreeNode* root) {
        if(!root) return 0;
        dfs(root, 1);
        return ans;
    }
    void dfs(TreeNode* root, int lev){
        if(!root) return;
        if(lev >= ans) return;   //加了这一行来剪枝优化，从16ms降到了8ms
        if(!root->left && !root->right) ans = min(ans, lev);
        dfs(root->left, lev + 1);
        dfs(root->right, lev + 1);
    }
};

