 class Solution {
public:
    bool ans = true;
    long res = LONG_MIN;
    bool XXX(TreeNode* root) {
        dfs(root);
        return ans;
    }

    void dfs(TreeNode * root)
    {
        if(!root) return;

        dfs(root->left);
        
        if(res < root->val){
            res = root->val;
            dfs(root->right);
        }
        else ans = false;      
    }
};

