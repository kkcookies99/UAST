class Solution {
public:
    int dfs(TreeNode*root){
        if(root==nullptr)return 1;
        int left=dfs(root->left);
        int right=dfs(root->right);
        int height=max(left,right)+1;
        return height;
    }
    bool XXX(TreeNode* root) {
    if(root==nullptr)return true;
    if(abs(dfs(root->left)-dfs(root->right)>1))return false;
    return XXX(root->left)&&XXX(root->right);
    }
};

