class Solution {
public:
    int XXX(TreeNode* root) {
        // 如果是叶结点，返回 0
        if (!root) return 0;
        // 如果左子树为空，返回右子树的最小高度 + 1
        else if (!root -> left) return XXX(root -> right) + 1;
        // 如果右子树为空，返回左子树的最小高度 + 1
        else if (!root -> right) return XXX(root -> left) + 1;
        // 否则返回子女的最小高度 + 1
        return min(XXX(root -> left) + 1, XXX(root -> right) + 1);
    }
};

