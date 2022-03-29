class Solution {
public:
    int getDepth(TreeNode* cur) {
        // 终止条件，左右子树都为空（叶子节点）
        if (!cur->left && !cur->right)
            return 1;
        // 当遇到一边为空另一边不空时，让空的那一侧高度为极大值，这样不会考虑它
        int left = INT_MAX, right = INT_MAX;
        // 后序遍历 左、右、根
        if (cur->left) 
            left = getDepth(cur->left);
        if (cur->right) 
            right = getDepth(cur->right);
        int level = min(left, right);
        // 返回高度（子树最小高度 + 自身高度(1)）
        return 1 + level;
    }

    int XXX(TreeNode* root) {
        if (!root)
            return 0;
        else
            return getDepth(root);
    }
};

