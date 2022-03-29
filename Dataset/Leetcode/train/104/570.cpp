class Solution {
public:
    int XXX(TreeNode* root) {
        return dfs(root);
    }
    int dfs(TreeNode* root){
        if(!root)return 0;
        return max(dfs(root->left),dfs(root->right))+1;
    }
};

