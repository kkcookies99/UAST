class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        // 前序遍历
        if (root==nullptr) return false;
        // 到达叶子节点
        if (root->left==nullptr && root->right==nullptr && targetSum==root->val) return true;
        
        return XXX(root->left, targetSum-root->val) || XXX(root->right, targetSum-root->val);
    }
};

