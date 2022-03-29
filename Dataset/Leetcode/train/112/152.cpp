class Solution {
public:
    bool XXX(TreeNode* root, int target) {
        return dfs(root, target);        
    }
    
    bool dfs(TreeNode* root, int target) {
        if(!root) return false;
        target -= root->val;
        if(root && !root->left && !root->right) {
            return target == 0;
        }
        return dfs(root->left, target) || dfs(root->right, target);
    }
};

