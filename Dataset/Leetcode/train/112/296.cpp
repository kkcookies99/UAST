 class Solution {
public:
    //递归法
    bool XXX1(TreeNode* root, int targetSum) {
        if(root == NULL)    return false;
        if(root->left == NULL && root->right == NULL)   return root->val == targetSum;
        return (XXX(root->left, targetSum-root->val)) || (XXX(root->right, targetSum-root->val));
    }
    //dfs法
    bool dfs(TreeNode* root, int targetSum, int curSum){
        if(root == NULL)    return false;
        if(root->left == NULL && root->right == NULL)   return curSum + root->val == targetSum;
        return dfs(root->left, targetSum, curSum + root->val) || dfs(root->right, targetSum, curSum + root->val);
    }
    bool XXX(TreeNode* root, int targetSum) {
        return dfs(root, targetSum, 0);
    }
};

