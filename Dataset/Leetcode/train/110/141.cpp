class Solution {
public:
    int dfs(TreeNode* root) {
        if(!root) return 0;
        return max(dfs(root->left), dfs(root->right)) + 1;
    }
    bool XXX(TreeNode* root) {
        if(root == nullptr) return true;
        int l = dfs(root->left), r = dfs(root->right);
        if(abs(l-r) <= 1) {
           return XXX(root->left) && XXX(root->right);
        } 
        return false;
    }
};

