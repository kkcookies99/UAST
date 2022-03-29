class Solution {
public:
    // 返回以该节点为根节点的二叉树的高度，如果不是二叉搜索树了则返回-1
    int getDepth(TreeNode* node) {
        if (node == NULL) {
            return 0;
        }
        int leftDepth = getDepth(node->left);
        if (leftDepth == -1) return -1; // 说明左子树已经不是二叉平衡树
        int rightDepth = getDepth(node->right);
        if (rightDepth == -1) return -1; // 说明右子树已经不是二叉平衡树
        return abs(leftDepth - rightDepth) > 1 ? -1 : 1 + max(leftDepth, rightDepth);
    }
    bool XXX(TreeNode* root) {
        return getDepth(root) == -1 ? false : true;
    }
};

