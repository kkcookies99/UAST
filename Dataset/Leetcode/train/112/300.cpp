 class Solution {
public:
    bool res = false;
    bool XXX(TreeNode* root, int targetSum) {
        dfs(root, targetSum);
        return res;
    }

    void dfs(TreeNode* node, int targetSum) {
        if(node == nullptr) return ;
        if(node->left == nullptr && node->right == nullptr && targetSum == node->val) {
            res = true;
            return ;
        }

        targetSum -= node->val;
        dfs(node->left, targetSum);
        dfs(node->right, targetSum);
        targetSum += node->val;
    }
};

