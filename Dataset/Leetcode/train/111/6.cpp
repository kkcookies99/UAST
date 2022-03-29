class Solution {
public:
    int XXX(TreeNode* root) {
        // 判断是不是空树，只有第一次有用，后面递归用不到
        if (!root)   return 0;
        // 叶子节点，深为1
        if (!root->left && !root->right) return 1;
        // 左空右不空，返回右子树深度+1
        if (!root->left)    return XXX(root->right) + 1;
        // 右空左不空，返回左子树深度+1
        if (!root->right)   return XXX(root->left) + 1;
        // 左右都不空，返回左右子树深度较小值+1
        return min(XXX(root->left), XXX(root->right)) + 1;
    }
};

