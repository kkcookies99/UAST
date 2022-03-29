class Solution {
public:
    bool flag=true;
    bool XXX(TreeNode* root) {
        int l=dfs(root);
        return flag;
    }
    int dfs(TreeNode* root){
        if(root==NULL) return 0;
        int l=dfs(root->left);
        int r=dfs(root->right);
        if(abs(l-r)>1)  flag=false;
        return max(l,r)+1;
    }
};

