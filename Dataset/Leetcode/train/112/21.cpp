class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        // 到空节点有两种情况
        // 如果是非叶子节点的空节点，这条路径都不包含叶子节点，当然不满足
        // 如果是叶子结点的空节点，说明到叶子节点是没有返回true，继续递归，那也不满足
        if (!root)  return false;
        // 此处如果不返回true会继续递归到空节点
        if (!root->left && !root->right)    return targetSum == root->val;
        return XXX(root->left, targetSum - root->val) || XXX(root->right, targetSum - root->val);
    }
};

