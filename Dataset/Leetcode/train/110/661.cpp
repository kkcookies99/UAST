 class Solution {
public:
    int dfs(TreeNode* root){
        if(!root) return 0;
        return max(dfs(root->left),dfs(root->right))+1;
    }
    bool XXX(TreeNode* root) {
        if(!root) return true;
        return XXX(root->left)&&XXX(root->right)&&abs(dfs(root->left)-dfs(root->right))<=1;
    }
};

