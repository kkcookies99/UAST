 class Solution {
public:
    int ok = 1;
    void dfs(TreeNode *curl,TreeNode *curr){
        if(!curl && !curr) return ;
        else if(curl && curr){
            if(curl->val != curr->val) ok = 0;
            dfs(curl->left,curr->right);
            dfs(curl->right,curr->left);
        }else ok = 0;
    }
    bool XXX(TreeNode* root) {
        dfs(root->left,root->right);
        return ok;
    }
};

