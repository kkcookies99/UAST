 class Solution {
public:
    
    bool XXX(TreeNode* root) {
    return dfs(root->left,root->right);    
    }

    bool dfs(TreeNode *l,TreeNode *r){
        if(!l&&!r) return 1;
        else if(!l||!r) return 0;
        return dfs(l->left,r->right)&&dfs(l->right,r->left)&&r->val==l->val;
    }




};

