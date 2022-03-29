class Solution {
public:
    int ok=1;
    int dfs(TreeNode *node){
        if(!node) return 0;
        int l=dfs(node->left);
        int r=dfs(node->right);
        if(abs(r-l)>1) ok=0;
        return max(l,r)+1;
    }
    bool XXX(TreeNode* root) {
        dfs(root);
        return ok;
    }
};

