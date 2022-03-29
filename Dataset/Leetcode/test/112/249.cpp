 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        return dfs(root, targetSum);
    }

    // 前序dfs。从根节点开始，递归判断左子树|右子树是否存在符合的路径
    bool dfs(TreeNode* root, int targetSum) {
        // base case
        if(!root) return false;
        // 必须是到叶子结点的路径
        if(!root->left && !root->right) return targetSum == root->val;
        return dfs(root->left, targetSum - root->val) || dfs(root->right, targetSum - root->val);
    }
};

