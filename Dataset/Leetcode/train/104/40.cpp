class Solution {
public:
    int dfs(TreeNode* root, int d){
        if(!root) return d;
        return max(dfs(root->left, d + 1), dfs(root->right,d + 1));
    }
    int XXX(TreeNode* root) {
        return dfs(root, 0);
    }
};

