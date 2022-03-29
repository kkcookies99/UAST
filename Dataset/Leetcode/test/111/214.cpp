class Solution {
public:
    int res = INT_MAX;
    int XXX(TreeNode* root) {
        if(root == nullptr) return 0;
        if(!root->left && !root->right) return 1;
        dfs(root->left, 2);
        dfs(root->right, 2);
        return res;
    }
    void dfs(TreeNode* cur, int depth) {
        if(cur == nullptr) return ;
        if(cur->left) dfs(cur->left, depth + 1);
        if(cur->right) dfs(cur->right, depth + 1);
        if(!cur->left && !cur->right) res = min(res, depth);
    }
};

