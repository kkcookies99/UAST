class Solution {
public:
    int dfs(TreeNode* root){
        int lh = 0;
        int rh = 0;
        if(root->left != NULL) lh = dfs(root->left);
        if(root->right != NULL) rh = dfs(root->right);
        if(lh == -1 || rh == -1 || abs(lh-rh) > 1) return -1;
        return max(lh,rh) + 1;
    }
    bool XXX(TreeNode* root) {
        if(root == NULL || dfs(root) != -1)return 1;
        return 0;
    }
};

