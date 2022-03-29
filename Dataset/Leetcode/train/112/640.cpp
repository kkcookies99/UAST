 class Solution {
public:
    /* DFS - 递归算法 */
    bool XXX(TreeNode* root, int sum) {
        /* 空树 */
        if (!root)
            return false;
            //return (sum == 0);
        /* 叶子节点 */
        if (!root->left && !root->right)
            return (sum == root->val);
        /* 处理左子树 */
        if (root->left && XXX(root->left, sum - root->val))
            return true;
        /* 处理右子树 */
        if (root->right && XXX(root->right, sum - root->val))
            return true;

        return false;
    }
};

