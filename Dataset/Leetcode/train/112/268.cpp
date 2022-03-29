 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        int sum = 0;
        return dfs(root, sum, targetSum);
    }

    bool dfs(TreeNode* root, int sum, int target){
        if(!root) return false;
        sum += root->val;
        if(sum == target && !root->left && !root->right) return true;
        return dfs(root->left, sum, target) || dfs(root->right, sum, target);
    }
};

