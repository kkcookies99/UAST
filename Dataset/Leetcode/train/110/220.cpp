class Solution {
public:
    int ok = 1;
    int dfs(TreeNode* cur){
        if(!cur) return NULL;
        int len1 = 0,len2 = 0;
        if(cur->left) len1 = dfs(cur->left);
        if(cur->right) len2 = dfs(cur->right);
        if(abs(len1 - len2) > 1) ok = 0;
        return 1 + max(len1,len2);
    }
    bool XXX(TreeNode* root) {
        dfs(root);
        return ok;
    }
};

