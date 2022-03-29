 class Solution {
public:
    TreeNode* pre = NULL; // 用来记录前一个节点
    bool XXX(TreeNode* root) {
        if (root == NULL) return true;
        bool left = XXX(root->left);

        if (pre != NULL && pre->val >= root->val) return false;
        pre = root; // 记录前一个节点

        bool right = XXX(root->right);
        return left && right;
    }
};

