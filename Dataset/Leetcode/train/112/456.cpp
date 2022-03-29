 class Solution {
public:
    bool ans = false;
    bool XXX(TreeNode* root, int sum) {
        if(!root) return false;
        dfs(root, sum);
        return ans;
    }

    void dfs(TreeNode* root, int sum){
        sum -= root->val;
        if(sum == 0 && !root->left && !root->right)
            ans = true;
        if(root->left) dfs(root->left, sum);
        if(root->right) dfs(root->right, sum);
    }
};

