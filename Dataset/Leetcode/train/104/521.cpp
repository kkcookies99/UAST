class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root) return 0; // 空节点
        return max(XXX(root->left), XXX(root->right)) + 1; // 左右子树最大高度+1
    }
};

