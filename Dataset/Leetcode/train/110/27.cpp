class Solution {
    // 自底向上求树高，-1代表不是平衡树
    int dfs(TreeNode* root) {
        if (!root)   return 0;
        int ldepth = dfs(root->left);
        // 左子树不是平衡树，不平衡
        if (ldepth == -1)    return -1;
        int rdepth = dfs(root->right);
        // 右子树不是平衡树，不平衡
        if (rdepth == -1)   return -1;
        // 左右子树高度差超过1，也不平衡
        if(abs(ldepth - rdepth) > 1)    return -1;
        // 是平衡树，返回高度
        return max(ldepth, rdepth) + 1;
    }
public:
    bool XXX(TreeNode* root) {
        return dfs(root) != -1;
    }
};

