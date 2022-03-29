 class Solution {
public:
    int last,tag = 0,ok = 1;
    void dfs(TreeNode *cur){
        if(!cur) return ;
        if(cur->left) dfs(cur->left);
        if(tag && cur->val <= last) ok = 0;
        tag = 1;
        last = cur->val;
        if(cur->right) dfs(cur->right);
    }
    bool XXX(TreeNode* root) {
        dfs(root);
        return ok;
    }
};

